package practice;
import java.nio.charset.StandardCharsets;

public class TestFraction {
	public static void main(String args[]) {
		Test test=new Test(2,4);
		Test test2=new Test(3,5);
		test.add(test2);
	
		Test test3=new Test(4,6);
		Test test4=new Test(5,4);
		test3.multiply(test4);
		
		Test test5=new Test(1,6);
		Test test6=new Test(2,5);
		test5.subtract(test6);
		
		Test test7=new Test(4,6);
		Test test8=new Test(2,3);
		test7.divide(test8);
		
		


	}

}
