package TP1.metier;

import TP1.dao.DaoImpl;
import TP1.dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao = new DaoImpl();

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 23;
        return res;
    }
    /*
    * Injecter dans le variable dao un objet
    * d'une classe qui implemente l'interaface IDao
    */

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
