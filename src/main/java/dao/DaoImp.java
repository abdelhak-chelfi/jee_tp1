package dao;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component("dao")
public class DaoImp implements IDao{
    /**
     * Create an Implementation of Dao Interface
     * Create an Implement methode getDate that return new Date
    **/
    @Override
    public Date getDate() {
        return new Date();
    }
}
