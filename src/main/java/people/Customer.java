package people;

public class Customer {
    private String name;
    private int wallet;
    private boolean hasLoyaltyCard;

    public Customer(String name, int wallet, boolean hasLoyaltyCard) {
        this.name = name;
        this.wallet = wallet;
        this.hasLoyaltyCard = hasLoyaltyCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public boolean isHasLoyaltyCard() {
        return hasLoyaltyCard;
    }

    public void setHasLoyaltyCard(boolean hasLoyaltyCard) {
        this.hasLoyaltyCard = hasLoyaltyCard;
    }
}
