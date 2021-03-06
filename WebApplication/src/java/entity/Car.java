/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvRecurse;
import xenum.CarType;
import java.util.Date;

/**
 *
 * @author ITSUKA KOTORI
 */
public class Car extends AbstractEntity<Car>{
    
    
    /*
    * Car License
    */
    @CsvBindByName
    private String plate_id;
    
    /*
    * Car License
    */
    @CsvBindByName
    private String license;
    
    /*
    * To calculate the year using the car?
    */
    @CsvBindByName
    private Date regDate;
    
    /*
    * CarType
    */
    @CsvBindByName(column = "car_type_code")
    private String carType;
    
    /*
    * To calculate the year using the car?
    */
    @CsvBindByName
    private String driver_id;
    
    public Car() {
    }

    public Car(String plate_id, String license, Date regDate, String carType, String driver_id) {
        this.plate_id = plate_id;
        this.license = license;
        this.regDate = regDate;
        this.carType = carType;
        this.driver_id = driver_id;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getString() {
        return driver_id;
    }

    public void setString(String driver_id) {
        this.driver_id = driver_id;
    }

    public String getPlate_id() {
        return plate_id;
    }

    public void setPlate_id(String plate_id) {
        this.plate_id = plate_id;
    }

    public Object getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }
    
    @Override
    public boolean isNotNull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean id_equals(Object obj) {
        return this.plate_id.equals(((Car)obj).plate_id);
    }
    
    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Car{" + "plate" + this.plate_id + ", license=" + license + ", regDate=" + regDate + ", carType=" + carType + ", driver_id=" + driver_id + '}';
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
