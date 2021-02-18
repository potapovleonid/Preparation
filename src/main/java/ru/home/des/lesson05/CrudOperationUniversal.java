package ru.home.des.lesson05;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;

public class CrudOperationUniversal<T, E> {

    private Class<T> type;
    private Class<E> id;

    private SessionFactory factory;
    private Session session;

    public CrudOperationUniversal(Class<T> type, Class<E> id) {
        this.type = type;
        this.id = id;
        factory = session.getSessionFactory();
    }

    private static SessionFactory getSessionFactory(){
        return new Configuration().configure("configs/hibernate.cfg.xml")
                .buildSessionFactory();
    }

    public void saveAndUpdate(T obj){
        session = factory.getCurrentSession();
        session.save(obj);
    }

    public E save(T obj){
        session = factory.getCurrentSession();
        return (E) session.save(obj);
    }

    public T findById(E obj){
        session = factory.getCurrentSession();
        T findObj = session.get(type, (Serializable) obj);
        return findObj;
    }

    public void delete(T obj){
        session = factory.getCurrentSession();
        session.delete(obj);
    }
}
