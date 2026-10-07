package gestionsalaires;


import java.util.ArrayList;

public class Services {

    private ArrayList <Employe> employes;

    public Services() {
    this.employes = new ArrayList<Employe>();
    }

    public void ListerEmployes(Employe a){
        employes.add(a);
    }
    public void CalculSalaires(){
        double somme = 0;
        for (Employe a : employes){
            somme+=a.getSalaire();
            System.out.println(a.getDescription());
        }
        System.out.println("La somme total des salaires est : "+somme);
    }
}
