# Factory pattern

This is extracted from https://en.wikipedia.org/wiki/Factory_method_pattern

## Definition
The factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.

## Uses
The Factory Method design pattern is used instead of the regular class constructor for keeping within the SOLID principles of programming, decoupling the construction of objects from the objects themselves. This has the following advantages and is useful for the following cases, among others: 
* Allows construction of classes or subclasses to a parent with a component of a type that has not been predetermined, but only defined in an "interface", or which is defined as a dynamic type.
* Allows for more readable code in cases where multiple constructors exist, each for a different reason.
* Allows a class to defer instantiation to subclasses, and to prevent direct instantiation of an object of the parent class type.

The factory method pattern relies on inheritance, as object creation is delegated to subclasses that implement the factory method to create objects.