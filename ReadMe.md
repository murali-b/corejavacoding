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