# 03 - If Else

## What is if?

**Ans:**

`if` is used to execute a block of code only when a condition is **true**.

### Example

```java
if(age >= 18){
    System.out.println("Adult");
}
```

---

## What is else?

**Ans:**

`else` executes when the `if` condition is **false**.

### Example

```java
if(age >= 18){
    System.out.println("Adult");
}
else{
    System.out.println("Minor");
}
```

---

## What is else if?

**Ans:**

`else if` is used when multiple conditions need to be checked.

### Example

```java
if(number > 0){
    System.out.println("Positive");
}
else if(number < 0){
    System.out.println("Negative");
}
else{
    System.out.println("Zero");
}
```

---

# What is a Condition?

A condition is an expression that always evaluates to either:

- `true`
- `false`

### Example

```java
age >= 18
```

If

```java
age = 20;
```

then

```java
20 >= 18
```

becomes

```text
true
```

---

# Comparison Operators

| Operator | Meaning |
|----------|---------|
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal to |
| `<=` | Less than or equal to |
| `==` | Equal to |
| `!=` | Not equal to |

---

# Difference Between `=` and `==`

## `=` (Assignment Operator)

Stores a value in a variable.

```java
age = 22;
```

---

## `==` (Comparison Operator)

Checks whether two values are equal.

```java
age == 22
```

Returns:

- `true`
- `false`

---

# Difference Between Multiple if Statements and if-else if

## Multiple if Statements

Every condition is checked independently.

### Example

```java
if(marks >= 90){
    System.out.println("A");
}

if(marks >= 80){
    System.out.println("B");
}

if(marks >= 70){
    System.out.println("C");
}
```

If

```java
marks = 95;
```

Output

```text
A
B
C
```

---

## if - else if

Java stops checking conditions after the first matching condition.

### Example

```java
if(marks >= 90){
    System.out.println("A");
}
else if(marks >= 80){
    System.out.println("B");
}
else if(marks >= 70){
    System.out.println("C");
}
else{
    System.out.println("Fail");
}
```

If

```java
marks = 95;
```

Output

```text
A
```

---

# How Java Executes an if-else Ladder

Java checks conditions **from top to bottom**.

- If a condition is `true`, its block executes.
- The remaining `else if` and `else` blocks are skipped.

---

# Can Multiple if Statements Execute?

**Yes.**

If they are separate `if` statements, Java checks every condition.

### Example

```java
int number = 0;

if(number > 0){
    System.out.println("Positive");
}

if(number >= 0){
    System.out.println("Non-negative");
}

if(number == 0){
    System.out.println("Zero");
}
```

Output

```text
Non-negative
Zero
```

---

# Can Only One Block Execute in an if-else if Ladder?

**Yes.**

Only the **first matching condition** executes.

---

# Common Beginner Mistakes

## 1. Using `=` instead of `==`

❌ Wrong

```java
if(age = 18)
```

✅ Correct

```java
if(age == 18)
```

---

## 2. Forgetting Curly Braces

❌ Wrong

```java
if(age >= 18)
    System.out.println("Adult");
    System.out.println("Can Vote");
```

Only the first `println()` belongs to the `if`.

✅ Correct

```java
if(age >= 18){
    System.out.println("Adult");
    System.out.println("Can Vote");
}
```

---

## 3. Confusing Multiple if Statements with if-else if

### Multiple if Statements

```java
if(score >= 90){
    System.out.println("A");
}

if(score >= 80){
    System.out.println("B");
}
```

Both conditions can execute.

---

### if-else if

```java
if(score >= 90){
    System.out.println("A");
}
else if(score >= 80){
    System.out.println("B");
}
```

Only one block executes.

---

# Key Takeaways

- `if` executes code when a condition is true.
- `else` executes when the `if` condition is false.
- `else if` is used to check multiple conditions.
- Conditions always evaluate to `true` or `false`.
- `=` assigns a value, while `==` compares two values.
- Separate `if` statements are all evaluated independently.
- In an `if-else if` ladder, Java stops after the first matching condition.
- Use curly braces `{}` even for a single statement—it improves readability and prevents bugs.