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