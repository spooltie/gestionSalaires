/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class GestionSalaires {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tests applicatifs
        Developpeur d = new Developpeur("Durand", "Michel", 4,"Python");
        Developpeur dd = new Developpeur("Durand", "Michel1", 4,"Java");
        Developpeur ddd = new Developpeur("Durand", "Michel2", 4,"Php");


        //Manager m = new Manager("Dupont", "Lucie", 2);
        //AgentAdmin a = new AgentAdmin("Durand","Pierre",4);



        System.out.println(d.getDescription());
        System.out.println(dd.getDescription());
        System.out.println(ddd.getDescription());

        //System.out.println(m.getDescription());
        //System.out.printf(a.getDescription());
    }
    
}
