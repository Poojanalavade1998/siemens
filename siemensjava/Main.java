// import java.net.MalformedURLException;

// import employeeportal.Employee;
// import employeeportal.Gender;
import vehicleportal.Car;
import vehicleportal.Category;
import vehicleportal.Sound_System;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("mh11au1009", "maruti", Category.CAR, false, Sound_System.ANDROID_AUTO , 3500000);       
        c1.calculateRtoTax();

    }          
}