package actions;

import java.util.StringTokenizer;

public class Operator {
	public int square(int n) {
		return n*n;
	}
	public int sum(int a, int b) {
		return a+b;
	}
	
	public static int findMax(int arr[]){
		int max = arr[0];
		for(int i = 0;i<arr.length;i++ ) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static String reverseWord(String str){  
		  
        StringBuilder result=new StringBuilder();  
        StringTokenizer tokenizer=new StringTokenizer(str," ");  
  
        while(tokenizer.hasMoreTokens()){  
        StringBuilder sb=new StringBuilder();  
        sb.append(tokenizer.nextToken());  
        sb.reverse();  
  
        result.append(sb);   
        }  
        return result.toString();  
    }  
	
	public boolean isPalindrome(String text) {
	    String clean = text.replaceAll("\\s+", "").toLowerCase();
	    StringBuffer plain = new StringBuffer(clean);
	    StringBuffer reverse = plain.reverse();
	    return (reverse.toString()).equals(clean);
	}
	
}
