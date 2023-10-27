package org.example.dataAccess;

import org.example.business.Car;

public class HibernateCarDao implements CarDao {
    public void add(Car car){
        System.out.println("Inserted to Database with using Hibernate...");
    }

}
