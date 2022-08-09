package vehicleportal;

  
public class Car extends Vehicle  {


    boolean carHasSunroof;
    Sound_System carSoundSystem;


    public Car (String vehicleRegNumber, String vehicleBrand, Category vehicleCategory , boolean carHasSunroof, Sound_System carSoundSystem,float vehiclePrice) {

        super (vehicleRegNumber , vehicleBrand , vehicleCategory, vehiclePrice);

        this.carHasSunroof = carHasSunroof;
        this.carSoundSystem = carSoundSystem;
    }




   @Override
    public void calculateRtoTax(){
        System.out.println(this.getVehiclePrice()   *   0.25);  
    }

}

   