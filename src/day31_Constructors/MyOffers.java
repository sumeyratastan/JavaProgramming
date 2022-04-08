package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {


        Offer offer1=new Offer();
        offer1.setInfo("VA","Amazon Inc","SDET",110000,true,true,true,true);


        Offer offer2=new Offer();
        offer2.setInfo("CA","Sony Inc","QA",120000,true,false,false,true);


        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);


        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, true, true);


        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        System.out.println("----------------------------------------");

        Offer[]myOffers={offer1,offer2,offer3,offer4,offer5};

       /* ArrayList<Offer>fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p->!p.isFullTime==true);
        System.out.println(fullTimeOffers.size());

        ArrayList<Offer>localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p->!(p.location.equals("VA")||p.location.equals("CA")));
        System.out.println(localOffers.size());

        ArrayList<Offer>benefitAndPto=new ArrayList<>(Arrays.asList(myOffers));
        benefitAndPto.removeIf(p->!(p.hasBenefit==true||p.hasPTO==true));
        System.out.println(benefitAndPto.size());

        ArrayList<Offer>tittle=new ArrayList<>(Arrays.asList(myOffers));
        tittle.removeIf(p->!p.jobTittle.equals("SDET"));
        System.out.println(tittle.size());

        ArrayList<Offer>salaryOfJob=new ArrayList<>(Arrays.asList(myOffers));
        salaryOfJob.removeIf(p->p.salary<100000);
        System.out.println(salaryOfJob.size());
*/

        ArrayList<Offer>myOffers1=new ArrayList<>(Arrays.asList(myOffers));
        ArrayList<Offer>fullTime=new ArrayList<>(Arrays.asList());
        for(Offer each: myOffers1){
            if(each.isFullTime==true){
                fullTime.add(each);
            }
        }
        System.out.println(fullTime.size());



























    }
}
/*
2. Create a class named MyOffers:
				2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */