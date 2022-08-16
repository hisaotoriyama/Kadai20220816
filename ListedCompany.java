class ListedCompany extends Company {
    private int StockPresentValue = 50;
  
    ListedCompany(String name, String listOrNonList) {
      super(name, listOrNonList);
    }
  
    public int getStockPresentValue() {
      return this.StockPresentValue;
    }
  
    public void printData() {
      super.printData();
      System.out.println("時価総額：" + this.StockPresentValue + "円");
    }
  
    public void run(int additionalLine) {
      System.out.println(additionalLine + "円の与信使います");
      if (additionalLine <= this.StockPresentValue) {
        this.availableCreditLine += additionalLine;
        this.StockPresentValue -= additionalLine;
      } else {
        System.out.println("与信枠が不足してます");
      }
      System.out.println("与信金額：" + this.availableCreditLine + "円");
      System.out.println("時価総額：" + this.StockPresentValue + "円");
    }
  
    // public void charge(int litre) {
    //   System.out.println(litre + "L給油します");
    //   if (litre <= 0) {
    //     System.out.println("給油できません");
    //   } else if (litre + this.StockPresentValue >= 100) {
    //     System.out.println("満タンまで給油します");
    //     this.StockPresentValue = 100;
    //   } else {
    //     this.StockPresentValue += litre;
    //   }
    //   System.out.println("ガソリン量：" + this.StockPresentValue + "L");
    // }
  }
  