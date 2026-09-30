package gestionsalaires;

public class Developpeur_Expert extends Developpeur{

    public Developpeur_Expert(String nom, String prenom, int anciennete, String languages) {
        super(nom, prenom, anciennete,languages);
        this.poste="Developpeur Expert";
    }

    @Override
    public int getSalaire() {
            return (int) (super.getSalaire()*1.10);
        }
    }
