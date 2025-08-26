import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Integer> result = new ArrayList<>();
        int invertNum = 0;

        Integer sum = Integer.valueOf("123") + Integer.valueOf("456");

        System.out.println(sum);

        while (sum != 0) {
            int dig = sum % 10;
            invertNum = dig * 10 + dig;
            result.add(dig);
            sum /= 10;
        }

        result.forEach(System.out::println);
    }
}