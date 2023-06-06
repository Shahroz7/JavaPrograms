package AdvanceSet;

public class HouseRobber {
	
	private Integer[]dp;
	//int wealth[] = {3,6,2,9,4,7};
	
	public int rob(int[] nums) {
		dp= new Integer[nums.length];
		return robFrom(nums,0);
	}
	
	private int robFrom(int [] wealth, int currentindex) {
		if(currentindex >= wealth.length)
			return 0;
		if(dp[currentindex]!=null)
			return dp[currentindex];
		
		int stealCurrent = wealth[currentindex]+ robFrom(wealth, currentindex+2);
		int skipCurrent= wealth[currentindex] + robFrom(wealth,currentindex+1);
		
		return dp[currentindex] = Math.max(stealCurrent, skipCurrent);
	}
	
	public static void main(String[]args) {
		
		int wealth[]= {5,10,10,100,10,5};
		
	}

}


