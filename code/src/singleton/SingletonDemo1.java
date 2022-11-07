package singleton;

/**
 * @Author: Janiak
 * @Date: 2022/11/07/15:33
 * @Description:
 */
public class SingletonDemo1 {
    private int code;
    private String message;
    private static SingletonDemo1 uniqueInstance = null;

    private SingletonDemo1() {
        this.message = "你好";
        this.code = 1;
    }

    public static SingletonDemo1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonDemo1();
        }
        return uniqueInstance;
    }

}
