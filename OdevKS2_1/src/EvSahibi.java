import java.util.ArrayList;
import java.util.List;

public class EvSahibi {
    //Degisken tanimlama
    private String adi;
    private String soyadi;
    private Bina bina;
    private List<Daire> daireler;
    EvSahibi(String adi, String soyadi, Bina bina){ //yapici metot
        this.setAdi(adi);
        this.setSoyadi(soyadi);
        this.setBina(bina);
        this.setDaireler(new ArrayList<>());
    }

    public void displayInfo(){ //EvSahibi sinifinin bilgilerini yazdiran metot
        System.out.println("Ev sahibi :"+getAdi()+" "+getSoyadi()+"\tBina bilgileri: "+ getBina().address+" "+ getBina().getNumberOfFloors()+" katli");
    }

    public void addApartment(Daire daire){  //EvSahibine daire ekleyen metot
        if(daire.compareTo(daire)>=0){
            getDaireler().add(daire);
            System.out.println("Daire Ev Sahibine eklendi.");
        }else {
            System.out.println("Daire bulunamadi!");
        }
    }

    //Kapsulleme
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Bina getBina() {
        return bina;
    }

    public void setBina(Bina bina) {
        this.bina = bina;
    }

    public List<Daire> getDaireler() {
        return daireler;
    }

    public void setDaireler(List<Daire> daireler) {
        this.daireler = daireler;
    }
}
