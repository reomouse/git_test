package test.sample.ex;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2;
		
		Calculator cal = (n1) -> {return n + 1;};
		
		
		System.out.println(cal.calc(n));
		
	}

}
