import java.util.HashMap;
import java.util.Scanner;

public class User {
    HashMap<String, String> map = new HashMap<>(); // to do желательно вынести в отдельный файл или класс для хранения
    Scanner input = new Scanner(System.in);

    public void authorization() {
        System.out.print("Введите ваш логин:"); // главное, чтобы без ошибки ввели=)
        String key = input.next();
        if (!map.containsKey(key)) {
            System.out.println("Пользователь с таким логином отсутствует");
            createUser();
        }

        System.out.print("Введите пароль:");
        String value = input.next();
        if (!map.containsValue(value)) {
            System.out.println("Неверный пароль");//to do обернуть в через "или" в один if
            authorization();
        }
    }

        public void createUser() {
            System.out.print("Логин:" ); // to do сделать форму ввода только на англ + доп.символы
            String login = input.next();
            System.out.print("Пароль:" ); // to do сделать форму ввода только на англ + доп.символы
            String password = input.next();// повтор пароля и проверка на совпадение
            map.put(login, password);
        }
}
