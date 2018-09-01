public class Solution {

	public static String compress(String inputString) {
		
      int count=1;
      String ans=" ";
 for(int i=0;i<inputString.length()-1;i++)
       {
          
             if(inputString.charAt(i)!=inputString.charAt(i+1))
             {
             ans +=inputString.charAt(i);
             }
        while(inputString.charAt(i)==inputString.charAt(i+1))
            {
          count++;
          i++;
            }
           ans+=inputString.charAt(i)+""+count;
         count=1;
        }
    return ans+inputString.charAt(i);
   }
     
}


