package Arrays;

import java.util.Arrays;
import java.util.stream.LongStream;

public class Frequency 
{
    static Pair getMinMax(long a[], long n)  
    {
        long mini=a[0];
        LongStream ee = Arrays.stream(a);
        Long num=ee.min().getAsLong();
        long maxi=a[0];
        for(long i=0;i<6;i++){
          mini=Integer.MIN_VALUE(mini,a[i]);
        maxi=Integer.MAX_VALUE(maxi,a[i]);
            
        }
        return new Pair(mini,maxi);
    }
}
