# Object-Oriented Programming (OOP) in Java

A structured repository containing practical implementations, code examples, and notes on Object-Oriented Programming (OOP) concepts in Java.

---

## 📌 Topics Covered

### 1. Fundamentals of OOP
- **Classes & Objects**: Blueprints, physical instances, state, behavior, and identity.
- **Constructors**: Default, parameterized, and copy constructors; constructor overloading.
- **`this` Keyword**: Memory references, invoking overloaded constructors, and object binding.
- **Memory Allocation**: Stack vs. Heap memory allocation, reference variables, and garbage collection (`finalize`).

### 2. Static Keyword & Packages
- **Packages**: Modularizing Java code, package hierarchies, and importing classes.
- **`static` Members**: Static variables, static methods, static initialization blocks, and inner classes (`static` vs non-static).

### 3. Core Pillars of OOP
- **Inheritance**: Single, Multilevel, and Hierarchical inheritance; use of the `super` keyword.
- **Polymorphism**: 
  - *Compile-time*: Method overloading.
  - *Runtime*: Method overriding, dynamic method dispatch, and early/late binding.
- **Encapsulation**: Data hiding, getter and setter methods, maintaining class invariants.
- **Abstraction**: Hiding implementation details using Abstract Classes and Interfaces.

### 4. Advanced Concepts
- **Interfaces & Abstract Classes**: Multiple inheritance using interfaces, default/static interface methods, nested interfaces.
- **Access Control**: Scoping with `public`, `protected`, package-private (default), and `private`.
- **Generics**: Generic classes, generic methods, bounded types, wildcard arguments (`?`), custom `ArrayList` implementation.
- **Exception Handling**: `try-catch-finally`, checked vs. unchecked exceptions, `throw`/`throws`, custom exception classes.
- **Cloning & Comparison**: Shallow vs. Deep copying, `Cloneable` interface, custom sorting with `Comparable` and `Comparator`.

---

## 🛠️ Project Structure

```
├── src/
│   └── com/
│       └── awan/
│           └── introduction/
│               ├── Main.java
│               └── Student.java
└── .gitignore
```

---

## 🚀 Getting Started

### Prerequisites
- **JDK**: Java Development Kit (JDK 17 or higher recommended).
- **IDE**: VS Code, IntelliJ IDEA, or Eclipse.

### Execution
1. Clone the repository:
   ```bash
   git clone https://github.com/awanbiswas2027/OOP-JAVA.git
   ```
2. Navigate to the project directory:
   ```bash
   cd OOP-JAVA
   ```
3. Compile and run:
   ```bash
   javac -d bin src/com/awan/introduction/*.java
   java -cp bin com.awan.introduction.Main
   ```
