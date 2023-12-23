public class Main {
    public static void main(String[] args) {

        //TANIMLAMALAR
        Bina bina1 = new Bina("Tekirdag",10);
        Daire daire1 = new Daire("Tekirdag",5);
        Daire daire2 = new Daire("Kirklareli",8);
        EvSahibi evSahibi1 = new EvSahibi("Elif","Barlik",bina1);
        Kiraci kiraci1 = new Kiraci("Berat","Sabri",evSahibi1);

        //evsahibi1 degiskeni ile displayInfo() metotu cagrilir
        evSahibi1.displayInfo();
        //evsahibine daireler eklenir
        evSahibi1.addApartment(daire1);
        evSahibi1.addApartment(daire2);
        //ev sahinin daireleri listelenir
        System.out.println("Ev Sahibinin Daireleri: ");
        for(Daire daire: evSahibi1.getDaireler()){
            daire.displayInfo();
        }
        //kiraci1 in bilgileri yazdirilir
        kiraci1.displayInfo();
        //bina1 in bilgileri yazdirilir
        bina1.displayInfo();




    }
}