package gestionsalaires;

public class AgentAdmin extends Employe {

    public AgentAdmin(String nom, String prenom, int anciennete) {
        super(nom, prenom, anciennete, "Agent Administratif");
    }
    @Override
    public int getSalaire() {
        return (1900);
    }
}
