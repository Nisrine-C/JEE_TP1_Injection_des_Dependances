package TP1.ext;

import TP1.dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version web service");
        double temp = 11;
        return temp;
    }
}
