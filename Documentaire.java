public class Documentaire extends Filme {
    private String sujet ;
    private static final float tarif = 2.0f;

     public Documentaire(String titre, String realisateur, String pays, int duree, int nombrePlacesReservees, String sujet) {
        super(titre, realisateur, pays, duree, nombrePlacesReservees); 
        this.sujet = sujet;

     }
     @Override
    public String toString() {
        return super.toString() + " - Sujet : " + sujet + " - Tarif : " + tarif + "DT";
    
    }
     float totalVenteBillets() {
        return tarif * getnb(); 
    }

    public static void main(String[] args) {
        Documentaire doc = new Documentaire("La Nature", "Amina Ben Saïd", "Tunisie", 90, 50, "Écologie");
        System.out.println(doc.toString());
        System.out.println("Total des ventes de billets pour le documentaire : " + doc.totalVenteBillets() + " DT");
    }
}