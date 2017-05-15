import java.util.Scanner;

/**
 * Created by daniel on 5/15/17.
 */
public class StoreClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // TOTAL DOUBLE = 0.00
        // RECEIPT STRING = '' ?

        do{
            System.out.println("Enter an option.");
            System.out.println("1. Sale. \n 2. Print Receipt \n 3. Exit");
            Scanner optionScan = new Scanner(System.in);
            int input = optionScan.nextInt();
            if (input == 1){
                do{
                    System.out.println("Enter Item Name.");
                    String itemName = optionScan.next();

                    System.out.println("Enter Item Price");
                    double itemPrice = optionScan.nextDouble();

                    System.out.println("Enter Item Quantity");
                    int itemQuanity = optionScan.nextInt();

                }while(true);

            }else if (input == 2){

            }else {

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
