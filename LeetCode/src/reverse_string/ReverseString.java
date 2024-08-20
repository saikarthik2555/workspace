package reverse_string;

import java.util.Arrays;

public class ReverseString {
public static void main(String[] args) {
	new Solution().reverseString(new char[]{'A','B','C','D','E'});
}
}
class Solution {
    public void reverseString(char[] s) {
    	//[1]
        //char s[]={'H','E','L','L','O'};
        // char copy[]=new char[s.length];
        // for(int i=0;i<s.length;++i){
        //     copy[s.length-1-i]=s[i];
        // }
        // for(int i=0;i<s.length;i++){
        //     s[i]=copy[i];
        // }
    	
    	//[2]
//        for(int i=0,j=s.length-1;i<s.length/2;++i,--j){
//            char t=s[i];
//            s[i]=s[j];
//            s[j]=t;
//        }
        
        
//        int i=0,j=s.length-1;
//        while(i<j) {
//        	char t=s[i];
//        	s[i++]=s[j];				//best
//        	s[j--]=t;
//        }
        
        
        
        int i=0,j=s.length-1;
        while(i<s.length) {
        	char t=s[i];
        	s[i++]=s[j];					//tricky
        	s[j--]=t;
        }
//        
//        int i=0,j=s.length-1;
//        while(i<j) {
//        	char t=s[i];
//        	s[++i]=s[j];				//Guess
//        	s[j--]=t;
//        }
        System.out.println(Arrays.toString(s));

    }
}