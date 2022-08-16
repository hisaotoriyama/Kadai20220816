public class Metal {

    private String metal;
    private int unitPrice;

    Metal(String metal, int unitPrice){
        this.metal = metal;
        this.unitPrice = unitPrice;
    }

    public int amountToBePaid(int quantity) {
        return this.unitPrice * quantity;
    }

}
