package JDK.ex1;

public class Calculate {
//    Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(),
//    multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа, над которыми должна
//    быть произведена операция. Методы должны возвращать результат своей работы.

    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number> double divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number> double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(multiply(1, 2));
        System.out.println(divide(1, 2));
        System.out.println(subtract(1, 2));
    }
}
