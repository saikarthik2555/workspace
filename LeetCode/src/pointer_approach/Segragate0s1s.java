package pointer_approach;

public class Segragate0s1s {
	public static void main(String[] args) {
	System.out.println(segragateOs1s(new int[]{0,0,0,0,1,1,0,0},1));
	}
	public static int[] segragateOs1s(int arr[],int n) {
		int zero=0,one=0;
		while(zero<n && one <n) {
			for(;zero<n && arr[zero]==0;++zero);
			for(one=zero+1;one<n&&arr[one]==1;++one);
			if(zero<n && one<n) {
				arr[zero++]=0;
				arr[one++]=1;
			}
			
	}
		return arr;
	}
}
