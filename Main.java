import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Company listedCompany1 = new ListedCompany("A商事", "上場", 500, 500);
        Company listedCompany2 = new ListedCompany("B産業", "上場",500, 300);
        Company listedCompany3 = new ListedCompany("Cパートナーズ", "上場",300, 250);
        List<Company> listedCompaniesList = new ArrayList<>();
        listedCompaniesList.add(listedCompany1);
        listedCompaniesList.add(listedCompany2);
        listedCompaniesList.add(listedCompany3);
        
        Company nonListedCompany1 = new NonListedCompany("CCorp", "非上場",300);
        Company nonListedCompany2 = new NonListedCompany("Corp", "非上場",200);
        List<Company> nonListedCompaniesList = new ArrayList<>();
        nonListedCompaniesList.add(nonListedCompany1);
        nonListedCompaniesList.add(nonListedCompany2);

        Metal listedMetal1 = new ListedMetal("Gold", 30, 35);
        Metal listedMetal2 = new ListedMetal("Silver", 10,15);
        Metal listedMetal3 = new ListedMetal("Platinium", 40,35);
        List<Metal> listedMetalList = new ArrayList<>();
        listedMetalList.add(listedMetal1);
        listedMetalList.add(listedMetal2);
        listedMetalList.add(listedMetal3);

        Metal nonListedMetal1 = new NonListedMetal("Irridium", 50);
        Metal nonListedMetal2 = new NonListedMetal("Paradium", 100);
        List<Metal> nonListedMetalList = new ArrayList<>();
        nonListedMetalList.add(nonListedMetal1);
        nonListedMetalList.add(nonListedMetal2);

        Person person1 = new Person("山田", 27);
        Person person2 = new Person("佐藤", 65);
        Person person3 = new Person("吉田", 91);
        List<Person> listedPersons = new ArrayList<>();
        listedPersons.add(person1);
        listedPersons.add(person2);
        listedPersons.add(person3);

        System.out.println("社員番号を入れてください。合わない場合は最初からやり直してください：");
        int employeeId = scanner.nextInt();
        for (int i=0; i<listedPersons.size(); i++){
            if (listedPersons.get(i).getEmployeeID() == employeeId){
                listedPersons.get(i).printData();
                while (true){
                    System.out.print("続行しますか（1)、あるいは停止しますか（2)：");
                    int continueOrStop = scanner.nextInt();
                    if (continueOrStop ==2) {
                        break;
                    }
                    OperationController.contollerere(listedCompaniesList, nonListedCompaniesList, listedMetalList, nonListedMetalList);
                }  
            }
        }
        scanner.close();
    }
}