import java.util.Scanner;

class Account {
    public String cus_name;
    public String acc_type;
    public String acc_no;
    public double bal;

    public Account(String cus_name, String acc_type, String acc_no, double bal) {
        this.cus_name = cus_name;
        this.acc_type = acc_type;
        this.acc_no = acc_no;
        this.bal = bal;
    }

    public void deposit(double amnt) {
        bal += amnt;
        System.out.println("Amount deposited: " + amnt + " Balance: " + bal);
    }

    public void display() {
        System.out.println("Current balance: " + bal);
    }
}

class Savings extends Account {
    public double rate;

    public Savings(String cus_name, String acc_type, String acc_no, double bal, double rate) {
        super(cus_name, acc_type, acc_no, bal);
        this.rate = rate;
    }

    public void interest() {
        double i = bal * (rate / 100);
        bal += i;
        System.out.println("Interest amount: " + i + " Current Balance: " + bal);
    }

    public void withdraw(double amnt) {
        bal -= amnt;
        System.out.println("Withdrawn amount: " + amnt + " Balance: " + bal);
    }
}

class Current extends Account {
    public double minbal;
    public double surcharge;

    public Current(String cus_name, String acc_no, double bal, double minbal, double surcharge) {
        super(cus_name, "Current", acc_no, bal);
        this.minbal = minbal;
        this.surcharge = surcharge;
    }

    public void minBalance() {
        if (bal < minbal) {
            bal -= surcharge;
            System.out.println("Charge applied due to low balance. Current balance: " + bal);
        }
    }

    public void checkBook(double amnt) {
        bal -= amnt;
        System.out.println("Check confirmed");
        System.out.println("Withdrawn amount: " + amnt + " Balance: " + bal);
        System.out.println("Name: " + cus_name + " Account Number: " + acc_no);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);

        System.out.println("Enter name, account no & type of account (Savings/Current):");
        String name = o.nextLine();
        String accno = o.nextLine();
        String acctype = o.nextLine();
        double b = o.nextDouble();

        if (acctype.equals("Savings")) {
            Savings s = new Savings(name, acctype, accno, b, 10);

            while (true) {
                System.out.println("1. Deposit 2. Display balance 3. Interest 4. Exit");
                System.out.println("Enter your choice: ");
                int ch = o.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter amount to deposit:");
                        double a = o.nextDouble();
                        s.deposit(a);
                        break;
                    case 2:
                        s.display();
                        break;
                    case 3:
                        s.interest();
                        break;
                    case 4:
                        System.out.println("Thank you!");
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        } else {
            Current c = new Current(name, accno, b, 1000, 50);
            c.minBalance();

            System.out.println("Do you want to withdraw with check (1)?");
            int ch = o.nextInt();

            if (ch == 1) {
                System.out.println("Enter amount:");
                double w = o.nextDouble();
                c.checkBook(w);
            }

            System.out.println("Thank you");
        }
    }
}