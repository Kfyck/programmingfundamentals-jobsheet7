# jobsheet 7

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
## Experiment 2
```java
import java.util.Scanner;
public class SiakadWhile15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score, studentCount, i = 0;
        System.out.print("enter the number of student: ");
        studentCount = sc.nextInt();

        while (i < studentCount) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            score = sc.nextInt();
            if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a valid score!");
            continue;
            }
            if (score > 80 && score <= 100) {
            System.out.println("The grade of student " + (i + 1) + " is A");
            } else if (score > 73 && score <= 80) {
            System.out.println("The grade of student " + (i + 1) + " is B+");
            } else if (score > 65 && score <= 73) {
            System.out.println("The grade of student " + (i + 1) + " is B");
            } else if (score > 60 && score <= 65) {
            System.out.println("The grade of student " + (i + 1) + " is C+");
            } else if (score > 50 && score <= 60) {
            System.out.println("The grade of student " + (i + 1) + " is C");
            } else if (score > 39 && score <= 50) {
            System.out.println("The grade of student " + (i + 1) + " is D");
            } else {
            System.out.println("The grade of student " + (i + 1) + " is E");
            }
            i++;


        }
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
    1. score < 0 || score > 100
    2.continue
2. Why is the i++ statement written at the end of the WHILE loop? What happens if it is
written at the beginning of the WHILE loop?
3. If the number of students entered is 19, how many times will the WHILE loop run?
4. Modify the program so that, if a student receives grade A, the program displays an
additional message “Well done, keep up the good work!”
5. Commit and push the program code to GitHub
### Answer
1. 1. score < 0 || score > 100 This condition checks whether the score is invalid.
      1.  score < 0: checks if the score is negative. 
      2.  score > 100: checks if the score exceeds 100. 
      3.  ||: means OR, so either condition being true makes the score invalid.
   2. continue, The continue statement skips the remaining statements in the current loop iteration and returns to the beginning of the loop. This allows the user to enter the score again.
2. The i++ statement is written at the end so that the student counter increases only after a valid score has been entered and processed. If i++ is written at the beginning, the counter will increase even when the score is invalid.

   If i++ is written at the beginning, the counter will increase even when the score is invalid. This can cause the program to skip a student number and finish before all students have entered valid scores.
3. The WHILE loop runs 19 times
```java
4. if (score > 80 && score <= 100) {
System.out.println("The grade of student " + (i + 1) + " is A");
System.out.println("Well done, keep up the good work!");
}
```
## Experiment 3
```java
import java.util.Scanner;
public class CafeDoWhile15 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       int bread, coffee,  tea;
       String customerName;
       int totalPrice;
       int coffeePrice = 12000, teaPrice = 7000, breadPrice = 20000;

       do {
        System.out.print("Enter customer name (type 'cancel' to exit): ");
        customerName = sc.nextLine();
        if (customerName.equalsIgnoreCase("cancel")) {
        System.out.println("Transaction canceled.");
        break;
        }
        System.out.print("Coffee quantity: ");
        coffee = sc.nextInt();
        System.out.print("Tea quantity: ");
        tea = sc.nextInt();
        System.out.print("Bread quantity: ");
        bread = sc.nextInt();
        totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);
        System.out.println("Total amount to pay: Rp " + totalPrice);
        sc.nextLine();
        } while (true);
        System.out.println("All transactions completed.");
    }
}
```
### Question
1. In this DO-WHILE loop, if the first customer name entered is “cancel”, how many times is
the loop executed?
2. State the stopping condition used in this DO-WHILE loop!
3. What is the function of using the value true in the DO-WHILE condition?
4. Why does this DO-WHILE loop still run even though it has no initialization and update
components?
### Answer
1. When the customer enters "cancel", the break statement immediately stops the loop.
2. The stopping condition is when the customer enters "cancel"
3. The value true makes the loop run continuously because its condition is always true. The loop only stops when a break statement is executed.
4. It executes its statements first and then checks the condition, so it doesn't need a initialization
## Assigment 1
```java
import java.util.Scanner;
public class assigment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticket = 50000, buysTicket , totalTicket = 0, totalRevenue = 0;
        double totalPrice = 0, discount = 0, tp;

        while (true){
            System.out.print("How many tickets sell?: ");
            buysTicket = sc.nextInt();
            if (buysTicket == 0) {
                break;
            }
            if (buysTicket < 0) {
                System.out.println("Tickets number invalid, please re-enter");
                continue;
            }
            if (buysTicket > 4) {
                discount =0.10;
            }
            else if (buysTicket > 10) {
                discount =0.15;
            }
            tp =  buysTicket * ticket;
            totalPrice = tp - (tp * discount);
            
            totalTicket += buysTicket;
            totalRevenue += totalPrice;

            System.out.println("Customer payment: Rp " + totalPrice);

        }
        System.out.println("====== DAILY SALE REPORT =====");
        System.out.println("Total ticket sold: " + totalTicket);
        System.out.println("Total revenue: Rp " + totalRevenue);

    }
}
```
## assigment 2
```java
import java.util.Scanner;

public class assigment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type, duration, total = 0;
        do {
            System.out.println("==================================");
            System.out.print("1=car \n2=motorcycle \n0=exit \nEnter vehicle type: ");
            type = sc.nextInt();
                if (type == 1 || type == 2) {
                    System.out.print("Enter duration of stay (hour): ");
                    duration = sc.nextInt();
                    if (type == 1) {
                        total += duration * 3000; 
                    }
                    else{
                        total += duration * 2000;
                    }
                }   
        } while(type != 0);    
        System.out.println("Total price:  " + total);
    }
}
```
