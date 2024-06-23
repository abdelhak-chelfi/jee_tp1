package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao;       //private insertion

    /**
     * setDao methode took the value of dao
    **/
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    /**
     * Create an Implementation of Metier Interface
     * Create an Implement methode calcul that return a sum
     **/
    @Override
    public double calcul(int a, int b) {
        Date date = dao.getDate();      //Implementation 
        return (int) ((a * b) + date.getTime());
    }
}
