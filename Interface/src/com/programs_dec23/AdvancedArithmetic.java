package com.programs_dec23;

public interface AdvancedArithmetic {
	public abstract int divisorSum(int n);
	
}

class MyCalculator implements AdvancedArithmetic {
	@Override
	public int divisorSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
		if(n%i==0) {
			sum+=i;
		}
		}
		return sum;
	}

}