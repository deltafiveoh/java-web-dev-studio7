package org.launchcode.studio7;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private String dataType;
    private int spinRate;

    public BaseDisc(String name, int storageCapacity, String dataType, int spinRate){
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.dataType = dataType;
        this.spinRate = spinRate;
    }

    void start(){
        System.out.println("Started disk" );
    }

    void stop(){
        System.out.println("Stopped disk");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public int getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(int spinRate) {
        this.spinRate = spinRate;
    }


}
