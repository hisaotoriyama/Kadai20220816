abstract class Company {
    private String name;
    private String listOrNonList;
    protected int availableCreditLine = 0;
    private Person owner;
  
    Company(String name, String listOrNonList) {
      this.name = name;
      this.listOrNonList = listOrNonList;
    }
  
    public String getName() {
      return this.name;
    }
    public String getListOrNonList() {
      return this.listOrNonList;
    }
    public int getDistance() {
      return this.availableCreditLine;
    }
    public Person getOwner() {
      return this.owner;
    }
    public void setName(String name) {
      this.name = name;
    }
    public void setListOrNonList(String listOrNonList) {
      this.listOrNonList = listOrNonList;
    }
    public void setOwner(Person person) {
      this.owner = person;
    }
  
    public void printData() {
      System.out.println("会社名：" + this.name);
      System.out.println("上場/非上場：" + this.listOrNonList);
      System.out.println("与信金額：" + this.availableCreditLine + "円");
    }
  
    public abstract void run(int availableCreditLine);
  }