package pointer_approach;


public class SumOfArrays{
	public static void main(String[] args) {
		System.out.println(new Solutionnn().sum(new int[] {2,3,4,5,6}, 5));
	}
}
class Solutionnn {
    int sum(int arr[], int n) {
    //     int total=0;
	   // for(int s: arr){
	   //     total+=s;
	   // }
	    //return total;  // code here
	    int total=0;
	 //   for(int i=0,j=arr.length-1; i< arr.length;++i,--j){
	    int i=0,j=n-1;
	        while(i<=j){
	            total+=arr[i]+arr[j];
	            ++i; --j;
	            }
	            if(n%2==1){
	                total-=arr[n/2];
	            }
	            
	    return total;
	    }
}