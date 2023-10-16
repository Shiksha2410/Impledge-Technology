# Impledge-Technology
Impledge Technology's coding test question repository for assessing programming skills and problem-solving abilities.

**WORD COMPOSITION PROBLEM**

This Java program, LongestCompoundWord, is designed to find the longest and second-longest compound words within a given text file. Compound words are formed by concatenating other words from the input file. The program utilizes a TreeMap and a HashMap to efficiently store and process the words. Here, we provide a brief overview of the program and instructions for usage.

**FEATURES**

Reads a list of words from a text file.
Finds the longest compound word and the second-longest compound word.
Efficiently utilizes data structures like TreeMap and HashMap.
Provides the execution time in milliseconds.

**EXECUTION STEPS**

To run the program, proceed as follows:

1.Confirm that Java is installed on your computer.

2.Compile the program by executing the command:

           javac Main.java

3.Launch the program by entering:

           java Main

4.When prompted, input the filename of the target input file.

5.The program will present the most extended compound word, the second most extended compound word, along with the time it took to analyze the input file.

**Design Approach and Considerations:**

The Compound Word Finder program was conceived with a primary objective in mind: to efficiently identify the longest and second-longest compound words from a list of alphabetically sorted words. Several key design decisions were made, which include:

1.Utilizing a HashSet for rapid word lookup.

2.Implementing a recursive algorithm to detect compound words.

3.Sorting words based on their length to enhance efficiency.

4.Offering user-friendly console output for readability.

5.Ensuring a user-friendly experience by prompting the user for the input file's filename.

These design choices were made to strike a balance between optimizing performance, enhancing accessibility, and conducting a comprehensive analysis of compound words, making the program a valuable tool across various applications.

The program will then show the longest compounded word, the second longest compounded word, and the time it took to process the input file.  

**Algorithm Utilized**

  **Steps:**

  
Certainly, here's an alternative way to present the algorithm and steps:

Algorithm Utilized

Steps:

1.Initialize a CompoundWordFinder object to oversee the word dictionary.

2.Read the user-specified input file, extracting words and inserting them into the dictionary.

3.Sort the word list by length in a descending order.

4.Set variables for the longest and second longest compound words (both initially null).

5.Traverse the sorted list of words:

  Examine if a word is a compound word using the isCompoundWord method.

  If it's a compound word:

   If the longest compound word is null, assign it the current word.
   
   If the second longest compound word is null, assign it the current word and exit the loop.

6.Record the end time of the process.

7.Calculate the time taken (end time - start time).

8.Display the results in the console:

   The longest compound word.

   The second longest compound word.

    The processing time for the input file (in milliseconds).

**About:**

A solution for the Word Composition Problem, developed as part of the Impledge Technologies Interview Task. This program identifies the longest compounded words within alphabetically sorted lists of words.

**Resources:**

Readme

Activity

**Statistics:**

Stars: 0

Watchers: 1

Forks: 0

**Report Repository**

Releases

No releases published.

**Languages:**

Java: 100.0%

**Input File Format**

The input file should contain a list of words, with one word per line. For example:

boy

girl

man

womengirl

boywomengirl

girlboymanwomen

**How it Works**

1.The program reads the input file and populates a TreeMap and a HashMap with the words from the file.

2.It then finds the longest and second-longest compound words by iterating through the TreeMap and checking if a word can be formed by concatenating other words.

3.The results, along with the execution time, are displayed on the console.

**Program Output**


**LONGEST COMPOUND WORD IS: girlboymanwomen**

**SECOND LONGEST COMPOUND WORD IS: boywomengirl**

**TIME REQUIRED TO COMPLETE THE EXECUTION IS: 123 milliseconds**
