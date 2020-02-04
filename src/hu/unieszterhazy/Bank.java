package hu.unieszterhazy;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {

    int money;
    int bond;
    String name;
    String ID;
    String nationality;

    ArrayList<UserAccount> accountList;

    public int getMoney(){
     return this.money;
    }

    public void setMoney(int newMoney){
        this.money =newMoney;
    }

    public Bank(int money, int bond, String name, String ID, String nationality) {
        this.money = money;
        this.bond = bond;
        this.name = name;
        this.ID = ID;
        this.nationality = nationality;
    }

    public int getBond() {
        return bond;
    }

    public void setBond(int bond) {
        this.bond = bond;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "Money=" + money +
                ", Bond=" + bond +
                ", Name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", Nationality='" + nationality + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return money == bank.money &&
                bond == bank.bond &&
                Objects.equals(name, bank.name) &&
                Objects.equals(ID, bank.ID) &&
                Objects.equals(nationality, bank.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(money, bond, name, ID, nationality);
    }

    public int withdrawMoney(int amount, UserAccount account){
        //TODO DENY WITHDRAW REQUEST IF FUNDS ARE LOWER THAN WITHDRAW AMOUNT.
        account.setAvailableFunds(account.getAvailableFunds()-amount);
        printMoney();
        return account.getAvailableFunds();
    }

    private void printMoney() {
        //TODO PRINT MONEY METHOD
    }

    public int depositMoney(int amount){
        //TODO DEPOSIT MONEY METHOD
        return 0;
    }

}
