package Strings;

public class SubString {
	public static void main(String[] args) {
		System.out.println(new Solution().lengthOfLongestSubstring("abcabcbb"));
		
	}

}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        String str=" ";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                str=str+i;
            }
        
           }
        return str.length();
    }
}