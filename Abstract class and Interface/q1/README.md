# Implementing a Flying Boat in Java

## Task Description

You are required to implement a Flying Boat using Java interfaces and classes. The Flying Boat should be capable of both swimming and flying.

### Interfaces and Classes Description

1. **Plane Interface:**
   - Represents a plane.
   - Defines a method `fly()`.
   - Defines a constant `maxAltitude` representing the maximum altitude the plane can reach.

2. **Boat Interface:**
   - Represents a boat.
   - Defines a method `swim()`.
   - Defines a constant `boatLength` representing the length of the boat.

3. **FlyingBoat Interface:**
   - Extends both `Plane` and `Boat` interfaces.
   - Defines a default method `swimAndFly()` that calls `swim()` and `fly()` methods in sequence.

4. **MyFlyingBoat Class:**
   - Implements the `FlyingBoat` interface.
   - Defines implementations for `swim()` and `fly()` methods:
     - `swim()` prints a message indicating the Flying Boat is swimming.
     - `fly()` prints a message indicating the Flying Boat is flying.

5. **Main Class:**
   - Creates an instance of `MyFlyingBoat` class.
   - Calls its `swimAndFly()` method.
   - Expected output should indicate that the Flying Boat is both swimming and flying.

## Example Implementation

### Plane Interface

```java
public interface Plane {
    void fly();
    int maxAltitude = 10000; // Example altitude
}
