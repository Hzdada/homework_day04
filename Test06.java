import java.util.Arrays;
import java.util.List;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        String[] str = new String[]{"one","two","three"};
        List<String> list = Arrays.asList(str);
        System.out.println(list);
    }
}
