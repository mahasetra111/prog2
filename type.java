
import java.time.LocalDate;  
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

enum TypeMatch {
    AMICAL, OFFICIEL, TITRE
}


class Combattant {
    private String id;
    private String nom;
    private String prenom;
    private String nomCombattant;
    private double poids;
    private List<String> titres = new ArrayList<>();
    
    private int victoires = 0;
    private int defaites = 0;
    private int egalites = 0;

    public Combattant(String id, String nom, String prenom, String nomCombattant, double poids) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomCombattant = nomCombattant;
        this.poids = poids;
    }

    public void ajouterTitre(String titre) {
        titres.add(titre);
    }

    public void ajouterVictoire() {
        victoires++;
    }

    public void ajouterDefaite() {
        defaites++;
    }

    public void ajouterEgalite() {
        egalites++;
    }

    public String getNomCombattant() {
        return nomCombattant;
    }


}

class Match {
    private int id;
    private LocalDate date;
    private String lieu;B
    private TypeMatch type;

    private Combattant combattant1;
    private Combattant combattant2;


    public Match(int id, LocalDate date, String lieu, TypeMatch type, Combattant nomCombattant, Combattant nomCombattant2) {
        this.id = id;
        this.date = date;
        this.lieu = lieu;
        this.type = type;
        this.combattant1 = nomCombattant ;
        this.combattant2 = nomCombattant2 ;
    }

    public void terminer(double points1, double points2, String evenement ) {
        if (points1 == points2) {
            if (type != TypeMatch.AMICAL) {
                combattant1.ajouterEgalite();
                combattant2.ajouterEgalite();
            }
            System.out.println("pas de gagnant ");
        } else {
            Combattant gagnant = points1 > points2 ? combattant1 : combattant2;
            Combattant perdant = points1 > points2 ? combattant2 : combattant1;

            if (type != TypeMatch.AMICAL) {
                gagnant.ajouterVictoire();
                perdant.ajouterDefaite();
            }

            if (type == TypeMatch.TITRE && evenement != null && !evenement.isEmpty()) {
                gagnant.ajouterTitre(evenement );
                System.out.println("Titre décerné à : " + gagnant.getNomCombattant());
            }
        }
    }
}

   




