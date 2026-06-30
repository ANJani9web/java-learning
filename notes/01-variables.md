# 01 - Variables & Java Basics

# How to Run a Java Program?

## Step 1: Compile

```bash
javac src/VariablesDemo.java -d bin
```

This compiles the Java source file and generates the `.class` file inside the `bin` directory.

---

## Step 2: Execute

```bash
java -cp bin VariablesDemo
```

This runs the compiled Java program.

---

# What is the Java Class Naming Convention?

**Ans:**

- Class names should start with a capital letter.
- Class names should follow **PascalCase**.

### Correct

```java
public class VariablesDemo
```

File name:

```text
VariablesDemo.java
```

### Incorrect

```java
public class variablesDemo
```

File name:

```text
variablesDemo.java
```

The file name must always match the public class name.

---

# What is `javac`?

**Ans:**

`javac` stands for **Java Compiler**.

It converts Java source code into Java bytecode.

Flow:

```text
App.java
    ↓
 javac
    ↓
App.class
```

---

# What is `App.class`?

**Ans:**

`App.class` is the compiled Java bytecode generated from a `.java` file.

Example:

```text
App.java
    ↓
 javac
    ↓
App.class
```

---

# What is JVM?

**Ans:**

JVM stands for **Java Virtual Machine**.

It executes `.class` files.

Flow:

```text
App.java
    ↓
 javac
    ↓
App.class
    ↓
   JVM
    ↓
 Output
```

---

# What is the Difference Between Compilation and Execution?

## Compilation

Converts Java source code into bytecode.

```text
App.java
    ↓
 javac
    ↓
App.class
```

---

## Execution

Runs the compiled bytecode using the JVM.

```text
App.class
    ↓
 java
    ↓
Output
```

---

# What is a Variable?

**Ans:**

A variable is a named location in memory that stores a value.

### Example

```java
String name = "Anjani";
```

---

# What does this syntax mean?

```java
String name = "Anjani";
```

| Part | Meaning |
|------|---------|
| `String` | Data type (stores text) |
| `name` | Variable name |
| `=` | Assignment operator |
| `"Anjani"` | Value assigned to the variable |

---

# Common Data Types

| Data Type | Purpose | Example |
|-----------|---------|---------|
| `String` | Stores text | `"Anjani"` |
| `int` | Stores integer values | `22` |
| `double` | Stores decimal values | `8.5` |
| `boolean` | Stores `true` or `false` | `true` |

---

# How to Print Variables?

### Printing a String Literal

```java
System.out.println("Anjani");
```

---

### Printing a Variable

```java
System.out.println(name);
```

Both may produce the same output, but they are different.

---

# What is the Difference Between

```java
System.out.println("Anjani");
```

and

```java
System.out.println(name);
```

**Ans:**

```java
System.out.println("Anjani");
```

prints a **String literal**.

---

```java
System.out.println(name);
```

prints the **value stored inside the variable**.

Both may print:

```text
Anjani
```

but one prints a literal while the other prints a variable's value.

---

# What does

```java
age = age + 1;
```

mean?

**Ans:**

Java performs the following steps:

1. Take the current value of `age`.
2. Add `1`.
3. Store the result back into `age`.

Example:

```java
age = 22;

age = age + 1;
```

Result:

```text
age = 23
```

---

# Common Beginner Mistakes

## 1. Class name and file name do not match

❌ Wrong

```java
public class variablesDemo
```

File:

```text
VariablesDemo.java
```

---

✅ Correct

```java
public class VariablesDemo
```

File:

```text
VariablesDemo.java
```

---

## 2. Forgetting to Compile Before Running

❌ Wrong

```bash
java VariablesDemo
```

if no `.class` file exists.

---

✅ Correct

```bash
javac src/VariablesDemo.java -d bin

java -cp bin VariablesDemo
```

---

## 3. Thinking `=` Means Comparison

❌ Wrong

```java
age = 22;
```

This **assigns** a value.

It does **not** compare values.

Comparison is done using:

```java
==
```

---

## 4. Confusing String Literals with Variables

```java
System.out.println("Anjani");
```

prints the text directly.

```java
System.out.println(name);
```

prints the value stored in the variable.

---

# Key Takeaways

- Java programs are compiled using `javac`.
- `javac` converts `.java` files into `.class` files.
- The JVM executes `.class` files.
- A variable stores data in memory.
- Every variable has a data type.
- Class names follow PascalCase.
- The file name must match the public class name.
- `=` assigns a value.
- Variables and String literals are different.