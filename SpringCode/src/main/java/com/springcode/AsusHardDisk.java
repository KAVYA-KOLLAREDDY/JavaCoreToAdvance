package com.springcode;

public class AsusHardDisk implements HardDisk{
    private String someData = "Data from Asus Hard Disk";

    @Override
    public String returnData(){
        return someData;
    }

    public void setSomeData(String someData){
        this.someData = someData;
    }

}
