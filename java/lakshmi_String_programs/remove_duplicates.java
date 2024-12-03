package lakshmi_String_programs;

public class remove_duplicates {

	
	public static void main(String[] args) {

       String s = "jananaidu";
       String result = " ";
       for(int i = 0;i<=s.length()-1;i++)
       {
    	  String ch =""+ s.charAt(i);
    	  
    	  if(result.contains(ch))
    	  {
    		  continue;
    	  }
    	  result += ch;	
//    	  System.out.println(result);
       }
      System.out.println(result);
        	
        }
    }


