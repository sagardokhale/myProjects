package testJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import javafx.animation.Interpolator;

public class TestjavaProgram {
	int j;
	String testString;

	static {
		System.out.println("This is static block 1...........");
	}
	static {
		System.out.println("This is static block 2...........");
	}

	TestjavaProgram() {
		System.out.println("This is constructor");
	}

	{

		System.out.println("This is instance block 1");
	}
	{

		System.out.println("This is instance block 2");
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if ((o == null) || (this.getClass() != o.getClass()))
			return false;
		TestjavaProgram test = (TestjavaProgram) o;
		return j == test.j
				&& (testString == test.testString || ((testString != null) && (testString.equals(test.testString))));
	}

	public int hashCode() {
		int hash = 7;
		hash = hash * j + hash;
		return hash + (null == testString ? 0 : testString.hashCode());
	}

	TestjavaProgram(int j) {
		this.j = j;
	}

	public int incrementI(int i) {
		return i = +i * i;
	}

	public int add(int a, int b) {
		return a + b;
	}

	private static boolean isPrime(int number) {
		IntPredicate predicate = index -> number % index == 0;
		return number > 1 && IntStream.range(2, number).noneMatch(predicate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> testArrayList = new ArrayList<>();
		HashSet<TestjavaProgram> h1 = new HashSet<>();
		h1.add(new TestjavaProgram(12));
		h1.add(new TestjavaProgram(12));
		h1.add(new TestjavaProgram(12));
		h1.add(new TestjavaProgram(12));
		String ar1[] = args[0].split(".");
		String ar2[] = args[1].split(".");
		System.out.println("ar1===========" + ar1);
		System.out.println(h1);
		Double d1 = Double.parseDouble(args[0]);
		Double d2 = Double.parseDouble(args[1]);
		System.out.println("  d1=" + d1.intValue() + "  d2=" + d2.intValue());
		long milliseconds = 9645000;
		long totalSeconds = milliseconds / 1000;
		long seconds = totalSeconds % 60;
		long minutes = (totalSeconds / 60) % 60;
		long hours = totalSeconds / 3600;
		System.out.println("seconds:" + seconds + "minutes:" + minutes + "hours:" + hours);
		int paisa = 1982;
		long paia = 1982 % 100;
		int rs = paisa / 100;
		System.out.println("Rupees:" + rs + "Paise:" + paia);
		HashMap<String, String> hmap = new HashMap<>();
		testArrayList.add("aAa");
		testArrayList.add("aaaa");
		testArrayList.add("AAAaaa");
		testArrayList.add("AaAa");
		System.out.println("Before" + testArrayList);
		Collections.sort(testArrayList);
		System.out.println("After" + testArrayList);
		System.out.println(new TestjavaProgram().incrementI(6));
		HashMap<Integer, String> testMap = new HashMap<>();
		testMap.put(3, "Sagar");
		testMap.put(4, "Pramod");
		testMap.put(1, "Vaibhav");
		testMap.put(1, "Vinit");
		HashSet h = new HashSet();
		h.add("sagar");
		h.add(123);
		Iterator it1 = h.iterator();

		Set<Entry<Integer, String>> testSet = testMap.entrySet();
		Iterator<Entry<Integer, String>> it = testSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		ArrayList<Integer> arlist = new ArrayList<>();
		for (int j = 0; j < 100; j++) {
			arlist.add(j);
		}
		Stream<Integer> seqStream = arlist.stream();
		Stream<Integer> paraStream = arlist.parallelStream();

		seqStream.forEach(p -> System.out.println("squential" + p));
		paraStream.forEach(q -> System.out.println("parallel" + q));
		String result = TestjavaProgram.isPrime(7) ? "prime" : "not prime";
		System.out.println(System.currentTimeMillis());
		System.out.println("2 is prime" + TestjavaProgram.isPrime(2));
		System.out.println("7 is " + (TestjavaProgram.isPrime(7) ? "prime" : "not prime"));
		System.out.println(" is prime" + TestjavaProgram.isPrime(2));

		Integer[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Integer[] arr2 = { 1, 3, 4, 5, 6, 7, 8 };
		ArrayList<Integer> arrList1 = new ArrayList<>(Arrays.asList(arr1));
		ArrayList<Integer> arrList2 = new ArrayList<>(Arrays.asList(arr2));
		for (int i = 0; i < arr1.length; i++) {
			if (arrList2.indexOf(arr1[i]) == -1) {
				System.out.println(arr1[i]);
			}
		}
		System.out.println(arrList1);
		HashSet<Integer> hs1 = new HashSet<>(Arrays.asList(arr1));
		HashSet<Integer> hs2 = new HashSet<>(Arrays.asList(arr2));
		System.out.println(hs1);
		hs1.removeAll(hs2);
		System.out.println(hs1);

		int t1 = 0, t2 = 1;
		for (int i = 0; i < 50; i++) {
			System.out.print(t1 + " ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		String inputString = "I love India";
		char[] inputArray = inputString.toCharArray();
		char[] resultArray = new char[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == ' ') {
				resultArray[i] = ' ';
			}
		}
		int j = resultArray.length - 1;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != ' ') {
				if (resultArray[j] == ' ') {
					j--;
				}
				resultArray[j] = inputArray[i];
				j--;

			}
		}

		System.out.println();
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(resultArray[i]);
		}

		int[] fibArray = new int[20];
		fibArray[0] = 0;
		fibArray[1] = 1;
		for (int i = 2; i < 20; i++) {
			fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
		}
		System.out.println();

		System.out.println("fibonacci series...."+Arrays.toString(fibArray));

	}

}
