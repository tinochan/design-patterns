# Visitor pattern

This is extracted from https://en.wikipedia.org/wiki/Visitor_pattern

## Definition
The Gang of Four defines the Visitor as:Representing an operation to be performed on elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.
The nature of the Visitor makes it an ideal pattern to plug into public APIs thus allowing its clients to perform operations on a class using a "visiting" class without having to modify the source.

## Uses
Moving operations into visitor classes is beneficial when
* many unrelated operations on an object structure are required,
* the classes that make up the object structure are known and not expected to change,
* new operations need to be added frequently,
* an algorithm involves several classes of the object structure, but it is desired to manage it in one single location,
* an algorithm needs to work across several independent class hierarchies.

A drawback to this pattern, however, is that it makes extensions to the class hierarchy more difficult, as new classes typically require a new visit method to be added to each visitor.