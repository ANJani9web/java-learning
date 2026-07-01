# 05 - Loops

Loops are used to execute a block of code repeatedly until a condition becomes false.

---

# Types of Loops

Java provides three types of loops:

- `for`
- `while`
- `do-while`

---

# What is a for Loop?

A `for` loop is used when the number of iterations is known.

### Syntax

```java
for(initialization; condition; update){
    // code
}
```

### Example

```java
for(int i = 1; i <= 5; i++){
    System.out.println(i);
}
```

Output

```text
1
2
3
4
5
```

---

# Parts of a for Loop

```java
for(int i = 1; i <= 5; i++)
```

| Part | Purpose |
|------|---------|
| `int i = 1` | Initialization (runs once) |
| `i <= 5` | Condition (checked before every iteration) |
| `i++` | Update (runs after every iteration) |

---

# What is a while Loop?

A `while` loop executes as long as the condition is true.

### Syntax

```java
while(condition){
    // code
}
```

### Example

```java
int i = 1;

while(i <= 5){
    System.out.println(i);
    i++;
}
```

---

# What is a do-while Loop?

A `do-while` loop executes the block once before checking the condition.

### Syntax

```java
do{
    // code
}while(condition);
```

### Example

```java
int i = 1;

do{
    System.out.println(i);
    i++;
}while(i <= 5);
```

---

# Difference Between while and do-while

| while | do-while |
|--------|-----------|
| Condition checked first | Code executes first |
| May execute zero times | Executes at least once |

---

# What is break?

`break` immediately exits the loop.

### Example

```java
for(int i = 1; i <= 5; i++){

    if(i == 3){
        break;
    }

    System.out.println(i);
}
```

Output

```text
1
2
```

---

# What is continue?

`continue` skips the current iteration and moves to the next iteration.

### Example

```java
for(int i = 1; i <= 5; i++){

    if(i == 3){
        continue;
    }

    System.out.println(i);
}
```

Output

```text
1
2
4
5
```

---

# Difference Between break and continue

| break | continue |
|--------|-----------|
| Exits the loop | Skips only the current iteration |
| Loop stops | Loop continues |

---

# Infinite Loop

An infinite loop occurs when the condition never becomes false.

Example

```java
int i = 1;

while(i <= 5){
    System.out.println(i);
}
```

Since `i` is never updated, the loop never ends.

---

# Common Beginner Mistakes

## 1. Forgetting to update the loop variable

❌ Wrong

```java
int i = 1;

while(i <= 5){
    System.out.println(i);
}
```

Result:

Infinite loop.

---

## 2. Using `break` instead of `continue`

`break`

Stops the loop.

`continue`

Skips only the current iteration.

---

## 3. Off-by-One Errors

❌

```java
for(int i = 1; i < 5; i++)
```

Prints:

```
1
2
3
4
```

---

✅

```java
for(int i = 1; i <= 5; i++)
```

Prints:

```
1
2
3
4
5
```

---

# Key Takeaways

- Loops repeat a block of code.
- `for` loops are useful when the number of iterations is known.
- `while` loops are useful when the number of iterations is unknown.
- `do-while` loops always execute at least once.
- `break` exits the loop immediately.
- `continue` skips the current iteration.
- Always ensure that the loop condition eventually becomes false.