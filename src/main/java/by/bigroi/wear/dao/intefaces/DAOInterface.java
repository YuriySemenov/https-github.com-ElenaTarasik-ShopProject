package by.bigroi.wear.dao.intefaces;

public interface DAOInterface <T>{

    void saveEntity(T obj);
    boolean isRegistered(T obj);
}
