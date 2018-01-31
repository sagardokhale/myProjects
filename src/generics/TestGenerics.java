package generics;

public interface TestGenerics<T>  extends Test1,Test2{
	
	public void setT(T t);
	public T getT();

}
