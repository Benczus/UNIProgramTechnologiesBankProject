package hu.unieszterhazy;

public class UserAccount {

    String userName;
    String ID;
    int availableFunds;

    int creditScore;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAvailableFunds() {
        return availableFunds;
    }

    public void setAvailableFunds(int availableFunds) {
        this.availableFunds = availableFunds;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public UserAccount(String userName, String ID, int availableFunds, int creditScore) {
        this.userName = userName;
        this.ID = ID;
        this.availableFunds = availableFunds;
        this.creditScore = creditScore;
    }


}
