package day20_Array;

public class ClassmatesInitials {
    public static void main(String[] args) {

        String[] classmates={"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};


        int i=0;
        for (String each : classmates) {
            String result=""+each.charAt(i)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(result);
        }


    }
}
/*
1. create an array named classmates, and store 10 of your classmates'
full names
print the initials of each classmates in separate lines
 */