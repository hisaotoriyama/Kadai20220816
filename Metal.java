abstract public class Metal {
    private String metalName;
    private int unitPrice;

    Metal(String metalName, int unitPrice){
        this.metalName = metalName;
        this.unitPrice = unitPrice;
    }

    public int getUnitPrice() {
        return this.unitPrice;
    }

    public void printData() {
        System.out.println("Metal名：" + this.metalName);
        System.out.println("単価：" + this.unitPrice);
    }
}
