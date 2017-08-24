package by.bigroi.wear.service.impl;

import by.bigroi.wear.dao.intefaces.DAOInterface;
import by.bigroi.wear.service.interfaces.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ObjectServiceImpl implements ObjectService {

    @Autowired
    private DAOInterface dao;

    @Override
    @Transactional
    public void saveEntity(Object obj) {
        dao.saveEntity(obj);
    }

    @Override
    @Transactional
    public boolean isRegistered(Object obj) {
        return dao.isRegistered(obj);
    }
}
