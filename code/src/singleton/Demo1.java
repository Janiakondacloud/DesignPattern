package singleton;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: Janiak
 * @Date: 2022/11/07/15:33
 * @Description:
 */
public class Demo1 {
    private int code;
    private String message;
    private static Demo1 uniqueInstance = null;

    private Demo1() {
        this.message = "你好";
        this.code = 1;
    }

    public static Demo1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Demo1();
        }
        return uniqueInstance;
    }

}
