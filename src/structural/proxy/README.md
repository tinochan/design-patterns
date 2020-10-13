# Proxy pattern

This is extracted from https://en.wikipedia.org/wiki/Proxy_pattern

## Example Usage 
A proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the scenes. Use of the proxy can simply be forwarding to the real object, or can provide additional logic. In the proxy, extra functionality can be provided, for example caching when operations on the real object are resource intensive, or checking preconditions before operations on the real object are invoked. For the client, usage of a proxy object is similar to using the real object, because both implement the same interface.

** Remote proxy **

In distributed object communication, a local object represents a remote object (one that belongs to a different address space). The local object is a proxy for the remote object, and method invocation on the local object results in remote method invocation on the remote object. An example would be an ATM implementation, where the ATM might hold proxy objects for bank information that exists in the remote server.

** Virtual proxy **
In place of a complex or heavy object, a skeleton representation may be advantageous in some cases. When an underlying image is huge in size, it may be represented using a virtual proxy object, loading the real object on demand (lazy loading).

** Protection proxy **
A protection proxy might be used to control access to a resource based on access rights.

## Overview
What problems can the Proxy design pattern solve? 
* The access to an object should be controlled.
* Additional functionality should be provided when accessing an object.

When accessing sensitive objects, for example, it should be possible to check that clients have the needed access rights.
