package gestionsalaires;


import java.util.ArrayList;

public class Services {

    private ArrayList <Employe> employes;

    public Services() {
    this.employes = new ArrayList<Employe>();
    }

    public void AjouterEmployes(Employe e){
        this.employes.add(e);
    }

    public void  ListerEmployes(){
        for (Employe e:employes){
            System.out.println(e.getDescription());
        }
    }
    public void CalculSalaires(){
        double somme = 0;
        for (Employe e : employes){
            somme+=e.getSalaire();
        }
        System.out.println("La somme total des salaires est : "+somme);
    }
}
