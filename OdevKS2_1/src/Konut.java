public abstract class Konut {  //daire ve bina classlarinin ortaklari icin soyut sinif tanimi
    String address;  //degisken tanimlama
    Konut(String address){  //yapici metot
        this.address=address;
    }
    public abstract void displayInfo();   //ortak islem icin soyut metot tanimi
}
