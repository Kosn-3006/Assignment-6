package com.company;


public class BankAccount
{
    private  String firstName;
    private  String lastName;
    private  String accountNumber;
    private  int age;
    private  String phone;
    private  String balance;
    private  String hasPrivelages;


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getHasPrivelages() {
        return hasPrivelages;
    }

    public void setHasPrivelages(String hasPrivelages) {
        this.hasPrivelages = hasPrivelages;
    }

    private BankAccount(AccountBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.accountNumber=builder.accountNumber;
        this.age = builder.age;
        this.phone = builder.phone;
        this.balance = builder.balance;
        this.hasPrivelages=builder.hasPrivelages;
    }
    public static class AccountBuilder
    {
       private String firstName;
        private String lastName;
        private String accountNumber;
        int age;
        private String phone;
        private String balance;
        private String hasPrivelages;

        public AccountBuilder(String firstName, String lastName , String accountNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.accountNumber = accountNumber;

        }
        public AccountBuilder age(int age) {
            this.age = age;
            return this;
        }
        public AccountBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public AccountBuilder balance(String balance, String hasPrivelages) {

            this.balance = balance;
            this.hasPrivelages = balance;
            return this;
        }
        public BankAccount build() {
            return new BankAccount(this);
        }

    }
}


