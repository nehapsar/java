package recursion;

public class rc8 {
        public static void pairs(int n ,int lastPos, String str) {
        	if(n==0) {
        		System.out.println(str);
        		return;
        	}
        	
        	
        	pairs(n-1,0,str+"0");
        	
