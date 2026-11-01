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