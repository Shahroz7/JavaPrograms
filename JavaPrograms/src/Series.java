
public class Series {
	public static void main(String[]args){
		final int n=15;
		int i=1;
		int cnt=1;
		boolean ltr=true;
		while(i<n){
			String s=" ";
			if(ltr)
				for(int j=0;j<cnt;j++)
					s=s+(s.length() > 0 ? "*" : "")+i++;
			else
				for(int j=0;j<cnt;j++)
					s=i++ +(s.length() > 0 ? "*" : "")+s;
			cnt++;
			ltr=!ltr;
			System.out.println(s);
		}
	}
}
