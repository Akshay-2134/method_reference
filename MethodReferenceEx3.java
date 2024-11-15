package method_reference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEx3 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        
        // Using method reference to refer to instance method of an arbitrary object
        names.forEach(System.out::println);
    }


}
