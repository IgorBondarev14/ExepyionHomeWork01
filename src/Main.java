import java.util.Scanner;

public class Main {
    public static void main(String... args) throws Exception {
//        first();
//        System.out.println(second());
        third();
    }

    public static void first() throws Exception{
        String a = scan();
        if (a != ""){
            System.out.println(a);
        }
        else {
            throw new RuntimeException("Вы ничего не ввели. Код ошибки 404");
        }
    }

    public static boolean second() throws Exception{
        String b = scan();
        try {
            int number = Integer.parseInt(b);
            return true;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Вы ввели не число. Код ошибки 303");
//            System.out.println("Вы ввели не число. Код ошибки 303");
        }
    }

    public static void third() {
        String a = "Оригинал";
        String b = scan();
        if (a.length() > b.length()) {
            throw new RuntimeException("Оригинал длиннее. Код ошибки 202.");
        } else if (a.length() < b.length()){
            throw new RuntimeException("Введенная строка длиннее. Код ошибки 203.");
        } else {
            throw new RuntimeException("Строка равна Оригиналу. Код ошибки 201.");
        }
    }
    public static String scan() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение: ");
        String str = in.nextLine();
        in.close();
        return str;
    }
}