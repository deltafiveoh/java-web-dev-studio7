package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        DVD myDVD = new DVD("myDVD", 6, "optical", 500);
        CD myCD = new CD("myCD", 2, "optical", 200);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(myDVD.report());
        System.out.println(myCD.report());

        System.out.println("");

        myDVD.playDVD(myDVD);
        myDVD.playDVD(myCD);

        System.out.println("");

        myCD.read();
        myCD.write();
        myDVD.spinDisc();
        myDVD.storeData();
        myCD.start();
        myDVD.stop();
    }
}
