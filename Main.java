import java.util.Scanner;
import java.util.ArrayList; 

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person1 = new Person("山田", "孝一", 27);
        Person person2 = new Person("佐藤", "光太郎", 65);
        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        System.out.println(list);
        
        ListedCompany listedCompany1 = new ListedCompany("A商事", "上場");
        ListedCompany listedCompany2 = new ListedCompany("B産業", "上場");
        
        NonListedCompany nonListedCompany1 = new NonListedCompany("C有限会社", "非上場");
        NonListedCompany nonListedCompany2 = new NonListedCompany("Dコーポレーション", "非上場");
        
        Metal gold = new Metal("Gold", 100);
        Metal platinium = new Metal("pratinium", 120);

        person1.buy(listedCompany1);
        person2.buy(nonListedCompany1);

        System.out.print("相手先は上場ですか、非上場ですか：");
        String listedOrNonlisted = scanner.next();
        switch (listedOrNonlisted) {
            case "上場":
              System.out.println("上場の会社を出します");
              break;
            case "非上場":
              System.out.println(("非上場の会社を出します"));
              break;
            default:
              System.out.println("再度最初から始めてください");
        }
        System.out.print("続いて会社名を入力してください：");
        String name = scanner.next();
        
        
        scanner.close();

    //   
    //   for でインスタンスを回しnamが一致するinsutansを選択する。getName(”B産業");
    //   forで回す　商品はどれですか
    //   数量はどの程度ですか
    //   数量をかける。
    //   ＞与信が余ればまる、余らなければ成約見送る、ないし与信承認を得る。
  
      System.out.println("【上場会社の情報】");
      listedCompany1.printData();
      System.out.println("-----------------");
      System.out.println("【上場会社向け契約者情報】");
      listedCompany1.getOwner().printData();
  
      System.out.println("=================");
      System.out.println("【非上場会社の情報】");
      nonListedCompany1.printData();
      System.out.println("-----------------");
      System.out.println("【非上場会社向け契約者情報】");
      nonListedCompany1.getOwner().printData();
    }
  }
  