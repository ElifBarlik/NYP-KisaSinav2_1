public class Bina extends Konut{  //Bina classi Konut classini extend eder
    private int numberOfFloors;  //degisken tanimlama
    Bina(String address, int numberOfFloors) {  //yapici metot
        super(address);  //Konut sinifinin address degiskenini miras alir
        this.setNumberOfFloors(numberOfFloors);
    }

    @Override
    public void displayInfo() { //Bina sinifinin bilgilerini yazdiran metot. Konut sinifindan override edilir
        System.out.println("Bina adresi: "+address+"\tBina kat sayisi: "+getNumberOfFloors());
    }


    //Kapsulleme
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
