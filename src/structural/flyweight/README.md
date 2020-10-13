# Flyweight pattern

This is extracted from https://en.wikipedia.org/wiki/Flyweight_pattern

## Example Usage
A classic example usage of the flyweight pattern is the data structures for graphical representation of characters in a word processor. It might be desirable to have, for each character in a document, a glyph object containing its font outline, font metrics, and other formatting data, but this would amount to hundreds or thousands of bytes for each character. Instead, for every character there might be a reference to a flyweight glyph object shared by every instance of the same character in the document; only the position of each character (in the document and/or the page) would need to be stored internally.

Another example is string interning.

## Overview
What problems can the Flyweight design pattern solve?
* Large numbers of objects should be supported efficiently.
* Creating large numbers of objects should be avoided.

Define Flyweight objects that
* store intrinsic (invariant) state that can be shared and
* provide an interface through which extrinsic (variant) state can be passed in.

Intrinsic state is invariant (context independent) and therefore can be shared (for example, the code of character 'A' in a given character set).
Extrinsic state is variant (context dependent) and therefore can not be shared and must be passed in (for example, the position of character 'A' in a text document).