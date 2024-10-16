public class Main {
    public static void main(String[] args){
        Account account = new Account("A101 "," Tan Ah Teck,", 88);
        System.out.println(account);
        Account account1 = new Account("A102 ", " Kumar, ", 0);
        System.out.println(account1);
       
        System.out.println("ID: " + account.getId());
        System.out.println("Name: " + account.getName());
        System.out.println("Balance: " + account.getBalace());

        account.credit(100);
        System.out.println(account);
        account.debit(50);
        System.out.println(account);
        account.debit(500);
        System.out.println(account);

        account.transfer(account1, 100);
        System.out.println(account);
        System.out.println(account1);
    }
}