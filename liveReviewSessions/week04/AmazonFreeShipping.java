package week04;

public class AmazonFreeShipping {
    public static void main(String[] args) {

        double totalPrice = 25;

        if (totalPrice >= 25.0) {
            System.out.println("FREE SHIPPING ELIGIBLE.Your order total:$25");
        } else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING");
        }


        System.out.println(totalPrice);

    }
}

