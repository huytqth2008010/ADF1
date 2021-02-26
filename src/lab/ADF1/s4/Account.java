package lab.ADF1.s4;

public class Account {
    private int id;
    private String name;
    private int balance;


    public Account(){
    }
    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getBalance() { return balance; }

    public void setBalance(int balance) { this.balance = balance; }
    public void credit(int amount) {
        this.balance += amount;
    }
    public void debit(int amount) {
        if (amount > this.balance) {
            System.out.println("Thanh Toan khong thanh cong");
        } else {
            this.balance -= amount;
        }
    }
    public void tranferTo(Account account, int amount) {
        if (amount > this.balance) {
            System.out.println("Chuyen tien khong thanh cong");
        } else {
            // Tru tien tai khoan chuyen
            this.balance -= amount;
            account.credit(amount);
        }
    }



}
