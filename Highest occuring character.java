/* highest occurring character in the String.Given a string, 
find and return the highest occurring character present in the given string.*/
public class solution {

	public static char highestOccuringCharacter(String inputString) {
		// Write your code here
 int temp = 0;
        int count = 0;
    

        char maxchar = ' ';

        for (int i = 0; i < inputString.length(); i++) 
        {
            char ch = inputString.charAt(i);

            for (int j=i+1; j < inputString.length(); j++) 
            {
                char ch1 = inputString.charAt(j);

                if (ch == ch1) 
                {
                    count++;
                }
                if (count > temp) 
                {
                temp = count;
                maxchar = ch;
                }
           }
             count=0;
         
        }
      if(temp==0)
      {
        return inputString.charAt(0);
      }
        return maxchar;
	}
}
