import java.util.Scanner;
public class Main3{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int quantity;
        int amount;
        int bill = 0;
        String select;

        System.out.println("__*WELCOME TO RVS FRESH*__");

        do {
            System.out.println("1. APPLE JUICE: 50"+" |6.POMOGRANET JUICE: 70"+" |11. MANGO JUICE  : 40");
            System.out.println("2. MANGO JUICE: 40"+" |7. PATHAM MILK    : 30"+" |12.OREO SHAKE   : 70 ");
            System.out.println("3.ORANGE JUICE: 40 "+"|8.WATERMELON JUICE: 30 "+"|13. VENNILA SHAKE: 60");
            System.out.println("4.LEMON JUICE:  30 "+"|9.PINEAPPLE JUICE: 35"+"  |14. PEAR JUICE  : 30");
            System.out.println("5.ROSE MILK :  30"+ "  |10. MOJITO       : 80"+"  |15. MUSMELON JUICE: 40");
            System.out.println("SELECT THE ITEM NUMBER.");
            int customer = sc.nextInt();

            switch (customer) {
                case 1:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 50;
                    bill = bill + amount;
                    break;
                case 2:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 40;
                    bill = bill + amount;
                    break;
                case 3:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 40;
                    bill = bill + amount;
                    break;
                case 4:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 30;
                    bill = bill + amount;
                    break;
                case 5:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 30;
                    bill = bill + amount;
                    break;
                case 6:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 70;
                    bill = bill + amount;
                    break;
                case 7:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 30;
                    bill = bill + amount;
                    break;
                case 8:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 30;
                    bill = bill + amount;
                    break;
                case 9:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 35;
                    bill = bill + amount;
                    break;
                case 10:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 80;
                    bill = bill + amount;
                    break;
                case 11:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 40;
                    bill = bill + amount;
                    break;
                case 12:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 70;
                    bill = bill + amount;
                    break;
                case 13:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 60;
                    bill = bill + amount;
                    break;
                case 14:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 30;
                    bill = bill + amount;
                    break;
                case 15:
                    System.out.println("NUMBER OF ITEMS ?");
                    quantity = sc.nextInt();
                    amount = quantity * 40;
                    bill = bill + amount;
                    break;
                    
                default:
                    System.out.println("SORRY SIR/MAM THIS ITEM NOT AVAILABLE. "
                            + "PLEASE SELECT SOMETHING ELSE.");
                    break;
            }

            System.out.println("IF YOU WANT TO SELECT ANY OTHER ITEMS...? "
                    + "YES, ENTER 'yes' (OR) NO, ENTER 'no' ");
            select = sc.next();

        } while (select.equalsIgnoreCase("yes"));

        System.out.println("YOUR TOTAL BILL: " + bill);
        System.out.println("*THANKS FOR COMING*");
    }

}
