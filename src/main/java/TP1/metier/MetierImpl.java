package TP1.metier;

import TP1.dao.DaoImpl;
import TP1.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    private IDao dao ;

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

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
