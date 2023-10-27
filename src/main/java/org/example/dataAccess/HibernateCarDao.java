package org.example.dataAccess;

import org.example.entities.Car;

public class HibernateCarDao implements CarDao {

    @Override
    public void add(Car car){
        System.out.println("Inserted "+car.getCarBrand()+"/"+car.getCarModelName()+"to Database with using Hibernate...");
    }
    @Override
    public void update(Car car){
        System.out.println("Updated "+car.getCarBrand()+"/"+car.getCarModelName()+"to Database with using Hibernate...");
    }

    @Override
    public void delete(Car car){
        System.out.println("Deleted "+car.getCarBrand()+"/"+car.getCarModelName()+"to Database with using Hibernate...");
    }



}
