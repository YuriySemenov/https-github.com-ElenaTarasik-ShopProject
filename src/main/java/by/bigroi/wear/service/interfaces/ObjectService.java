package by.bigroi.wear.service.interfaces;

public interface ObjectService<T> {

        void saveEntity(T obj);
        boolean isRegistered(T obj);
}
