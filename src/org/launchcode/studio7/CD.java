package org.launchcode.studio7;

public class CD extends BaseDisc implements DiscMethodMap {

    private boolean isCD = true;

    public CD(String name, int storageCapacity, String dataType, int spinRate) {
        super(name, storageCapacity, dataType, spinRate);
    }

    @Override
    public void spinDisc() {
        System.out.println("CD is spinning");
    }

    @Override
    public void storeData() {
        System.out.println("CD is storing data");
    }

    @Override
    public void write() {
        System.out.println("CD being written to");
    }

    @Override
    public void read() {
        System.out.println("CD being read");
    }

    @Override
    public String report() {
        return "This cd: " + this.getName() + " " + this.getSpinRate() + " rpm " + this.getDataType() + " data " + this.getStorageCapacity() + " gb";
    }

    void playCD(CD cd){
        System.out.println("Playing " + cd.getName());
    }

    void start(){
        super.start();
        System.out.println("CD in motion");
    }
}
