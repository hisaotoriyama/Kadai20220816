import java.util.List;

public class OperationController {
    List<Company> companiesList;

    public static void companyListCreator(List<Company> companiesList){
        System.out.println("【全会社の情報】");
        for (int i=0; i<companiesList.size(); i++){
          System.out.println("Index:"+i);
          companiesList.get(i).printData();
          System.out.println("-----------------");
        }
    }

    public static void metalListCreator(List<Metal> metalList){
        System.out.println("【全商品の情報】");
        for (int i=0; i<metalList.size(); i++){
            System.out.println("Index:"+i);
            metalList.get(i).printData();
            System.out.println("-----------------");
        }
    }

    public static void metalListCreatorForEachGroup(String selectedMetalListedOrNonListed, List<Metal> listedMetalList, List<Metal> nonListedMetalList){
        switch(selectedMetalListedOrNonListed){
            case "LM":
                metalListCreator(listedMetalList);
            break;
            case "NLM":
                metalListCreator(nonListedMetalList);
            break;
        }
    }

    public static void creditAvailableChecker(List<Company> listedCompanies, int selectedName, List<Metal> list, int selectedMetal, int selectedMetalQuantity){
        int selectedMetalUnitPrice = list.get(selectedMetal).getUnitPrice();
        int valueRequired = amountToBePaid(selectedMetalUnitPrice, selectedMetalQuantity);
        if(valueRequired >listedCompanies.get(selectedName).getAvailableCreditLine()){
          System.out.println("与信枠を超過します。追加与信額の見直しないし別途与信増額申請してください。");
        } else {
          System.out.println("追加成約しても与信枠超過の問題はありません。成約してください"); 
          int currentAvailableCreditLine = listedCompanies.get(selectedName).getAvailableCreditLine() - valueRequired;
          System.out.println("元々の信用限度額："+ listedCompanies.get(selectedName).getAvailableCreditLine());
          System.out.println("成約後の信用限度額："+ currentAvailableCreditLine);
          listedCompanies.get(selectedName).setAvailableCreditLine(currentAvailableCreditLine);
        }
    }

    public static void creditCheckerForEachMetal(List<Company> listedCompaniesList, int selectedNameListed, String selectedMetalGroup, List<Metal> listedMetalList, List<Metal> nonListedMetalList, int selectedMetal, int selectedMetalQuantity){
            switch(selectedMetalGroup){
                case "LM":
                  creditAvailableChecker(listedCompaniesList, selectedNameListed, listedMetalList, selectedMetal, selectedMetalQuantity);
                  break;
                case "NLM":
                  creditAvailableChecker(listedCompaniesList, selectedNameListed, nonListedMetalList, selectedMetal, selectedMetalQuantity);
                  break;
                }
            }
        
    public static int amountToBePaid(int unitPrice, int quantity){
       return unitPrice * quantity;
        }

    public static void result(List<Company> companiesList, List<Metal> listedMetalList,List<Metal> nonListedMetalList) {
        companyListCreator(companiesList);

        int selectedName =  SelectorControllor.companyIndexSelector();
        String selectedMetalGroup = SelectorControllor.metalGroupSelector();
        metalListCreatorForEachGroup(selectedMetalGroup, listedMetalList, nonListedMetalList);
  
        int selectedMetal =  SelectorControllor.metalIndexSelector();
        int selectedMetalQuantity = SelectorControllor.quantityInputter();
        creditCheckerForEachMetal(companiesList, selectedName, selectedMetalGroup, listedMetalList, nonListedMetalList, selectedMetal, selectedMetalQuantity);
    }

    public static void getResult(List<Company> listedCompaniesList, List<Company> nonListedCompaniesList, List<Metal>listedMetalList, List<Metal> nonListedMetalList) {
        String listedOrNonlisted = SelectorControllor.companySelector();
        switch (listedOrNonlisted) {
            case "L":
                OperationController.result(listedCompaniesList, listedMetalList, nonListedMetalList);
            break;

            case "NL":
                OperationController.result(nonListedCompaniesList, listedMetalList, nonListedMetalList);
            break;
            default:
                System.out.println("再度最初から開始してください");        

        }
    }
}