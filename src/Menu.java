import java.util.Scanner;

public class Menu {
    public static void menu() {
        Calculation b = new Calculation();

        Scanner input = new Scanner(System.in);
        System.out.print("Добро пожаловать! Выберите нужный вам пункт:\n" +
                "1. Войти\n" +
                "2. Посчитать доходы\n" +
                "3. Посчитать расходы\n" +
                "4. Установить бюджет\n" +
                "5. Показать итог\n" +
                "6. Посчитать бюджет\n" +
                "7.Выйти ");
        String choose = input.nextLine();
        switch (choose) {
            case "1":
                User a = new User();
                a.authorization();
                break;
            case "2":
                b.calculateprofit();
                break;
            case "3":
                b.calculateexpenses();
            case "4":
                b.budget();
            case "5":
                b.show();
            case "6":
                b.budgetshow();
            case "7":
                System.out.println("До новых встреч!");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choose);
        }
    }
}
