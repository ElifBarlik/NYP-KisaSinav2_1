//Daire classi Konut soyut sinifi extend eder ve hazir interface olan Comparable arayuzunu implemente eder
public class Daire extends Konut implements Comparable<Daire>{
    private int apartmentNumber;  //degisken tanimlama
    Daire(String address, int apartmentNumber) {  //yapici metot
        super(address);  //Konut sinifinin address degiskenini miras alir
        this.setApartmentNumber(apartmentNumber);
    }

    @Override
    public void displayInfo() {  //Daire sinifinin bilgilerini yazdiran metot. Konut sinifindan override edilir
        System.out.println("Daire adresi: "+address+"\tDaire numarasi: "+getApartmentNumber());
    }

    @Override
    public int compareTo(Daire o) {   //karsilastirma metotu
        return this.apartmentNumber-o.apartmentNumber;  //parametredeki daire ile class icindeki dairenin numaralari eslesirse 0 doner.
    }


    //Kapsulleme
    public int getApartmentNumber() {
        return apartmentNumber;
    }
    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
