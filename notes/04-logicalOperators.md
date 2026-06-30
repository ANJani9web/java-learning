# 04 - Logical Operators

Logical operators are used to combine multiple conditions.

They always return a **boolean** value (`true` or `false`).

---

# What are the Logical Operators in Java?

Java provides three logical operators:

| Operator | Name | Meaning |
|----------|------|---------|
| `&&` | Logical AND | Both conditions must be true |
| `||` | Logical OR | At least one condition must be true |
| `!` | Logical NOT | Reverses a boolean value |

---

# What is the Logical AND (`&&`) Operator?

**Ans:**

The `&&` operator returns `true` only when **both** conditions are true.

### Example

```java
int age = 22;
boolean isIndian = true;

if(age >= 18 && isIndian){
    System.out.println("Eligible to Vote");
}
```

Output

```text
Eligible to Vote
```

---

# Truth Table for `&&`

| Condition 1 | Condition 2 | Result |
|-------------|-------------|--------|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

---

# What is the Logical OR (`||`) Operator?

**Ans:**

The `||` operator returns `true` if **at least one** condition is true.

### Example

```java
boolean isAdmin = false;
boolean isModerator = true;

if(isAdmin || isModerator){
    System.out.println("Access Granted");
}
```

Output

```text
Access Granted
```

---

# Truth Table for `||`

| Condition 1 | Condition 2 | Result |
|-------------|-------------|--------|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

---

# What is the Logical NOT (`!`) Operator?

**Ans:**

The `!` operator reverses a boolean value.

### Example

```java
boolean isLoggedIn = false;

System.out.println(!isLoggedIn);
```

Output

```text
true
```

---

# How does `!` work?

| Value | Result |
|-------|--------|
| `true` | `false` |
| `false` | `true` |

---

# Combining Conditions

Logical operators are often used together.

### Example

```java
int age = 22;
boolean hasLicense = true;

if(age >= 18 && hasLicense){
    System.out.println("Can Drive");
}
```

Both conditions must be true.

---

# Example Using OR

```java
boolean isAdmin = false;
boolean isModerator = true;

if(isAdmin || isModerator){
    System.out.println("Dashboard Access");
}
```

Only one condition needs to be true.

---

# Example Using NOT

```java
boolean isLoggedIn = false;

if(!isLoggedIn){
    System.out.println("Please Login");
}
```

Output

```text
Please Login
```

---

# Can We Use Multiple Logical Operators Together?

**Yes.**

Example

```java
if(age >= 18 && isIndian && hasVoterId){
    System.out.println("Eligible");
}
```

All three conditions must be true.

---

# What is a Boolean?

A boolean is a data type that stores only two values.

```java
true
false
```

Example

```java
boolean isStudent = true;
boolean hasID = false;
```

---

# Common Beginner Mistakes

## 1. Confusing `&&` with `||`

### `&&`

Both conditions must be true.

```java
if(age >= 18 && hasLicense)
```

---

### `||`

At least one condition must be true.

```java
if(isAdmin || isModerator)
```

---

## 2. Forgetting that `!` reverses the value

```java
boolean isLoggedIn = false;

System.out.println(!isLoggedIn);
```

Output

```text
true
```

---

## 3. Writing impossible conditions

❌ Wrong

```java
if(age > 18 && age < 10)
```

This condition can never become true.

---

## 4. Using `=` instead of `==`

❌ Wrong

```java
if(age = 18)
```

✅ Correct

```java
if(age == 18)
```

---

# Real-World Examples

## Voting Eligibility

```java
if(age >= 18 && isIndian){
    System.out.println("Eligible to Vote");
}
```

---

## Login

```java
if(username.equals("admin") && password.equals("1234")){
    System.out.println("Login Successful");
}
```

---

## Admin Access

```java
if(isAdmin || isModerator){
    System.out.println("Access Granted");
}
```

---

## Authentication

```java
if(!isLoggedIn){
    System.out.println("Please Login");
}
```

---

# Key Takeaways

- Logical operators combine multiple conditions.
- `&&` requires all conditions to be true.
- `||` requires at least one condition to be true.
- `!` reverses a boolean value.
- Logical operators always return a boolean (`true` or `false`).
- They are heavily used in backend development for login, authentication, authorization, validation, and business logic.