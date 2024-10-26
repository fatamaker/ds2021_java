import java.util.Scanner;
public class Filme {
    private String titre;
    private String réalisateur;
    private String pays_origine ;
    private int duree;
    private int nbr_place;

    public Filme (String titre, String r, String pays, int d){
        this.titre=titre;
        this.réalisateur=r;
        this.pays_origine=pays;
        this.duree=d;
    }
    public Filme(String titre, String realisateur, String pays, int duree, int nombrePlacesReservees) {
        this(titre,realisateur, pays, duree);
        this.nbr_place = nombrePlacesReservees;
    }
     public int getnb (){
        return nbr_place;
    }
     public void setnb (int a){
        this.nbr_place=a;
    }
    @Override
    public String toString() {
        return titre + " de " + réalisateur + " (" + pays_origine + ") - " + duree + "min.";
    }
   /*  float totalVenteBillets (int nbr_etu ){
        if(nbr_etu <=nbr_place){
            return((nbr_etu*2)+(nbr_place-nbr_etu)*3 );
        }

        else{
            System.out.println("Nombre de places insuffisant.");
            return -1; 
        }
        
    }
 */
   float totalVenteBillets (){
        Scanner scanner = new Scanner(System.in);
      int nombrePlacesEtudiant;
      do {
            System.out.print("Saisir le nombre de places pour étudiants : ");
            nombrePlacesEtudiant = scanner.nextInt();
        } while (nombrePlacesEtudiant > nbr_place);
     scanner.close();
    int nombrePlacesPublic = nbr_place - nombrePlacesEtudiant;

    return ((nombrePlacesEtudiant *2.0f) + (nombrePlacesPublic *3.0f));

   }

    public static void main(String[] args) {
        Filme film = new Filme("Insurrection", "Jilani Saadi", "Tunisie", 105, 50);
        System.out.println(film.toString());
        System.out.println("Total des ventes de billets : " + film.totalVenteBillets() + " DT");
    }

}