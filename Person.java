class Person {
    private String employeeName;
    private String lastName;
    private int employeeId;
  
    Person(String employeeName, String lastName, int employeeId) {
      this.employeeName = employeeName;
      this.lastName = lastName;
      this.employeeId = employeeId;
    }
  
    // Person(String employeeName, String middleName, String lastName, int employeeId) {
    //   this(employeeName, lastName, employeeId);
    //   this.middleName = middleName;
    // }
    
    public String fullName() {
        return this.employeeName + " " + this.lastName;
      }

    public void printData() {
      System.out.println("成約担当者：" + this.fullName());
      System.out.println("会社ID：" + this.employeeId);
    }
  
    // 以下2つを一つのメソッドで書き換えてください
    public void buy(Company company) {
      company.setOwner(this);
    }
    
  }
  