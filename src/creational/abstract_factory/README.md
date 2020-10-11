# Factory pattern

This is extracted from https://en.wikipedia.org/wiki/Abstract_factory_pattern and https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
Abstract Factory is one level higher in abstraction than Factory Method. Factory Method abstracts the way objects are created, while Abstract Factory also abstracts the way factories are created which in turn abstracts the way objects are created.

## Definition
The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes. In normal usage, the client software creates a concrete implementation of the abstract factory and then uses the generic interface of the factory to create the concrete objects that are part of the theme. The client does not know (or care) which concrete objects it gets from each of these internal factories, since it uses only the generic interfaces of their products. This pattern separates the details of implementation of a set of objects from their general usage and relies on object composition, as object creation is implemented in methods exposed in the factory interface.

## Uses
The essence of the Abstract Factory Pattern is to "Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
The factory determines the actual concrete type of object to be created, and it is here that the object is actually created. However, the factory only returns an abstract pointer to the created concrete object.
This insulates client code from object creation by having clients ask a factory object to create an object of the desired abstract type and to return an abstract pointer to the object.