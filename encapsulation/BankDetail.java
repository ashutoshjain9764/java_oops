package encapsulation;

public class BankDetail 
{
    private String name;
    private String bankname;
    private String email;
    private String ifsc;
    private Long accno;
    private int pin;
    private double balance;

    BankDetail()
    {

    }

    BankDetail(String bankname,String name,String email,String ifsc,long accno,int pin,double balance)
    {
        this.bankname=bankname;
        this.name=name;
        this.email=email;
        this.ifsc=ifsc;
        this.accno=accno;
        this.pin=pin;
        this.balance=balance;
    }
    public String getBankName()
    {
        return bankname;
    }

    public String getName()
    {
        return name;
    }

    public String getIfsc()
    {
        return ifsc;
    }

 public String getEmail()
    {
        return email;
    }

    public long getAccno()
    {
        return accno;
    }

    public int getPin()
    {
        return pin;
    }

    public double getBalance(long accno , int pin)
    {
        if(this.accno==accno  && pin==this.pin)
            {
                return balance;
            }
            else
            {
                System.out.println("Invalid details");
                return 0;
            }
    }

    public void setEmail(String oldemail,String newemail)
    {
        if(email==oldemail)
        {
            email=newemail;
            System.out.println("Email is updated");
        }
        else
        {
            System.out.println("Email is not match");
        }
    }
   
    public void balanceDeposit(long accno,int pin,double amount)
    {
        if(this.accno==accno && this.pin==pin)
        {
            balance=balance+amount;
            System.out.println("amount is credeted");
        }
        else
        {
            System.out.println("Invalid details !!!!!");
        }
    }

    public void balanceWidraw(long accno,int pin,double amount)
    {
        if(this.accno==accno && this.pin==pin)
        {
            if(amount>=1 && balance-amount>2000)
            {
                balance=balance+amount;
                System.out.println("amount is credeted");
            }
            else
            {
                System.out.println("Enter the amount greater than 1 ");
            }
        }
        else
        {
            System.out.println("Invalid details !!!!!");
        }
    }
   
    public void display()
    {
       
        System.out.println(bankname);
        System.out.println(name);
        System.out.println(email);
        System.out.println(ifsc);
        System.out.println(accno);
        System.out.println(pin);
        System.out.println(balance);
      
        
        }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public void setAccno(long accno) {
        this.accno = accno;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }      
}



