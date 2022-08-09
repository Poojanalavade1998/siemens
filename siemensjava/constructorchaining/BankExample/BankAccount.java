package constructorchaining.BankExample;

public class BankAccount {
    

private String BankAccountHolderName;
private String BankAccountNumber; 
private String BankAccountIFSCcode;
private String BankAccountBranch;
DebitCard bankAccountDebitCard;


   

    public BankAccount(String BankAccountHolderName, String BankAccountNumber, String BankAccountIFSCcode, String BankAccountBranch, DebitCard bankAccountDebitCard) {
        this.BankAccountHolderName = BankAccountHolderName;
        this.BankAccountNumber = BankAccountNumber;
        this.BankAccountIFSCcode = BankAccountIFSCcode;
        this.BankAccountBranch = BankAccountBranch;
        this.bankAccountDebitCard = bankAccountDebitCard;
    }


    public String getBankAccountHolderName() {
        return this.BankAccountHolderName;
    }

    public void setBankAccountHolderName(String BankAccountHolderName) {
        this.BankAccountHolderName = BankAccountHolderName;
    }

    public String getBankAccountNumber() {
        return this.BankAccountNumber;
    }

    public void setBankAccountNumber(String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }

    public String getBankAccountIFSCcode() {
        return this.BankAccountIFSCcode;
    }

    public void setBankAccountIFSCcode(String BankAccountIFSCcode) {
        this.BankAccountIFSCcode = BankAccountIFSCcode;
    }

    public String getBankAccountBranch() {
        return this.BankAccountBranch;
    }

    public void setBankAccountBranch(String BankAccountBranch) {
        this.BankAccountBranch = BankAccountBranch;
    }

    public DebitCard getBankAccountDebitCard() {
        return this.bankAccountDebitCard;
    }

    public void setBankAccountDebitCard(DebitCard bankAccountDebitCard) {
        this.bankAccountDebitCard = bankAccountDebitCard;
    }


    @Override
    public String toString() {
        return "{" +
            " BankAccountHolderName='" + getBankAccountHolderName() + "'" +
            ", BankAccountNumber='" + getBankAccountNumber() + "'" +
            ", BankAccountIFSCcode='" + getBankAccountIFSCcode() + "'" +
            ", BankAccountBranch='" + getBankAccountBranch() + "'" +
            ", bankAccountDebitCard='" + getBankAccountDebitCard() + "'" +
            "}";
    }

    
}
