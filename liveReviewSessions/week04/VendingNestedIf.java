package week04;

public class VendingNestedIf {
    public static void main(String[] args) {

        String selection = "drink"; //snack
        String drinkItem = "tea";
        String snackItem = "Candy";


        if (selection == "drink") {
            System.out.println(selection + " option is selected");

            if (drinkItem == "tea") {
                System.out.println("tea is selected");
            } else
                System.out.println("Coke is selected");

        } else if (selection == "snack") {
            ;
            System.out.println(selection + "option is selected");

            if (snackItem == "chips")
                System.out.println(snackItem + "is selected");
            else
                System.out.println("Candy is selected.");

        }else{
            System.out.println("invalid");
        }

    }
}
