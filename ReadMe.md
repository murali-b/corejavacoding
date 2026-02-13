1.CountCharacters
       To count consecutive repeating characters, you can iterate through the string, 
comparing each character to the previous one and incrementing a counter. If the next 
character is different, you record the count and reset the counter for the new character. 
2. PrintNumbersWithTwoThreads
   print odd numbers and even numbers one by one order with the help of two Threads
   To achieve this in a coordinated way, we use a concept called Thread Synchronization. Without it, the threads would race against each other, and the numbers would likely print out of order.
   The most common approach is using a shared lock object and the wait() / notify() mechanism.
   The Logic
   Shared State: Both threads share a counter and a lock.
   The Condition: The "Even Thread" only prints if the number is even; otherwise, it waits. The "Odd Thread" does the same for odd numbers.
   The Handshake: After a thread prints, it calls notify() to wake up the other thread and then calls wait() to give up the lock.
   Key Takeaways
   synchronized(this): Ensures only one thread can execute the block at a time.
   wait(): Releases the lock so the other thread can take a turn.
   notify(): Signals the sleeping thread that it’s time to try again.
3. Find common elements from 3 lists : FCEF3List
      Using retainAll() (Most common) This method modifies the first list to keep only the elements present in the provided collections.
    To avoid losing your original data, create a temporary copy
4. Find middle of a list without knowing its size : FMLWKS
   The Logic
   Two Pointers: You start two pointers at the head of the list.
   The Race:
   The Fast Pointer moves two steps at a time.
   The Slow Pointer moves one step at a time.
   The Result: Since the fast pointer moves exactly twice as fast as the slow pointer, by the time the fast pointer reaches the end of the list, the slow pointer will be exactly at the middle.
5. Most commonly used String methods: MCUSM
   In Java, String objects are immutable, meaning these methods return a new string rather than modifying the original one. You can find the full documentation in the Java String API.
   1. Comparison & Checking
      equals(Object obj): Compares the content of two strings for equality.
      equalsIgnoreCase(String str): Compares strings ignoring case differences.
      contains(CharSequence s): Returns true if the string contains the specified sequence of characters.
      isEmpty(): Returns true if length() is 0.
   2. Transformation (Returns a new String)
      toLowerCase() / toUpperCase(): Converts all characters to lower or upper case.
      trim(): Removes leading and trailing whitespace.
      replace(char old, char new): Replaces all occurrences of a specific character or string.
      substring(int begin, int end): Extracts a portion of the string from the begin index to end - 1.
   3. Searching & Information
      length(): Returns the number of characters in the string.
      charAt(int index): Returns the character at the specified index.
      indexOf(String str): Returns the index of the first occurrence of the specified substring.
      startsWith(String prefix) / endsWith(String suffix): Checks if the string begins or ends with a specific pattern.
   4. Splitting & Joining
      split(String regex): Breaks the string into an array based on a Regular Expression.
      join(CharSequence delimiter, CharSequence... elements): A static method to join multiple strings with a delimiter (e.g., a comma). 
6.  Customized immutable class :CIC
    Rules for Creating an Immutable Class
    According to Oracle's Java Documentation, you should follow these standards:
    Declare the class as final: This prevents other classes from extending it and overriding its behavior.
    Make all fields private and final: Private fields restrict direct access, and final fields ensure values are assigned only once during construction.
    Provide no "setter" methods: Methods that modify the object's state must not exist.
    Perform "Defensive Copying" for mutable fields:
    In the Constructor: If you receive a mutable object (like a List, Map, or Date), do not store the original reference. Instead, create a deep copy of that object to prevent external changes.
    In Getter Methods: Never return the actual reference of a mutable field. Always return a copy or a clone so the caller cannot modify the internal state.
    Standards and Best Practices
    Initialization: Ensure all fields are fully initialized through a single constructor.
    Record Classes (Java 14+): For simple data carriers, use Java Records. They are immutable by default, though you must still manually handle defensive copies if the record contains mutable fields like lists.
    Immutable Collection Libraries: Consider using Google Guava's Immutable Collections or Vavr's Persistent Data Structures to simplify defensive copying and reduce boilerplate.
    Benefits of Immutability
    Thread Safety: Since state never changes, multiple threads can access the same object without needing complex synchronization.
    Reliability in Collections: Immutable objects make perfect keys for HashMaps because their hashCode remains constant.
    Simplified Debugging: Programs are easier to reason about because an object's behavior is predictable and free from unexpected side effects
7. 