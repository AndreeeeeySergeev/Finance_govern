import java.util.*;

public class Calculation {
    Scanner input = new Scanner(System.in);
    HashMap <String, Float> profit = new HashMap<>();
    HashMap <String, Float> expenses = new HashMap<>();

    public void calculateprofit() {
        String category;
        Float cash;


        do {
            System.out.print("Введите категорию или exit для выхода:" );
            category = input.next();
            System.out.print("Введите сумму:" );
            cash = Float.valueOf(input.next());
            // float sum+=cash;
            profit.put(category, cash);
        } while (category != "exit");
    }

    public void calculateexpenses() {
        String category2;
        Float cash2;

        do {
            System.out.print("Введите категорию или exit для выхода:" );
            category2 = input.next();
            System.out.print("Введите сумму:" );
            cash2 = Float.valueOf(input.next());
            // float sum2h+=cash2;
            expenses.put(category2, cash2);
        } while (category2 != "exit");
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
