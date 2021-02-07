


package bankaccountui_tester;


public class BankAccount {
    
    //Instance variable
    private double balance;
    private String name;
    
    //Constructor method
    //Constructor Method (initializes variable)
    public BankAccount (double b, String n)
    {
        balance = b; 
        name = n;
    }
    
    //Method for deposit value
    public void deposit(double d)
    {
        balance = balance + d;    
    }

    //Method for withdraw value
    public void withdraw(double w)
    {
         balance = balance - w;    
    }
    
    //Method to return balance value to GUI class.
    public double getBalance()
    {
        return balance;    
    }
    
    
    
}
