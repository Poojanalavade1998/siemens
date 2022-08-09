package constructorchaining.BankExample;

public class DebitCard {
    
   private int debitCardCvv;
   private String  debitCardNumber;
    private int debitCardPin;
    private  String debitCardExpiryDate;




    public DebitCard(int debitCardCvv, String debitCardNumber, int debitCardPin, String debitCardExpiryDate) {
        this.debitCardCvv = debitCardCvv;
        this.debitCardNumber = debitCardNumber;
        this.debitCardPin = debitCardPin;
        this.debitCardExpiryDate = debitCardExpiryDate;
    }


    public int getDebitCardCvv() {
        return this.debitCardCvv;
    }

    public void setDebitCardCvv(int debitCardCvv) {
        this.debitCardCvv = debitCardCvv;
    }

    public String getDebitCardNumber() {
        return this.debitCardNumber;
    }

    public void setDebitCardNumber(String debitCardNumber) {
        this.debitCardNumber = debitCardNumber;
    }

    public int getDebitCardPin() {
        return this.debitCardPin;
    }

    public void setDebitCardPin(int debitCardPin) {
        this.debitCardPin = debitCardPin;
    }

    public String getDebitCardExpiryDate() {
        return this.debitCardExpiryDate;
    }

    public void setDebitCardExpiryDate(String debitCardExpiryDate) {
        this.debitCardExpiryDate = debitCardExpiryDate;
    }


    @Override
    public String toString() {
        return "{" +
            " debitCardCvv='" + getDebitCardCvv() + "'" +
            ", debitCardNumber='" + getDebitCardNumber() + "'" +
            ", debitCardPin='" + getDebitCardPin() + "'" +
            ", debitCardExpiryDate='" + getDebitCardExpiryDate() + "'" +
            "}";
    }
    
}
