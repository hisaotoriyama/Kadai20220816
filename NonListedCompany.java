class NonListedCompany extends Company {
    NonListedCompany(String name, String listOrNonList) {
      super(name, listOrNonList);
    }
  
    public void run(int additionalLine) {
      System.out.println(additionalLine + "円の与信使います");
      this.availableCreditLine += additionalLine;
      System.out.println("追加与信：" + this.availableCreditLine + "円");
    }
  }