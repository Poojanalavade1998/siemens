package vehicleportal;


public class Bike extends Vehicle {
   boolean bikeHasBackRest;
     BikeType bikeType;


    public Bike(String vehicleRegNumber, String vehicleBrand, Category vehicleCategory,  vehiclePriceboolean bikeHasBackRest, BikeType biketype) {
       
       super(vehicleRegNumber,vehicleBrand,vehicleCategory,VehiclePrice);
        this.bikeHasBackRest = bikeHasBackRest;
        this.bikeType = biketype;
    }


    @Override
    void calculateRtoTax(){
        System.out.println(this.getVehiclePrice()  *  0.1);
    }
    
}

