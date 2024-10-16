public class Account {
    private String id;
    private String name;
    private int balace = 0;
    public Account (String id, String name, int balace) {
        this.id= id;
        this.name= name;
        this.balace= balace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalace() {
        return balace;
    }

    public void setBalace(int balace) {
        this.balace = balace;
    }
    public int credit(int amount) {
        balace += amount;
        return balace;
    }
    public int debit(int amout) {
        if (amout <= balace) {
            balace -= amout;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balace;
    }
    public int transfer(Account another, int amount) {
        if (amount <= balace) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balence");
        }
        return balace;
    }

    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" +
                name + ", balence=" + balace +
                "]";
    }
}
