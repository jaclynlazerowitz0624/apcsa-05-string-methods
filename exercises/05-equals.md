# Exercise 5: Equality Predictions (S17 homework)

Use these variables for every row:

```java
String a = "Java";
String b = a;
String c = new String("Java");
String d = "java";
String e = null;
```

**Predict first.** Fill in the Predicted column for all ten rows BEFORE you run anything. A blank prediction scores zero. For compareTo rows write only negative, zero or positive.

| # | Expression | Predicted | Actual | Missed? |
|---|---|---|---|---|
| 1 | `a == b` | false | true | Yes |
| 2 | `a == c` | true | false | Yes |
| 3 | `a.equals(c)` | true | true | No |
| 4 | `a.equals(d)` | false | false | No |
| 5 | `a.toLowerCase().equals(d)` | true | true | No |
| 6 | `a.compareTo(c)` | 0 | zero | No |
| 7 | `a.compareTo(d)` | -1 | negative | No |
| 8 | `"apple".compareTo("banana")` | -1 | negative | No |
| 9 | `"b".compareTo("a")` | 1 | positive | No |
| 10 | `a.equals(e)` | missing | false | Yes |

Run each one in a scratch Java file and fill in Actual. Mark every miss.

## For each miss: one sentence
Say whether it was `==` versus `equals`, or the sign of `compareTo`.

- 1. It was a == comparison. (a and b had the same value they're identical)
2. It was also a == comparison. (a and c are identical)
10. This was an equals comparison (a does not equal "null")

## One safe line
Write ONE line of code that is true when `s` matches "yes" and never crashes, even if `s` is `null`.

```java
// your line
String s = "yes";
String t = s;
"yes".equals(s);
```

## Before tomorrow
Peer code review is next class. Make sure `src/EmailParser.java` is pushed to your fork.
