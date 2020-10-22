import java.util.Scanner;
public class GroceryShopping {

   public static void main(String[] args){
Scanner sc = new Scanner(System.in);
      float total = 0.0F;
      int purchases = 0;
      System.out.println("Put purchases on the counter.");
      System.out.print("Enter cost of first item: ");
      float nextPurchase = sc.nextFloat();
      while (nextPurchase > 0.0){
           total += nextPurchase;
           purchases++;
           System.out.print("Enter cost of next item: ");
           nextPurchase = sc.nextFloat();
       }
      System.out.print("Total cost: ");
      System.out.println(total);
      System.out.print("Number of items:  ");
      System.out.println(purchases);
      }
   }