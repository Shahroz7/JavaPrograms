package AdvanceSet;

public class RabinKarp {

	// Function to search for a pattern in a text using Rabin-Karp algorithm
	public static void search(String pattern, String text) {
		int prime = 101; // A prime number
		int d = 256; // Number of characters in the input alphabet
		int M = pattern.length();
		int N = text.length();
		int patternHash = 0; // Hash value for the pattern
		int textHash = 0; // Hash value for the current window of the text
		int h = 1;

		// Calculate the hash value of the pattern and the initial window of the text
		for (int i = 0; i < M - 1; i++) {
			h = (h * d) % prime;
		}
		for (int i = 0; i < M; i++) {
			patternHash = (d * patternHash + pattern.charAt(i)) % prime;
			textHash = (d * textHash + text.charAt(i)) % prime;
		}

		// Slide the pattern over the text one by one
		for (int i = 0; i <= N - M; i++) {
			// If the hash values match, perform a full comparison of the pattern with the
			// current window of the text
			if (patternHash == textHash) {
				int j;
				for (j = 0; j < M; j++) {
					if (text.charAt(i + j) != pattern.charAt(j))
						break;
				}
				if (j == M)
					System.out.println("Pattern found at index " + i);
			}

			// Calculate the hash value for the next window of the text
			if (i < N - M) {
				textHash = (d * (textHash - text.charAt(i) * h) + text.charAt(i + M)) % prime;
				if (textHash < 0)
					textHash += prime;
			}
		}
	}

	public static void main(String[] args) {
		String text = "AABAACAADAABAABA";
		String pattern = "AABA";
		search(pattern, text);
	}
}
