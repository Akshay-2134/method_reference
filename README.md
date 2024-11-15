
# Method Reference in Java 8

- Method reference is a shorthand notation of a lambda expression to call a method.
- Method reference is used to refer method of functional interface.
- It is  compact and easy from of lameda expression.
- Method references allows us to a method without invoking it,making our code cleaner and more readable.
- They can be used in place of lameda expression when the lameda expression only calls an existing method.



# Four Types of Method references
- Static Method reference

   A static method reference in Java allows you to refer to a static method by using the ClassName::methodName syntax. Static method references are a way to directly use a method that belongs to a class (rather than an instance of the class) as the implementation of a functional interface.


- Instance Method reference of a particular Object
    
    an instance method reference of a particular object refers to a method that is called on a specific instance of an object, rather than on an arbitrary object of a type or a static method
- Instance method reference of an arbitary Object of a particular Type

     In Java, an instance method reference of an arbitrary object of a particular type allows you to refer to an instance method of an object type (e.g., String, Person, etc.) without specifying a particular instance. Instead, it refers to any instance of that type within a stream or collection.

- Constructor Reference
   
    a constructor reference allows you to refer to a class's constructor using the ClassName::new syntax. Constructor references are useful when you want to create new instances of a class, especially in the context of functional programming. This feature works with functional interfaces whose abstract methods return a new instance, such as Supplier<T>, Function<T, R>, BiFunction<T, U, R>, etc.
     


# why method reference used with functional interface

In Java, a method reference is used with functional interfaces because functional interfaces are interfaces with a single abstract method (often called Single Abstract Method or SAM interfaces). Since these interfaces require just one method to be implemented, method references offer a concise, shorthand way to point to existing methods that can fulfill this requirement.

# How we use  method reference with foreach loop
Method references can indeed be used with a forEach loop, especially when dealing with collections or streams in Java. The forEach method in the Java Collections Framework (for example, in List and Set) and in the Stream API is often used with method references because forEach accepts a Consumer<T> functional interface.

A Consumer<T> is a functional interface with a single accept method that takes an argument of type T and returns nothing (void). This makes it ideal for use with method references.

# Arbitrary objects 
- An object that can be defined in terms of another object.
- An arbitrary object has those  properties common to the individual objects in its range. So an. arbitrary number is odd or even, an arbitrary man is mortal, since each individual number is odd or even, each individual.







