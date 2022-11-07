package singleton;

/**
 * @Author: Janiak
 * @Date: 2022/11/07/15:38
 * @Description:
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        System.out.println(SingletonDemo1.getInstance());
        System.out.println(SingletonDemo1.getInstance());
        System.out.println(SingletonDemo1.getInstance());
        System.out.println(SingletonDemo1.getInstance());
    }
}
