import java.util.Scanner;

public class SelectorControllor {


    public static String CompanySelector(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("相手先は上場でしょうか(L)、あるいは非上場でしょうか(NL)：");
        String listedOrNonlisted = scanner.next();
        scanner.close();
        return listedOrNonlisted;
    }

    // public static int CompanyIndexSelector(){
    //     // Scanner scanner = new Scanner(System.in);
    //     // System.out.println("会社を選択してください（Index）：");
    //     // System.out.println("1iikamooooo");
    //     // System.out.println("2iikamooooo");
    //     // int selectedNameListed = scanner.nextInt();
    //     int selectedNameListed = 2;
        
    //     System.out.println("3iikamooooo");
    //     // scanner.close();
    //     return selectedNameListed;
    // }

    public static String MetalGroupSelector(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("販売商品は上場商品ですか(LM)、非上場商品ですか(NLM)：");
        String selectedMetalGroup = scanner.next();
        scanner.close();
        return selectedMetalGroup;
    }

    public static int MetalIndexSelector(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("販売商品を選択してください（Index)");
        int selectedMetal = scanner.nextInt();
        scanner.close();
        return selectedMetal;
    }
    public static int QuantityInputter(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("販売数量を入力してください：");
        int selectedMetalQuantity = scanner.nextInt();
        scanner.close();
        return selectedMetalQuantity;


    }

}