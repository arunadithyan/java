package arun;

import java.util.UUID;



    // Base class: BankAccount
    class BankAccount {
        protected String accountNumber;
        protected double balance;

        public BankAccount() {
            this.accountNumber = UUID.randomUUID().toString();
            this.balance = 0;
        }

        public BankAccount(double initialBalance) {
            this.accountNumber = UUID.randomUUID().toString();
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds!");
            }
        }

        public double getBalance() {
            return balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }
    }

    // Derived class: SavingAccount (inherits from BankAccount)
    class SavingAccount extends BankAccount {
        private double interestRate;

        public SavingAccount(double initialBalance, double interestRate) {
            super(initialBalance);
            this.interestRate = interestRate;
        }

        public double calculateInterest() {
            return balance * (interestRate / 100);
        }
    }

    // Derived class: LoanAccount (inherits from BankAccount)
    class LoanAccount extends BankAccount {
        private double loanAmount;
        private double interestRate;

        public LoanAccount(double loanAmount, double interestRate) {
            this.loanAmount = loanAmount;
            this.interestRate = interestRate;
        }

        public void applyInterest() {
            double interest = loanAmount * (interestRate / 100);
            balance += interest;
        }
    }

    // Example usage:
    public class banksystem{
        public static void main(String[] args) {
            SavingAccount savingAccount = new SavingAccount (1000, 2.5);
            savingAccount.deposit(500);
            System.out.println("Saving Account Balance: " + savingAccount.getBalance());
            System.out.println("Interest Earned: " + savingAccount.calculateInterest());

            LoanAccount loanAccount = new LoanAccount (2000, 5);
            loanAccount.deposit(100);
            System.out.println("Loan Account Balance: " + loanAccount.getBalance());
            loanAccount.applyInterest();
            System.out.println("Loan Account Balance after Interest: " + loanAccount.getBalance());
        }
    }

