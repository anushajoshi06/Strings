public class solution {

	public static String removeAllOccurrencesOfChar(String input, char c) {
	    // Write your code here
      char p=' ';
      String t="";
      char x=c;
     for(int i=0;i<input.length();i++){
       p=input.charAt(i);
       if(p==x){
         continue; 
       }
       else
       {
         t+=input.charAt(i);
       }}
       return t;
       
     }
	}


