public class Main {

    public static void main(String[] args) {
        NearbyElements elem = new NearbyElements();
        ResultFormatter result1 = elem.nearby(0,2,2);
        ResultFormatter result2 = elem.nearby(1, 0, 1);
        ResultFormatter result3 = elem.nearby(1, 3, 5);
        ResultFormatter result4 = elem.nearby(1, 3, -1);
        ResultFormatter result5 = elem.nearby(1, 3, 0);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}