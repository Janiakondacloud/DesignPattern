package singleton;

/**
 * @Author: Janiak
 * @Date: 2022/11/07/15:38
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Demo1.getInstance());
        System.out.println(Demo1.getInstance());
        System.out.println(Demo1.getInstance());
        System.out.println(Demo1.getInstance());
    }
}
