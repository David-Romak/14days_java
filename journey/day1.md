# My 12-Day Java Journey with Bro Code (2025 Tutorial) 🚀

**Daily Commitment**: 1 hour/day ⏳ | **Target Completion**: 19thApril, 2025  
**Progress**: [✔️] Day 1 | [⬜] Day 2 | [⬜] Day 3 | ... | [⬜] Day 12

> "The only way to learn a new programming language is by writing programs in it." — Dennis Ritchie

---

## 📅 Day 1: Back to Basics
**Video Segment**: Hour 1/12  
**Date**: 08thApril,2025 
**Biggest Challenge**: Scanner input quirk with `nextInt()`/`nextLine()`

### 🔥 Key Takeaways
1. **Output Fundamentals**  
   - `print()` vs `println()`: When to use each for formatting
   - Escape sequences: `\n` for new lines, `\"` for quotes

2. **Hidden Keyboard Magic** ⌨️  
   - Windows Alt codes (NumLock required):
     - `Alt + 0178` → ² (squared symbol)
     - `Alt + 24` → ↑ (up arrow)

3. **Memory Concepts** 🧠  
   - Heap vs Stack ([Alex Hyett's explanation](https://youtu.be/5OJRqkYbK-4?si=GIbKlB6cUzCoGm6A)):
     ```plaintext
     Stack: Method calls & local variables (LIFO)
     Heap: Dynamic memory for objects (global access)
     ```

4. **Scanner Workaround** 🛠️  
   Fixing the `nextInt()` → `nextLine()` skip:
   ```java
   Scanner scanner = new Scanner(System.in);
   
   System.out.print("Enter age: ");
   int age = scanner.nextInt();  // Leaves \n in buffer
   
   scanner.nextLine();  // Clear the buffer!
   
   System.out.print("Enter name: ");
   String name = scanner.nextLine();

5. **Math Precedence acroynms with PEMDAS and BODMAS. "Its about precedece not letter following"**
  ` PEMDAS = Parentheses → Exponents → Multiplication/Division → Addition/Subtraction
    (Different acronym, same order as BODMAS)`
   
7. **Syntax Nuances**
      static keyword position: static String myMethod() 


   
