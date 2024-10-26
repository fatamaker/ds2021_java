public class Jcc {
    private Filme[] competition ;
    private int annee ;
    private static final int NBFMAX=30;
    private int nbF;

    public Jcc (int annee){
        this.competition = new Filme [NBFMAX];
        this.annee=annee;
        this.nbF=0;

    }

    public void ajoutFilm (Filme f){
        if ( nbF<NBFMAX){
            competition[nbF] = f;
            nbF++;
        }
        else {
            System.out.println("la compétition est au complet");
        }

    }
    public void listeFilmsJCC (){
       System.out.println("Édition des JCC de " + annee + " - Liste des films en compétition :");
       for (int i=0;i<nbF;i++){
       System.out.println((i + 1)+" "+competition[i].toString());
       }
    
    }

    public float totalVenteBilletsJCC () {
       System.out.println("Édition des JCC de " + annee + " -le total des vente des Billets :");
       float s = 0.0f;
       for (int i=0;i<nbF;i++){
         if (competition[i] instanceof Documentaire) {
           Documentaire doc= (Documentaire) competition[i] ;
            s += doc.totalVenteBillets();
        } else {
            s += competition[i].totalVenteBillets();
        }
        
    }

       
       System.out.println("Le total des ventes de billets est : " + s + " DT");
       return s;
    
        
    }

    public static void main (String[] args){
        Jcc jcc2024 = new Jcc(2024);
        Documentaire film1=new Documentaire ("le dernier refuge","ousman","mali",86,30,"la guerre civile");
        Filme film2=new Filme ("Insurrection","Jilani Saadi","Tunisie",105);
       film2.setnb(45);
       jcc2024.ajoutFilm(film1);
       jcc2024.ajoutFilm(film2);
       jcc2024.listeFilmsJCC();
       jcc2024.totalVenteBilletsJCC();
       
       
    }



}