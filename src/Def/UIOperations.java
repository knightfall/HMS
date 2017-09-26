package Def;

import java.util.*;
import java.sql.* ;
import java.math.*;
public class UIOperations {

    public static void main(String[] args)
    {



        Customer cd = new Customer();
        Scanner s = new Scanner(System.in);

        cd.setCustomerID("003");
        System.out.println("Press enter after each input");
        System.out.print("Customer Name: ");
        cd.setName(s.nextLine());
        System.out.print("Customer Phone Number: ");
        cd.setPhoneNum(s.nextLine());

        int gend=0;

        while(gend!=1 || gend!=2) {
            System.out.println("Type 1 for male or 2 for female");
            System.out.print("Customer Gender: ");
            gend=s.nextInt();
            if(gend==1)
            {
                cd.setGender(Gender.Male);
                break;
            }
            if(gend==2)
            {
                cd.setGender(Gender.Male);
                break;
            }

        }

        gend=0;

        while(gend!=1 || gend!=2) {
            System.out.println("Type 1 if cust. has valid ID. If not type 2");
            System.out.print("Customer HasValidID: ");
            gend=s.nextInt();
            if(gend==1)
            {
                cd.setValidID(Boolean.TRUE);
                break;
            }
            if(gend==2)
            {
                cd.setValidID(Boolean.FALSE);
                break;
            }

        }
        s.nextLine();
        Address ad = new Address();
        System.out.println("Customer Address: ");
        System.out.print("Customer's Street No. : ");
        ad.setStreetNumber(s.nextLine());
        System.out.print("Customer's Street Name : ");
        ad.setStreetName(s.nextLine());
        System.out.print("Customer's Street Suburb : ");
        ad.setSuburb(s.nextLine());
        System.out.print("Customer's Postcode : ");
        ad.setPostcode(s.nextLine());
        cd.setAddress(ad);



       boolean bol= cd.addCustomer();

       System.out.println(bol);


    }
}
