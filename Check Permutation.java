/*Given two strings, check if they are permutations of each other. Return true or false.
Permutation means - length of both the strings should 
same and should contain same set of characters.
 Order of characters doesn't matter.*/

public class solution {

	public static boolean isPermutation(String input1, String input2) {
	    
if(input1.length()!=input2.length()){
  return false;
  
}
      int output=0;
      for(int i=0;i<input1.length();i++){
       // if( input2.length(charAt(i))==-1){
        //  return false;
        output ^=input1.charAt(i)^input2.charAt(i);
          
       }
      return output==0;
       
	}
}
