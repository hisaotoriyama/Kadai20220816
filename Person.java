class Person {
    private String employeeName;
    private int employeeId;
    
    Person(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }
    
    public int getEmployeeID(){
        return this.employeeId;
    }

    public void printData() {
        System.out.println("成約担当者氏名  ：" + this.employeeName);
        System.out.println("成約担当者社員ID：" + this.employeeId);
    }
  
 }
  