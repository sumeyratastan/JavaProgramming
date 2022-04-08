package day24_CustomMethod_Return;

public class ReturnStatement2 {
    public static void main(String[] args) {
        nameOfTheMonth(80);
    }



    public static void nameOfTheMonth(int number){
       if(number<1||number>12){
           System.out.println("invalid");
           return;
       }
            switch (number){
                case 1:
                    System.out.println("jan");
                    break;
                case 2:
                    System.out.println("feb");
                    break;
                case 3:
                    System.out.println("march");
                    break;
                case 4:
                    System.out.println("april");
                    break;
                case 5:
                    System.out.println("may");
                    break;
                case 6:
                    System.out.println("june");
                    break;
                case 7:
                    System.out.println("july");
                    break;
                case 8:
                    System.out.println("august");
                    break;
                case 9:
                    System.out.println("september");
                    break;
                case 10:
                    System.out.println("october");
                    break;
                case 11:
                    System.out.println("november");
                    break;
                case 12:
                    System.out.println("december");
                    break;

                default:
                    System.out.println("invalid");

                    break;

            }

    }




























}


