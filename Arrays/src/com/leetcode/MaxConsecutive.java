
package com.leetcode;

public class MaxConsecutive {
	    public static int findMaxConsecutiveOnes(int[] nums) {
	        int count=0,max=0;
	        for(int i=0;i<nums.length;++i) {
	        	if(nums[i]==1) {
	        		++count;
	        	}
	        	else {
	        		max=Integer.max(count, max);	//for max
	        		count=0;
	        	}
	        }
	        return Integer.max(max, count);
	    }
public static void main(String[] args) {	
	int arr[]= {1,1,0,1,0,1};
	System.out.println(findMaxConsecutiveOnes(arr));
	}
}
