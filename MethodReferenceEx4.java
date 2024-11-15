package method_reference;

import java.util.function.Supplier;

public class MethodReferenceEx4 {
	
	public MethodReferenceEx4() {
        System.out.println("Constructor called!");
    }

    public static void main(String[] args) {
        // Using a method reference to refer to a constructor
        Supplier<MethodReferenceEx4> supplier = MethodReferenceEx4::new;
        supplier.get();
    }

}
