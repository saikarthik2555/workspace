package pointer_approach;

public class SquaresOfSortedArray {
	public static void main(String[] args) {
		//[-4,-1,0,3,10]
		//
	}
}

class Solutionn {
    public int[] sortedSquares(int[] nums) {
        int left=0,right =nums.length-1;
        int index=right,ans[]=new int[nums.length];
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            ans[index--]=nums[left]*nums[left++];
            else {
                ans[index--]=nums[right]*nums[right--];
            }
        }
        return ans;
    }
}