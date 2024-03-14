package JDK.ex3;

public class Pair <T, S> {
    //Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
    // Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из
    // составляющих пары, а также переопределение метода toString(), возвращающее строковое
    // представление пары. Работу сдать в виде ссылки на гит репозиторий.

    T first;
    S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }


}
