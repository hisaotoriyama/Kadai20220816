abstract public class Company {
    private String name;
    private String listOrNonList;
    private int availableCreditLine;
  
    Company(String name, String listOrNonList, int availableCreditLine) {
      this.name = name;
      this.listOrNonList = listOrNonList;
      this.availableCreditLine = availableCreditLine;
    }
  
    public int getAvailableCreditLine() {
      return this.availableCreditLine;
    }

    public void setAvailableCreditLine(int newLine){
      this.availableCreditLine = newLine;
    }
 
    public void printData() {
      System.out.println("会社名：" + this.name);
      System.out.println("上場/非上場：" + this.listOrNonList);
      System.out.println("与信金額：" + this.availableCreditLine + "百万円");
    }
  }