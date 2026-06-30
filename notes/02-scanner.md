# 02 - Scanner

## What is Scanner?

**Ans:**

`Scanner` is a helper class used to read input from a source such as the keyboard.

### Example

```java
Scanner sc = new Scanner(System.in);
```

---

# What does `nextLine()` do?

**Ans:**

`nextLine()` reads an entire line of text entered by the user and returns it as a `String`.

### Example

```java
String name = sc.nextLine();
```

Input:

```text
Anjani Kumar
```

Result:

```java
name = "Anjani Kumar";
```

---

# What does `nextInt()` do?

**Ans:**

`nextInt()` reads an integer value entered by the user and returns it as an `int`.

### Example

```java
int age = sc.nextInt();
```

Input:

```text
22
```

Result:

```java
age = 22;
```

---

# What happens if `nextInt()` receives non-integer input?

**Ans:**

Java throws an `InputMismatchException`.

### Example

Input:

```text
34abc
```

Code:

```java
int age = sc.nextInt();
```

Output:

```text
Exception in thread "main" java.util.InputMismatchException
```

---

# Can `nextLine()` read integers?

**Ans:**

Yes.

`nextLine()` reads everything as text (`String`), even if the user enters numbers.

### Example

Input:

```text
123
```

Result:

```java
String value = "123";
```

---

# What does `sc.close()` do?

**Ans:**

`sc.close()` closes the `Scanner` and releases the associated resources.

It is a good practice to close the scanner after you finish reading input.

### Example

```java
sc.close();
```

---

# What is the range of `int`?

**Ans:**

An `int` occupies **4 bytes (32 bits)**.

Range:

```text
-2,147,483,648
to
 2,147,483,647
```

---

# What happens when we do `String + int`?

**Ans:**

Java converts the `int` to a `String` and concatenates them.

### Example

```java
String age = "22";

System.out.println(age + 10);
```

Output:

```text
2210
```

---

# How to convert `String` to `int`?

**Ans:**

Use `Integer.parseInt()`.

### Example

```java
int age = Integer.parseInt("22");
```

Result:

```java
age = 22;
```

---

# What is `System.in`?

**Ans:**

`System.in` represents the standard input stream (usually the keyboard).

Flow:

```text
Keyboard
    ↓
System.in
```

---

# What is `System.out`?

**Ans:**

`System.out` represents the standard output stream (usually the console/screen).

Flow:

```text
Program
    ↓
System.out
    ↓
Screen
```

---

# What does `new` mean?

**Ans:**

`new` creates a new object.

### Example

```java
Scanner sc = new Scanner(System.in);
```

Here, a new `Scanner` object is created.

---

# What is the difference between `nextLine()` and `nextInt()`?

| `nextLine()` | `nextInt()` |
|--------------|-------------|
| Reads an entire line | Reads an integer value |
| Returns a `String` | Returns an `int` |

### Examples

```java
String name = sc.nextLine();
```

```java
int age = sc.nextInt();
```

---

# What does this line do?

```java
Scanner sc = new Scanner(System.in);
```

**Ans:**

1. `System.in` represents keyboard input.
2. `new Scanner(...)` creates a new `Scanner` object.
3. `sc` stores the created `Scanner` object.

Flow:

```text
Keyboard
    ↓
System.in
    ↓
Scanner
    ↓
Program
```

---

# What is an object?

**Ans:**

An object is an instance of a class.

### Example

```java
Scanner sc = new Scanner(System.in);
```

- `Scanner` → Class
- `sc` → Object

We'll study classes and objects in detail later.

---

# What is `Integer.parseInt()`?

**Ans:**

`Integer.parseInt()` converts a `String` into an `int`.

### Example

```java
String ageText = "22";

int age = Integer.parseInt(ageText);
```

Result:

```java
age = 22;
```

---

# Common Beginner Mistakes

## 1. Using `nextInt()` for text input

❌ Wrong

```java
int age = sc.nextInt();
```

Input:

```text
22abc
```

Result:

```text
InputMismatchException
```

---

## 2. Assuming `nextLine()` returns an integer

❌ Wrong

```java
String age = sc.nextLine();

System.out.println(age + 10);
```

Output:

```text
2210
```

because Java performs **String concatenation**.

---

## 3. Creating multiple `Scanner` objects for `System.in`

❌ Not Recommended

```java
Scanner sc1 = new Scanner(System.in);
Scanner sc2 = new Scanner(System.in);
```

✅ Better

```java
Scanner sc = new Scanner(System.in);
```

Use one `Scanner` object for one `System.in`.

---

# Key Takeaways

- `Scanner` is used to read input from the user.
- `System.in` represents keyboard input.
- `System.out` represents console output.
- `nextLine()` reads a complete line and returns a `String`.
- `nextInt()` reads an integer and returns an `int`.
- `new` creates a new object.
- `Integer.parseInt()` converts a `String` into an `int`.
- Always close the `Scanner` after use.
- Prefer using a single `Scanner` object for `System.in`.