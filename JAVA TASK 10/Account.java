public class Account {
        private double balance;
    
        // Constructor with no arguments
        public Account() {
            this.balance = 0.0;
        }
    
        // Constructor with one argument
        public Account(double initialBalance) {
            this.balance = initialBalance;
        }
    
        // Method to set balance
        public void setBalance(double balance) {
            this.balance = balance;
        }
    
        // Method to get balance
        public double getBalance() {
            return balance;
        }
    
        // Method to deposit balance
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Successfully deposited $" + amount);
            } else {
                System.out.println("Invalid amount for deposit.");
            }
        }
    
        // Method to withdraw balance
        public void withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println("Successfully withdrawn $" + amount);
            } else {
                System.out.println("Insufficient balance or invalid amount for withdrawal.");
            }
        }
        public static void main(String[] args) {
            // Example usage
            Account account1 = new Account(); // Using no-argument constructor
            account1.deposit(1000);
            account1.withdraw(500);
    
            Account account2 = new Account(2000); // Using constructor with one argument
            account2.deposit(50000);
            account2.withdraw(25000);
        }
    }
    
    

