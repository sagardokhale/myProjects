package testJava;

public class TestSubsequence {
	
	static final char[] arr1={'a','e','i','o','u'};
	
   static int giveSubSequence(String s){
	for(char c:s.toCharArray()){
		if(!checkVowel(c)){
			return 0;
		}
		if((checkIndex(s.charAt(0))!=0)&&(checkIndex(s.charAt(s.length()-1))!=4)){
		    return 0;
		}
	}
	
	return 0;
   } 
   
   static boolean checkVowel(char c){
	   for (char x : arr1) {
           if (x == c) {
               return true;
           }
       }
       return false;
   }
   
   static int checkIndex(char c){
	 return arr1.toString().indexOf(c);  
   }
   


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		System.out.println(s.toCharArray()[3]);
		giveSubSequence("aeiaaioooaauuaeiou");
	}

}
