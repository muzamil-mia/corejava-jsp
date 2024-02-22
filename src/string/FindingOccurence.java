package string;

public class FindingOccurence {

	    public static void main(String[] args) {
	       String str = "parampara";
	       int visited[] = new int[str.length()];
	       for(int i = 0; i < str.length()-1; i++) {
	    	   int count = 1;
	    	   char ch = str.charAt(i);
	    	   for(int j = i + 1; j < str.length(); j++) {
	    		   if(str.charAt(j) == ch) {
	    			   count++;
	    			   visited[j] = -1;
	    		   }
	    	   }
	    	   if(visited[i] != -1) {
	    		   visited[i] = count;
	    	   }
	       }
	       for(int i = 0; i < visited.length; i++) {
	    	   if(visited[i] != - 1) {
	    		   System.out.println(str.charAt(i) + " occurs " + visited[i] + " times");
	    	   }
	       }
	    }
	}
