# Visitor pattern

This is extracted from https://en.wikipedia.org/wiki/Observer_pattern

## What problems can the Observer design pattern solve?
The Observer pattern addresses the following problems:
* A one-to-many dependency between objects should be defined without making the objects tightly coupled.
* It should be ensured that when one object changes state an open-ended number of dependent objects are updated automatically.
* It should be possible that one object can notify an open-ended number of other objects.

Tightly coupled objects can be hard to implement in some scenarios, and hard to reuse because they refer to and know about (and how to update) many different objects with different interfaces. In other scenarios tightly coupled objects can be a better option since the compiler will be able to detect errors at compile time and optimize the code at CPU instruction level.

## What solution does the Observer design pattern describe?
Moving operations into visitor classes is beneficial when
* Define Subject and Observer objects.
* so that when a subject changes state, all registered observers are notified and updated automatically (and probably asynchronously).

