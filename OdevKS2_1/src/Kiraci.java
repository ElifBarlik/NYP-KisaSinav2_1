public class Kiraci {
    //Degisken tanimlama
    private String adi;
    private String soyadi;
    private EvSahibi evSahibi;
    Kiraci(String adi, String soyadi, EvSahibi evSahibi){ //yapici metot
        this.setAdi(adi);
        this.setSoyadi(soyadi);
        this.setEvSahibi(evSahibi);
    }

    public void displayInfo(){
        System.out.println("Kiraci adi: "+adi+" "+soyadi+"\tEv Sahibi: "+evSahibi.getAdi()+" "+evSahibi.getSoyadi());
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

    public EvSahibi getEvSah() {
        return evSahibi;
    }

    public void setEvSahibi(EvSahibi evSahibi) {
        this.evSahibi = evSahibi;
    }
}
