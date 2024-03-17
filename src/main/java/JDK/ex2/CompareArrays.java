package JDK.ex2;

public class CompareArrays {
//    Напишите обобщенный метод compareArrays(), который принимает два массива и
//    возвращает true, если они одинаковые, и false в противном случае.
//    Массивы могут быть любого типа данных, но должны иметь одинаковую длину и
//    содержать элементы одного типа по парно по индексам.

    public static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
                if (!arr1[i].getClass().equals(arr2[i].getClass())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"a", "b", "c"};
        System.out.println(compareArrays(arr1, arr2));
        System.out.println(arr1.getClass());

        Integer[] arr3 = {1, 2, 3};
        Integer[] arr4 = {1, 2, 3};
        System.out.println(compareArrays(arr3, arr4));

        String[] arr5 = {"a", "b", "c"};
        Integer[] arr6 = {1, 2, 3};
        System.out.println(compareArrays(arr5, arr6));
    }

}
