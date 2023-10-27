package org.example.business;

import org.example.dataAccess.JdbcCarDao;
import org.example.dataAccess.CarDao;
import org.example.entities.Car;

import java.util.List;

public class CarManager {
    private CarDao CarDao;

    public CarManager(CarDao CarDao) {
        this.CarDao = CarDao;
    }

    //CONTROLLER
    public void add(Car Car) throws Exception{
        if(Car.getPrice() < 10){
            throw new Exception("The price of Car, can not be less than 10 !! ");
        }
        System.out.println("******************************************************");
        if(Car.getStockAmount() < 1){
            System.out.println(Car.getCarBrand() + " - " + Car.getCarModelName()+ " : You added a new Model !!!");
            System.out.println("*****************************************************");
            CarDao.add(Car);
        }
        else if(Car.getStockAmount() >= 10){
            System.out.println(Car.getCarBrand() + " - " + Car.getCarModelName()+ " : There are 10 units of this model in stock. You can not add more !");
            System.out.println("*****************************************************");
        }
        else {
            CarDao.add(Car);
        }


        //CarDao CarDao = new JdbcCarDao();




    }
}