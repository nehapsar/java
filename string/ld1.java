
public class ld3 {
	 public static int lengthOfLastWord(String s) {
	        StringBuilder sb =new StringBuilder(" ");
	        for(int i=s.length()-1;i>0;i--){
	          if(s.charAt(i) == ' ') {
	        	  return sb.length()-1; }
	          sb.append(s.charAt(i));
	          }