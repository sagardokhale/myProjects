package generics;
import com.test.questions.*;;

public class GenericsImpl<V,T> implements TestGenerics<V> {
	private V t;

	@Override
	public void setT(V t) {
		this.t=t;
	}

	@Override
	public V getT() {
		// TODO Auto-generated method stub
		return this.t;
	}

	

}
