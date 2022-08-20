import java.util.Scanner;

public class SelectorControllor {


    public static String companySelector(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("相手先は上場でしょうか(L)、あるいは非上場でしょうか(NL)：");
        String listedOrNonlisted = scanner.next();
        scanner.close();
        return listedOrNonlisted;
    }

    public static int companyIndexSelector(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("会社を選択してください（Index）：");
        System.out.println("1iikamooooo");
        System.out.println("2iikamooooo");
        int selectedNameListed = scanner.nextInt();
        System.out.println("3iikamooooo");
        scanner.close();
        return selectedNameListed;
    }

    public static String metalGroupSelector(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("販売商品は上場商品ですか(LM)、非上場商品ですか(NLM)：");
        String selectedMetalGroup = scanner.next();
        scanner.close();
        return selectedMetalGroup;
    }

    public static int metalIndexSelector(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("販売商品を選択してください（Index)");
        int selectedMetal = scanner.nextInt();
        scanner.close();
        return selectedMetal;
    }
    public static int quantityInputter(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("販売数量を入力してください：");
        int selectedMetalQuantity = scanner.nextInt();
        scanner.close();
        return selectedMetalQuantity;
    }

}