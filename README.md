# Java Behavioural Design Patterns

A comprehensive collection of Behavioural Design Patterns implemented in Java. These patterns focus on communication between objects and how responsibilities are distributed.

## Table of Contents

- [Overview](#overview)
- [Patterns](#patterns)
- [Quick Start](#quick-start)
- [Project Structure](#project-structure)

## Overview

Behavioural design patterns are concerned with the communication and interaction between objects, how tasks are distributed, and how objects collaborate. This repository provides clear, well-documented implementations of all 10 core behavioural patterns with detailed examples and comprehensive test demonstrations.

## Patterns

### 1. Chain of Responsibility
**Purpose**: Pass requests along a chain of handlers where each handler decides either to process the request or pass it along.

**Key Components**: 
- `Handler` interface - Defines the contract for handlers
- `AbstractHandler` - Base implementation with null-safe handler passing
- Concrete handlers - Specific request processors

**Use Cases**: Event handling, logging frameworks, approval workflows

**Demo**: [ChainOfResponsibility.MainWithChainOfResponsibility](src/ChainOfResponsibility/)

---

### 2. Command
**Purpose**: Encapsulates a request as an object, allowing parameterization of clients with different requests, queue requests, and support for undoable operations.

**Key Components**:
- `Command` interface - Defines execute/undo contract
- `Invoker` - Executes commands with history management
- `Receiver` - Objects that perform actual work
- Concrete commands - Specific command implementations

**Use Cases**: Undo/redo functionality, transaction queuing, macro recording

**Demo**: [Command.Client](src/Command/)

---

### 3. Iterator
**Purpose**: Provides a way to access elements of a collection sequentially without exposing its underlying representation.

**Key Components**:
- `Iterator<T>` interface - Defines traversal contract
- `IterableCollection<T>` interface - Collection interface
- `CustomIterableCollectionIterator<T>` - Iterator implementation
- Reset functionality for re-iteration

**Use Cases**: Traversing collections, lazy loading, custom iteration logic

**Demo**: [Iterator.Client](src/Iterator/)

---

### 4. Mediator
**Purpose**: Defines an object that encapsulates how a set of objects interact, promoting loose coupling by keeping objects from referring to each other explicitly.

**Key Components**:
- `Mediator` interface - Defines communication contract
- `ConcreteMediator` - Implements interaction logic
- `Component` - Objects that communicate through mediator
- Auto-registration on creation

**Use Cases**: UI component communication, air traffic control, chat rooms

**Demo**: [Mediator.Main](src/Mediator/)

---

### 5. Memento
**Purpose**: Captures and externalizes an object's internal state without violating encapsulation, allowing the object to be restored to this state later.

**Key Components**:
- `Memento` - Immutable snapshot of state
- `Originator` - Object whose state is captured
- `CareTaker` - Manages history with undo/redo

**Use Cases**: Undo/redo systems, snapshots, version control

**Demo**: [Memento.Main](src/Memento/)

---

### 6. Observer
**Purpose**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified automatically.

**Key Components**:
- `Observer` interface - Defines notification contract
- `Subject` interface - Manages observers and notifications
- `RadioStation` - Concrete subject
- `Person` - Concrete observer

**Use Cases**: Event handling, MVC systems, real-time notifications, pub/sub systems

**Demo**: [Observer.Main](src/Observer/)

---

### 7. State
**Purpose**: Allows an object to alter its behavior when its internal state changes, appearing to change its class.

**Key Components**:
- `State` interface - Defines state behavior contract
- `LightBulb` - Context object
- Concrete states - `OnState`, `OffState`
- Hook methods for optional customization

**Use Cases**: State machines, workflow engines, UI state management

**Demo**: [State.Main](src/State/)

---

### 8. Strategy
**Purpose**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.

**Key Components**:
- `Strategy` interface - Defines algorithm contract
- `Context` - Uses strategies to perform work
- Concrete strategies - `BubbleSortStrategy`, `MergeSortStrategy`
- Performance timing and comparison

**Use Cases**: Sorting algorithms, payment methods, compression algorithms

**Demo**: [Strategy.Demo](src/Strategy/)

---

### 9. Template Method
**Purpose**: Defines the skeleton of an algorithm in a base class and lets subclasses override specific steps.

**Key Components**:
- `PizzaMaker` - Abstract template method class
- Concrete makers - `SimpleCheeseCornPizzaMaker`, `SpicyPepperoniPizzaMaker`
- Hook methods - `beforeMake()`, `afterMake()`
- Final template method - `make()`

**Use Cases**: Frameworks, test cases, document processing

**Demo**: [Template.Main](src/Template/)

---

### 10. Visitor
**Purpose**: Represents an operation to be performed on elements of an object structure, letting you define new operations without changing the classes of the elements.

**Key Components**:
- `Visitor` interface - Defines visitor operations
- `ChessComponent` - Element in object structure
- Concrete visitors - `ConsoleVisitor`, `SummaryVisitor`
- Concrete components - `Piece`, `BoardBlock`

**Use Cases**: Compilers, document processing, analysis operations

**Demo**: [Visitor.Main](src/Visitor/)

---

## Quick Start

### Prerequisites
- Java 11 or higher
- Maven or direct Java compilation

### Running Individual Patterns

```bash
# Chain of Responsibility
javac src/ChainOfResponsibility/*.java
java -cp src ChainOfResponsibility.MainWithChainOfResponsibility

# Command
javac src/Command/*.java
java -cp src Command.Client

# Iterator
javac src/Iterator/*.java
java -cp src Iterator.Client

# Mediator
javac src/Mediator/*.java
java -cp src Mediator.Main

# Memento
javac src/Memento/*.java
java -cp src Memento.Main

# Observer
javac src/Observer/*.java
java -cp src Observer.Main

# State
javac src/State/*.java
java -cp src State.Main

# Strategy
javac src/Strategy/*.java
java -cp src Strategy.Demo

# Template Method
javac src/Template/*.java
java -cp src Template.Main

# Visitor
javac src/Visitor/*.java
java -cp src Visitor.Main
```

## Project Structure

```
java-behavioural-design-patterns/
├── README.md
├── src/
│   ├── ChainOfResponsibility/
│   │   ├── Handler.java
│   │   ├── AbstractHandler.java
│   │   ├── Concrete handlers...
│   │   └── MainWithChainOfResponsibility.java
│   ├── Command/
│   │   ├── Command.java
│   │   ├── Invoker.java
│   │   ├── Receiver implementations...
│   │   └── Client.java
│   ├── Iterator/
│   │   ├── Iterator.java
│   │   ├── IterableCollection.java
│   │   ├── CustomIterableCollection.java
│   │   └── Client.java
│   ├── Mediator/
│   │   ├── Mediator.java
│   │   ├── Component.java
│   │   ├── ConcreteMediator.java
│   │   ├── ComponentA.java
│   │   ├── ComponentB.java
│   │   └── Main.java
│   ├── Memento/
│   │   ├── Memento.java
│   │   ├── Originator.java
│   │   ├── CareTaker.java
│   │   └── Main.java
│   ├── Observer/
│   │   ├── Observer.java
│   │   ├── Subject.java
│   │   ├── RadioStation.java
│   │   ├── Person.java
│   │   └── Main.java
│   ├── State/
│   │   ├── State.java
│   │   ├── LightBulb.java
│   │   ├── OnState.java
│   │   ├── OffState.java
│   │   └── Main.java
│   ├── Strategy/
│   │   ├── Strategy.java
│   │   ├── Context.java
│   │   ├── BubbleSortStrategy.java
│   │   ├── MergeSortStrategy.java
│   │   └── Demo.java
│   ├── Template/
│   │   ├── PizzaMaker.java
│   │   ├── SimpleCheeseCornPizzaMaker.java
│   │   ├── SpicyPepperoniPizzaMaker.java
│   │   └── Main.java
│   └── Visitor/
│       ├── Visitor.java
│       ├── ChessComponent.java
│       ├── Piece.java
│       ├── BoardBlock.java
│       ├── ConsoleVisitor.java
│       ├── SummaryVisitor.java
│       └── Main.java
```

## Key Features

✅ **Comprehensive Documentation** - Each class and method has detailed JavaDoc comments
✅ **Real-World Examples** - Patterns demonstrated with practical scenarios
✅ **Multiple Implementations** - Each pattern includes concrete examples
✅ **Error Handling** - Proper validation and null checks throughout
✅ **Performance Testing** - Strategy pattern includes performance comparisons
✅ **Extensible Design** - Easy to extend with new implementations
✅ **Clean Code** - Following Java best practices and conventions

## Learning Resources

Each pattern implementation includes:
- Clear separation of concerns
- Meaningful variable and method names
- Comprehensive JavaDoc comments
- Practical demonstration in the Main/Client/Demo class
- Edge case handling and error messages

## Author

Enhanced implementation with comprehensive documentation and multiple concrete examples for each pattern.

## License

This project is open source and available for educational purposes.
