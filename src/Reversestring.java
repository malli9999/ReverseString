// Class of ReverseString
class ReverseString {
	public static void main (String[] args) {
	       
        String str= "Arjun", rev="";
        char ch;
       
      System.out.println("Original word: " + str);

       
      for (int i=0; i<str.length(); i++)
      {
   	  //extracts each character
        ch= str.charAt(i); 
        rev= ch+rev; 
      }
      System.out.println("Reversed word: "+ rev);
    }
}
