public class PreferredCustomer extends Customer
{
    private int loyaltyPoints;
    private int discountLevel;

    public PreferredCustomer()
    {

    }

    public PreferredCustomer(String name, String address, String phone, String custNumber, boolean mailingList, int loyaltyPoints, int discountLevel)
    {
        super(name, address, phone, custNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    public void setDiscountLevel(int discountLevel)
    {
        this.discountLevel = discountLevel;
    }

    public void setLoyaltyPoints(int loyaltyPoints)
    {
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getDiscountLevel()
    {
        return discountLevel;
    }

    public int getLoyaltyPoints()
    {
        return loyaltyPoints;
    }

    @Override
    public String toString() {
        return super.toString() +
                "loyaltyPoints='" + loyaltyPoints + '\'' +
                ", discountLevel='" + discountLevel + '\'' +
                '}';
    }
}
