package com.springcode;

public class Computer {
    private HardDisk hardDisk;

    public Computer(HardDisk hardDisk){
        this.hardDisk = hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk){
        this.hardDisk = hardDisk;
    }

    public void showData(){
        System.out.println(hardDisk.returnData());
    }
}
