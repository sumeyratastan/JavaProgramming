package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {
          initials("sumeyra","tastan");
          domain("sumeyratastan.st@gmail.com");
          nameOfTheMonth(12);
        System.out.println("-----------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {
            domain(email);
        }

        System.out.println("-------------------------------------------------");

        nameOfTheDay(6);
        howManyDaysInMonth(8);
        groupOfTheAge(67);


    }





    public static void initials(String firstName,String lastName){
        String initials=firstName.charAt(0)+"."+lastName.charAt(0);
        initials=initials.toUpperCase();
        System.out.println(initials);

        }



    public static void domain(String mail){
        mail=mail.substring(mail.indexOf("@")+1,mail.lastIndexOf("."));
        System.out.println(mail);
    }


    public static void nameOfTheMonth(int number){
        if(number>0&&number<=12){
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
        }else{
            System.out.println("Invalid number");
        }
    }


    public static void nameOfTheDay(int number){
        if(number>0&&number<=7){
            switch (number){
                case 1:
                    System.out.println("mon");
                    break;
                case 2:
                    System.out.println("tue");
                    break;
                case 3:
                    System.out.println("wed");
                    break;
                case 4:
                    System.out.println("thur");
                    break;
                case 5:
                    System.out.println("fri");
                    break;
                case 6:
                    System.out.println("sat");
                    break;
                case 7:
                    System.out.println("sund");
                    break;

                default:
                    System.out.println("invalid");

                    break;
            }
        }else{
            System.out.println("Invalid number");
        }
    }


    public static void howManyDaysInMonth(int number){
    if(number>0&&number<=12){
        boolean has28days = number==2;
        boolean has30days = number==4||number==6||number==9||number==11;
        boolean has31days = number==1||number==3||number==5||number==7||number==8;
        // !has28days && !has30days
        if(has28days){
            System.out.println("28 days");
        }
        if(has30days){
            System.out.println("30 days");
        }

        if(has31days){
            System.out.println("31 days");
        }
    }


    }



    public static void groupOfTheAge(int age){
        if(age>0&&age<=120){
            if(age>=1&&age<=2){
                System.out.println("infant");
            }
            else if(age>=3&&age<=5){
                System.out.println("toddler");
            }
            else if(age>=6&&age<=9){
                System.out.println("kid");
            }
            else if(age>=10&&age<=12){
                System.out.println("pre-teen");
            }
            else if(age>=13&&age<=17){
                System.out.println("teenager");
            }
            else if(age>=18&&age<=20){
                System.out.println("young adult");
            }
            else if(age>=21&&age<=39){
                System.out.println("adult");
            }
            else if(age>=40&&age<=49){
                System.out.println("Young Middle-Aged Adult ");
            }
            else if(age>=50&&age<=54){
                System.out.println("Middle-Aged Adult");
            }
            else if(age>=55&&age<=64){
                System.out.println("Very Young Senior Citizen ");
            }
            else if(age>=65&&age<=74){
                System.out.println("Young Senior Citizen");
            }
            else if(age>=75&&age<=84){
                System.out.println("Senior Citizen");
            }
            else{
                System.out.println("Old Senior Citizen");
            }
        }else{
            System.out.println("Invalid");
        }
    }




















}












/*
1. Create a method that can display the initials of the person
2. Create a method that can display the domain of the email
3. Create a method that can display the name of the month based on
the given number to the method
4. Create a method that can print the name of the day based on the
given number to the method
5. Create a method that can print how many days a month has
6. 6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
 */