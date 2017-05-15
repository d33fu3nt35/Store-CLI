import java.text.NumberFormat;
import java.util.Scanner;

public class StoreClass {
    public static void printReceipt(String receipt, double total) {
        int counter = 1;
        for (int i = 0; i < receipt.length() - 1; ) {
            String separator = "\t";
            int start = receipt.indexOf(",", i);
            i = receipt.indexOf(",", start + 1); //end
            counter++;
            if (counter == 4) {
                counter = 1;
                separator = "\n";
            }
            System.out.printf(receipt.substring(start + 1, i) + separator);
        }
        NumberFormat in = NumberFormat.getCurrencyInstance();
        System.out.println("Your Total:\t" + in.format(total));
    }

    public static String getItem(Scanner optionScan) {
        System.out.println("Enter Item Name.");
        String itemName = optionScan.next();

        System.out.println("Enter Item Price");
        double itemPrice = optionScan.nextDouble();

        System.out.println("Enter Item Quantity");
        int itemQuantity = optionScan.nextInt();

        return itemName + "," + itemPrice + "," + itemQuantity;


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0.0;
        String receipt = ",";

        do{
            System.out.println("Enter an option.");
            System.out.println("1. Sale. \n 2. Print Receipt \n 3. Exit");
            Scanner optionScan = new Scanner(System.in);
            int input = optionScan.nextInt();
            switch (input) {
                case 1:
                    do {
                        String newItem = getItem(optionScan);
                        // Parse strings returned by getItem to calculate total
                        String newPrice = newItem.substring(newItem.indexOf(",") + 1, newItem.lastIndexOf(","));
                        String newQty = newItem.substring(newItem.lastIndexOf(",") + 1);
                        total += Double.parseDouble(newPrice) * Integer.parseInt(newQty);

                        System.out.println("Do you wish to continue? Y/n:");
                        String cont = optionScan.next();
                        if (!cont.toLowerCase().equals("y")) {
                            System.out.println(receipt.length());
                            break;
                        }
                    } while (true);
                case 2:
                    printReceipt(receipt, total);
                default:
                    System.exit(0);
            }
        }while(true);

    }
}
