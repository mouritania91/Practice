package mouri.project.com;

public class MethodExamples {

	public static void main(String[] args) {
		
		sum(30,40);
		
		MethodExamples cal = new MethodExamples();
		cal.calculation("sub", 100,88);
		cal.test();
		

	}
	
	
	public static void sum(int x, int y) {
		
		int result = x+y;
		
		System.out.println("The result is : "+result);
		
		
	}
	
public void calculation(String s, int x, int y) {
	
	double result = 0;
	
	if (s.equalsIgnoreCase("sum")) {
		 result = x+y;
	}else if(s.equalsIgnoreCase("sub")) {
		 result = x-y;
	}else if (s.equalsIgnoreCase("mul")) {
		 result = x*y;
	}else if(s.equalsIgnoreCase("div")) {
		 result = x/y;
	}
	
		
		System.out.println("The result is : " + result);
		
		
	}

public void test() {
	
	calculation("sub", 45,12);
	
	
}
	

}
