package TP1.pres;

import TP1.dao.DaoImpl;
import TP1.metier.MetierImpl;


public class PresentationV1 {
    public static void main(String[] args) {
        /*
        * Injection des dependances par instanciation statique => new
        */
        System.out.println("Instanciation statique");
        DaoImpl d = new DaoImpl(); // couplage fort
        MetierImpl metier = new MetierImpl(d); // Injection via constructeur
        metier.setDao(d); // Injection via le setter
        System.out.println("Res="+metier.calcul());
    }
}
