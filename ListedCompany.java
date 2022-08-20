class ListedCompany extends Company {
    private int StockPresentValue;
    
    ListedCompany(String name, String listOrNonList, int availableCreditLine, int StockPresentValue) {
        super(name, listOrNonList, availableCreditLine);
        this.StockPresentValue = StockPresentValue;
    }

    public void printData() {
        super.printData();
        System.out.println("時価総額：" + this.StockPresentValue + "百万円");
    }
}
  