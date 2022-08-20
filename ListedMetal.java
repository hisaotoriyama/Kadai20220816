public class ListedMetal extends Metal{
    private int listedPrice;

    ListedMetal(String metalName, int unitPrice, int listedPrice){
        super(metalName, unitPrice);
        this.listedPrice = listedPrice;
    }

    public void printData() {
        super.printData();
        System.out.println("本日の上場単価：" + this.listedPrice);
}
}