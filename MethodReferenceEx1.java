package method_reference;

import java.util.function.Consumer;

public class MethodReferenceEx1 {
	public static void sayHello() {
        System.out.println("Hello!");
    }

    
    public static void main(String [] args) {
//      // Using a method reference to refer to a static method
    	Consumer<String> consumer=System.out::println;
    	consumer.accept("Hello,World");
    	
    	Runnable r=MethodReferenceEx1::sayHello;
    	r.run();
    }


}
