package pointer_approach;

public class MinAndMaxInArray {

}

class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        
    //     LongStream i1=Arrays.stream(a);
    //     long l1=i1.min().getAsLong();
    //     // LongStream i2=Arrays.stream(a);
    //     // long i2=i2.max().getAsLong();
    // return new Pair(l1,Arrays.stream(a).min().getAsLong());
    long mini= a[0],maxi=a[0];
    int i=0,j=a.length-1;
    while(i<=j){
        if(mini > a[i]) mini=a[i];
        if(mini > a[j]) mini=a[j];
        if(maxi < a[i]) maxi=a[i];
        if(maxi < a[j]) maxi=a[j];
        ++i;  --j;
        }
    
    return new Pair(mini,maxi);
    }
}
