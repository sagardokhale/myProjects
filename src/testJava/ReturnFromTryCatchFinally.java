package testJava;

public class ReturnFromTryCatchFinally {
	
	public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue()
    {
        int i = 0;
 
        try
        {
            i = 1;
            Integer.parseInt("abc");
            return i;
        }
        catch (Exception e)
        {
            i = 2;
            return i;
        }
        finally
        {
            i = 3;
            System.out.println("finally");
            return i;
        }
 
       
    }

}
