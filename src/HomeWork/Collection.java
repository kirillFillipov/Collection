package HomeWork;
import java.util.*;

public class Collection {
    public static void main(String[] args) {
        List<Integer> arr =new ArrayList<>();

        initList(arr);

        System.out.println("Кол-Во отрицательных чисел " + negative(arr));
    }

    public static void initList(List<Integer> arr) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите число(Чтоб выйти введите 100)");
            arr.add(scanner.nextInt());

        }while (arr.get(arr.size()-1 ) != 100 );




    }

    public static int negative(List<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                count++;
            }
        }
        return count;
    }


}
