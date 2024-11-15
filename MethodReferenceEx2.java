package method_reference;

import java.util.function.Consumer;

public class MethodReferenceEx2 {
	
    public void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
    	
    	// Reference to an Instance Method of a Particular Object
        MethodReferenceEx2 example = new MethodReferenceEx2();
        Consumer<String> consumer = example::printMessage;
        consumer.accept("Hello, using instance method reference!");
    }


}
