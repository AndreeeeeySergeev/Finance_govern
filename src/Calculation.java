import java.util.*;

public class Calculation {
    Scanner input = new Scanner(System.in);
    HashMap <String, Float> profit = new HashMap<>();
    HashMap <String, Float> expenses = new HashMap<>();
    HashMap <String, Float> budget = new HashMap<>();
    Menu quit = new Menu();

    public void calculateprofit() {
        String category;
        Float cash;


        do {
            System.out.print("Введите категорию или exit для выхода в меню:" );
            category = input.next();
            System.out.print("Введите сумму:" );
            cash = Float.valueOf(input.next());
            // float sum+=cash;
            profit.put(category, cash);
        } while (category != "exit");
        quit.menu();
    }

    public void calculateexpenses() {
        String category2;
        Float cash2;

        do {
            System.out.print("Введите категорию или exit для выхода в меню:" );
            category2 = input.next();
            System.out.print("Введите сумму:" );
            cash2 = Float.valueOf(input.next());
            // float sum2h+=cash2;
            expenses.put(category2, cash2);
        } while (category2 != "exit");
        quit.menu();

    }

    public void budget() {
        String category3;
        Float cash3;
        do {
            System.out.print("Введите категорию или exit для выхода в меню:" );
            category3 = input.next();
            System.out.print("Введите сумму:" );
            cash3 = Float.valueOf(input.next());
            // float sum2h+=cash2;
            budget.put(category3, cash3);
            budget.
        } while (category3 != "exit");
        quit.menu();
    }

    public void show() {
        Float sum = 0.0f;
        Float sum2h = 0.0f;
        for (float f: profit.values()) { // суммируем все категории в единый доход
            sum+=f;
        };
        System.out.println("Общий доход:" + sum);
        for (float i: expenses.values()) { // суммируем все категории в единые расходы
            sum2h+=i;
        };
        System.out.println("Общие расходы:" + sum2h);

    }
}
