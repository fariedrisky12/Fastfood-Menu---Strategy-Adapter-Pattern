import java.util.Scanner;
import java.text.DecimalFormat;

public class MainFastfood
{

private static Scanner scanner;
private static DecimalFormat decimalFormatter = new DecimalFormat("#");

   public static void main(String[] args)
   {
    FriedChicken friedchicken = new FriedChicken();
    Burger burger = new Burger();
    FrenchFries frenchfries = new FrenchFries();
    
    // menu fastfood
    System.out.println("1. Fried Chicken");
    System.out.println("2. Burger");
    System.out.println("3. French Fries");
    System.out.print("Select the menu : ");
    scanner = new Scanner(System.in);
    String choice = scanner.next();  

    if("1".equalsIgnoreCase(choice)) 
    {
        friedchicken.lookPrice();
        friedchicken.lookTime();

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the amount you want:");
        int nilai = input.nextInt();
        input.close();
        
        System.out.println("Total Fried Chicken : " + nilai);
        Price FriedChicken = new Fastfood();
        PriceAdapter friedchickenAdapter = new PriceAdapterImpl(FriedChicken);
        System.out.println("\n" + nilai + " Fried Chicken price is " +  decimalFormatter.format(friedchickenAdapter.getFriedChicken(nilai)) + " Dollar");
    }

    if("2".equalsIgnoreCase(choice)) 
    {

        burger.lookPrice();
        burger.lookTime(); Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the amount you want:");
        int nilai = input.nextInt();
        input.close();
        
        System.out.println("Total Burger : " + nilai);
        Price Burger = new Fastfood();
        PriceAdapter burgerAdapter = new PriceAdapterImpl(Burger);
        System.out.println("\n" + nilai + " Burger is " +  decimalFormatter.format(burgerAdapter.getBurger(nilai)) + " Dollar");
    }

    if("3".equalsIgnoreCase(choice)) 
    {
        frenchfries.lookPrice();
        frenchfries.lookTime(); Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the amount you want:");
        int nilai = input.nextInt();
        input.close();
        
        System.out.println("Total French Fries : " + nilai);
        Price FrenchFries= new Fastfood();
        PriceAdapter frenchfriesAdapter = new PriceAdapterImpl(FrenchFries);
        System.out.println("\n" + nilai + " French Fries price is " +  decimalFormatter.format(frenchfriesAdapter.getFrenchFries(nilai)) + " Dollar");
    }

   }
}
