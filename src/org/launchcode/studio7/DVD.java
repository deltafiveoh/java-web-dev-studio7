package org.launchcode.studio7;

public class DVD extends BaseDisc implements DiscMethodMap{


    public DVD(String name, int storageCapacity, String dataType, int spinRate) {
        super(name, storageCapacity, dataType, spinRate);
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD is spinning");
    }

    @Override
    public void storeData() {
        System.out.println("DVD is storing data");
    }

    @Override
    public void write() {
        System.out.println("DVD is being written to");
    }

    @Override
    public void read() {
        System.out.println("DVD is being read");
    }

    @Override
    public String report() {
        return "This dvd: " + this.getName() + " " + this.getSpinRate() + " rpm " + this.getDataType() + " data " + this.getStorageCapacity() + " gb";
    }

    //unlike a CD a DVD player can play DVDs or CDs
    void playDVD(DVD dvd){
        System.out.println("Playing " + dvd.getName());
    }

    void playDVD(CD cd){
        System.out.println("Playing " + cd.getName());
    }

    void stop(){
        super.stop();
        System.out.println("DVD stopped motion");
    }
}
