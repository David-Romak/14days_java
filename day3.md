# Java Learning Journey - Day 3/12 🔄

**Focus:** Deepening Control Flow Understanding & String Operations

---

## 🔑 New Concepts

### 1. Nested If Statements
```java
if (user.isAuthenticated()) {
    if (user.isAdmin()) {
        showAdminDashboard();
    } else {
        showUserDashboard();
    }
} else {
    showLoginScreen();
}

Key Insight: Useful for multi-layer checks, but keep max 3 levels deep for readability.

2. String Investigation Methods
String message = "Hello, [User_123]!";

int firstBracket = message.indexOf("[");    // 7
int lastBracket = message.lastIndexOf("]"); // 14
boolean hasNumbers = message.contains("123"); // true

// Extract username between []
String username = message.substring(
    firstBracket + 1, 
    lastBracket
); // "User_123"
3. Scanner Nuances Demystified
The Buffer Trap:

Scanner scanner = new Scanner(System.in);

System.out.print("Enter age: ");
int age = scanner.nextInt(); // Leaves \n in buffer

System.out.print("Enter name: ");
String name = scanner.nextLine(); // Reads empty \n!

// Fix: scanner.nextLine(); after nextInt()
4. Modern Switch Expressions
String userType = switch (accessLevel) {
    case 1 -> "Guest";
    case 2 -> {
        if (hasSpecialAccess) yield "VIP User";
        else yield "Standard User";
    }
    default -> throw new IllegalArgumentException();
};

//Advantages:

-No accidental fall-through
-Direct value returns with ->
-Block scope with yield

💎 Reinforced Fundamentals
If-Else Chaining, when to use vs. switch statements

String Immutability: why message.contains() doesn't modify original

Scanner Lifetime: Why resource closure matters

🧠 Key Realizations
"Nested ifs feel powerful but can become messy quickly"

"String methods are chainable: trim().substring().toLowerCase()"

"Enhanced switches make complex logic more readable"

📚 Resource Highlight
Java 17 Switch Documentation