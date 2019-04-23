public class Main {

    public static void main(String[] args) {
        NearbyElements elem = new NearbyElements();
        Result result1 = elem.nearby(0,2,2);
        Result result2 = elem.nearby(1, 0, 1);
        Result result3 = elem.nearby(1, 3, 5);

        result1.toString();
        result2.toString();
        result3.toString();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}