package day09_IfStatements;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 6;

        if (grade == 1) {
            System.out.println("grade - " + grade);
            System.out.println("location - Apple orchard");
            System.out.println("number of groups - 3");
            System.out.println("teacher in charge - Ms. Smith");
        } else if (grade == 2) {
            System.out.println("grade - " + grade);
            System.out.println("location - Zoo");
            System.out.println("number of groups - 7");
            System.out.println("teacher in charge - Mr. Lee");
        } else if (grade == 3) {
            System.out.println("grade - " + grade);
            System.out.println("location - Aquarium");
            System.out.println("number of groups - 5");
            System.out.println("teacher in charge - Ms. Wilson");
        } else if (grade == 4) {
            System.out.println("grade - " + grade);
            System.out.println("location - Movie theater");
            System.out.println("number of groups - 2");
            System.out.println("teacher in charge - Ms. Reyes");
        } else if (grade == 5) {
            System.out.println("grade - " + grade);
            System.out.println("location - Museum");
            System.out.println("number of groups - 5");
            System.out.println("teacher in charge - Ms. Lela");
        } else if (grade == 6) {
            System.out.println("grade - " + grade +"\nlocation - Six Flags\nnumber of groups - 8\nteacher in charge - Mr. Watt");
          //  System.out.println("location - Six Flags");
          //  System.out.println("number of groups - 8");
          //  System.out.println("teacher in charge - Mr. Watt");
        } else {
            System.out.println("invalid grade number");
        }


    }
}
/*
8. Create a class called FieldTrip. Your school goes on a Field trip each
year. The place you go will be based on your grade. Given a variable
gradeNumber (1-6) figure out the details of your field trip. Print the
information at the end.
Data based on grade:
grade - 1
location -  Apple orchard
number of groups - 3
teacher in charge - Ms. Smith
grade - 2
location - Zoo
number of groups - 7
teacher in charge - Mr. Lee
grade - 3
location - Aquarium
number of groups - 5
teacher in charge - Ms. Wilson
grade - 4
location - Movie theater
number of groups - 2
teacher in charge - Ms. Reyes
grade - 5
location - Museum
number of groups - 5
teacher in charge - Ms. Lela
grade - 6
location - Six Flags
number of groups - 8
teacher in charge - Mr. Watt
 */