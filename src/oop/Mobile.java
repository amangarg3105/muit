package oop;


public class Mobile {

    private String imei;

    public double androidVersion;

    public String dialingPad;

    public String screenSize;

    //Constant
   public static final String brandName = "Samsung";




    Mobile(String imei) {
       this.imei = imei;

       //this becomes m1
        //this becomes m2
        // this becomes m3

    }

    public void videoCallingFeature(long number) {
        System.out.println("Calling this number  " + number);
    }


    public void saveNumber(long number) {
        checkingUpdates();
        if(this.androidVersion > 5.0) {
            System.out.println("We will save this number");
        } else {
            System.out.println("Please upgrade your android version");
        }
    }

    private void checkingUpdates() {

    }

    public String getImei() {
        if(this.androidVersion > 5.0) {
            return this.imei;
        } else {
            return null;
        }
    }
}


class Camera {
    int pixels;

    //Hardware

    Camera() {

    }


}

class ChipSet {

    String chipSetName;

    //Processor
}
