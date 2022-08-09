package accountexample;

public class BankAccount {
    private String bankAccountHolderName;
    private String bankCustomerID;
    private long bankAccountNumber;
    private String bankAccountIFSCcode;

    private DebitCard bankAccountDebitCard;

    public String getBankAccountHolderName() {
        return this.bankAccountHolderName;
    }

    public void setBankAccountHolderName(String bankAccountHolderName) {
        this.bankAccountHolderName = bankAccountHolderName;
    }

    public String getBankCustomerID() {
        return this.bankCustomerID;
    }

    public void setBankCustomerID(String bankCustomerID) {
        this.bankCustomerID = bankCustomerID;
    }

    public long getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountIFSCcode() {
        return this.bankAccountIFSCcode;
    }

    public void setBankAccountIFSCcode(String bankAccountIFSCcode) {
        this.bankAccountIFSCcode = bankAccountIFSCcode;
    }

    public DebitCard getBankAccountDebitCard() {
        return this.bankAccountDebitCard;
    }

    public void setBankAccountDebitCard(DebitCard bankAccountDebitCard) {
        this.bankAccountDebitCard = bankAccountDebitCard;
    }

    
}
