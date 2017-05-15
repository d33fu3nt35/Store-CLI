import javax.sound.midi.SysexMessage;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by daniel on 5/15/17.
 */
public class StoreClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0.0;
        String receipt = ",";

        do{
            System.out.println("Enter an option.");
            System.out.println("1. Sale. \n 2. Print Receipt \n 3. Exit");
            Scanner optionScan = new Scanner(System.in);
            int input = optionScan.nextInt();
            if (input == 1){
                while(true){

                    System.out.println("Enter Item Name.");
                    String itemName = optionScan.next();

                    System.out.println("Enter Item Price");
                    double itemPrice = optionScan.nextDouble();

                    System.out.println("Enter Item Quantity");
                    int itemQuanity = optionScan.nextInt();

                    total += itemPrice * itemQuanity;
                    receipt += itemName + "," + itemPrice + "," + itemQuanity + ",";

                    System.out.println("Do you wish to continue? Y/n:");
                    String cont = optionScan.next();
                    if (!cont.toLowerCase().equals("y")) {
                        System.out.println(receipt.length());
                        break;
                    }
                }

            }else if (input == 2){
                for (int i =0; i < receipt.length()-1;) {
                    int start = receipt.indexOf(",", i);
                    i = receipt.indexOf(",", start+1); //end
                    System.out.println(receipt.substring(start+1, i));
                    System.out.println("Index is: " + i);

                }

            }else {
                System.exit(0);
            }


            // MENU
            // EVALUATE INPUT MENU
            // SALE LOOP
            // TOTAL = TOTAL + SALE.PRICE + SALE QUANTITY
            // RECEIPT = RECEIPT + SALENAME + ' , ' + SALEPRICE + ' , ' + SALEQUANTITY + ' , '
            // PRINT
            // ITERATE THROUGH STRING


        }while(true);

    }
}
