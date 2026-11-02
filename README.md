# jobsheet 8 

**Name:** Ilyasa Aghlazabarjad Saleksa  
**NIM:** 264107020234  
**Prodi:** Computer Science  
**Class:** TI-1I  

## Objective
1. Students are able to explain the syntax for writing loop programs (for, while, and dowhile).
2. Students are able to implement loop flowcharts using the Java programming language.

## Experiment 1
```java
import java.util.Scanner;

public class SiakadFor15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double score, highest = 0, lowest = 100;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score for student " + i + ": ");
            score = sc.nextDouble();
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        sc.close();
    }
}
```
### Question
1. Identify and indicate each component of the FOR loop in the program code of Experiment 1!
2. Why is the variable highest initialized to 0 and the variable lowest initialized to 100? What happens if highest is initialized to 100 and lowest is initialized to 0?
3. Explain the function and workflow of the following code snippet!
```java
if (score > highest) {
 highest = score;
}
if (score < lowest) {
 lowest = score;
}
```
4. Modify the program to count how many students pass and how many students fail, based
   on the passing threshold (minimum score of 60). Display the number of students who
   pass and fail after displaying the highest and lowest scores!
5. Commit and push the program code to GitHub

### Answer
1. 1. Initialization: int i = 1 – initializes the counter at 1.
   2. Condition: i <= 10 – the loop continues while i is less than or equal to 10.
   3.  Increment: i++ – increases the counter by 1 after each iteration.
   4.  Loop body: statements inside { } that input each student's score.2.
2. The variable highest is initialized to 0 because 0 is the lowest possible score, while lowest is initialized to 100 because 100 is the highest possible score. If highest is initialized to 100 and lowest to 0, the program may produce incorrect results because normal scores will not be greater than 100 or lower than 0.
3. The first if checks whether the current score is greater than the highest score. If it is, the variable highest is updated with the current score.
  
   The second if checks whether the current score is lower than the lowest score. If it is, the variable lowest is updated.
4.
```java

import java.util.Scanner;

public class SiakadFor15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double score, highest = 0, lowest = 100;
        int pass = 0, fail = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score for student " + i + ": ");
            score = sc.nextDouble();

            if (score > highest) {
                highest = score;
            }

            if (score < lowest) {
                lowest = score;
            }

            if (score >= 60) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Number of students who passed: " + pass);
        System.out.println("Number of students who failed: " + fail);

        sc.close();
    }
}
```
### Question
1. In the following code snippet, determine the meaning and purpose of the following
syntax:
```java
if (score < 0 || score > 100) {
 System.out.println("Invalid score. Please enter a valid score!");
 continue;
}
```
a. score < 0 || score > 100
b. continue
2. Why is the i++ statement written at the end of the WHILE loop? What happens if it is
written at the beginning of the WHILE loop?
3. If the number of students entered is 19, how many times will the WHILE loop run?
4. Modify the program so that, if a student receives grade A, the program displays an
additional message “Well done, keep up the good work!”
5. Commit and push the program code to GitHub
### Answer
1. 1. score < 0 || score > 100 This condition checks whether the score is invalid.
      1.  score < 0: checks if the score is negative. -
      2.  score > 100: checks if the score exceeds 100. -
      3.  ||: means OR, so either condition being true makes the score invalid.
   2. continue, The continue statement skips the remaining statements in the current loop iteration and returns to the beginning of the loop. This allows the user to enter the score again.
2. The i++ statement is written at the end so that the student counter increases only after a valid score has been entered and processed. If i++ is written at the beginning, the counter will increase even when the score is invalid.
