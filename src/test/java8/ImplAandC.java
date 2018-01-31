package test.java8;

public class ImplAandC implements B, C {

public static void main(String[] args) {
	new ImplAandC().print();
	

}

@Override
public void print() {
	// TODO Auto-generated method stub
	C.super.print();
	
}
}
