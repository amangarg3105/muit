package oop;


public class CreateMobile {

    public static void main(String[] args) {

        Mobile m1 = new Mobile("134");
        m1.androidVersion = 11.0;
        m1.videoCallingFeature(123);
        m1.screenSize = "5.6 Inches";

        m1.saveNumber(987654321);
//
       System.out.println(m1);

//        Mobile m1 = new Mobile("123");
//        m1.androidVersion = 6.0;
//        m1.saveNumber(1233);
//
//       System.out.println(m1.imei);
//
//        Mobile m2 = new Mobile("456");
//        System.out.println(m2.imei);
//
//        Mobile m3 = new Mobile("789");
//        System.out.println(m3.imei);

        String brandName = Mobile.brandName;
        System.out.println(Mobile.brandName);







//        Mobile mobile2 = new Mobile("456");
//        mobile2.androidVersion = "9.0";
//        mobile2.videoCallingFeature(123);
//        mobile2.screenSize = "4.5 Inches";
//
//
//
//        mobile.imei = "7862";
//
//
//        System.out.println(mobile.imei);
//        System.out.println(mobile2.imei);
//
//
//
//        //Creating instance of Mobile Class
//        Mobile mobile3 = new Mobile("789");
//        mobile3.androidVersion = "9.0";
//        mobile3.screenSize = "5.1 Inches";
//
//        System.out.println(mobile3.screenSize);
//
//        Mobile mobile4 = new Mobile();





    }




}
