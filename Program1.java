package method_reference;

import java.util.Arrays;
import java.util.List;

public class Program1 {

//	public static void print(String s) {
//		System.out.println(s);
//	}
	
	public  void print(String s) {
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		
//		students.forEach(x->System.out.println(x));     // by using lameda function
//		students.forEach(System.out::println);
//     	students.forEach(Program1::print);     // Static method refrence
		
		Program1 p=new Program1();   // Instance method refrence of an arbitary Object of a particular type
		List<String> students=Arrays.asList("Alice","Bob","Charlie");
		students.forEach(p::print);
		
	}
}
