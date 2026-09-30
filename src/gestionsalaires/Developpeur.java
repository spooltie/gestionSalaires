/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class Developpeur extends Employe{
    protected String languages;

    public Developpeur(String nom, String prenom, int anciennete, String languages) {
        super(nom, prenom, anciennete,"Developpeur");
        this.languages = languages;
    }
    @Override
    public int getSalaire(){
        if (languages=="java"){
            return(1900+anciennete*100+50);
        }
        else if (languages=="python"){
            return(1900+anciennete*100+70);
        }
        else if (languages=="php"){
            return(1900+anciennete*100+45);
        }
        return(1900+anciennete*100);

    }

    @Override
    public String getDescription() {
        return nom+" "+prenom+" est "+poste+" "+languages+" depuis "+anciennete+" ans et gagne "+getSalaire()+" €.";
    }
}
