package by.bigroi.wear.dao.impl;

import by.bigroi.wear.dao.intefaces.DAOInterface;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOInterfaceImpl implements DAOInterface {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveEntity(Object obj) {
        sessionFactory.getCurrentSession().save(obj);
    }

    @Override
    public boolean isRegistered(Object obj) {
        ///// check customer by Criteria//////
        return true;
    }
}
