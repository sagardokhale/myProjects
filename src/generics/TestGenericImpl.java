package generics;
import java.util.TreeMap;

import com.test.questions.*;

public class TestGenericImpl extends Child{

	TestGenericImpl() {
		super();
	}

	public static void main(String[] args) {
		GenericsImpl<Integer,String> genInt=new GenericsImpl<>();
		genInt.setT(new Integer(10));
		System.out.println(genInt.getT());
		GenericsImpl<Double,String> genDouble=new GenericsImpl<>();
		genDouble.setT(78.23);
		System.out.println(genDouble.getT());
		GenericsImpl<String,String> genString=new GenericsImpl<>();
		genString.setT("This is test generics");
		System.out.println(genString.getT());
	}

}
