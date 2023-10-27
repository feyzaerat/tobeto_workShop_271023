package org.example;


import org.example.business.CarManager;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        //VIEW
        Car car1 = new Car(1, "Chevrolet", "Cruze", 5000.00, 0 );
        Car car2 = new Car(2, "Opel", "Corsa", 4000.00, 10 );
        Car car3 = new Car(3, "Honda", "Civic", 3000.00, 3 );
        Car car4 = new Car(4, "Fiat", "Egea", 2500.00, 5 );



        CarManager CarManager = new CarManager(new JdbcCarDao());
        System.out.println("------------------------------------------------");
        CarManager.add(car1);
        System.out.println("------------------------------------------------");
        Car[] cars = {car1,car2,car3, car4};
        System.out.println("List of available cars after addition.. : ");
        for(Car car: cars){
            System.out.println(car.getStockAmount() + "--- " + car.getCarBrand() + "-" + car.getCarModelName());
        }

    }
}