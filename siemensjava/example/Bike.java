package example;

public class Bike {
   private String bikeRegNumber;
   private  String bikeBrand;
   private Permit bikePermit;


    public String getBikeRegNumber() {
        return this.bikeRegNumber;
    }

    public void setBikeRegNumber(String bikeRegNumber) {
        this.bikeRegNumber = bikeRegNumber;
    }

    public String getBikeBrand() {
        return this.bikeBrand;
    }

    public void setBikeBrand(String bikeBrand) {
        this.bikeBrand = bikeBrand;
    }

    public Permit getBikePermit() {
        return this.bikePermit;
    }

    public void setBikePermit(Permit bikePermit) {
        this.bikePermit = bikePermit;
    }



    public Bike(String bikeRegNumber, String bikeBrand, Permit bikePermit) {
        this.bikeRegNumber = bikeRegNumber;
        this.bikeBrand = bikeBrand;
        this.bikePermit = bikePermit;
    }

    @Override
    public String toString() {
        return "{" +
            " bikeRegNumber='" + getBikeRegNumber() + "'" +
            ", bikeBrand='" + getBikeBrand() + "'" +
            ", bikePermit='" + getBikePermit() + "'" +
            "}";
    }

}
