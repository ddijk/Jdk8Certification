package examjava6;

public class ByValue {

    public static void main(String[] args) {
        Integer wrapper = new Integer(5);
        Integer value = wiggler(wrapper);

        System.out.println(wrapper + value);
    }

    public static Integer wiggler(Integer x) {
        Integer y = x + 10;
        x++;
        System.out.println(x);
        return y;
    }
}
