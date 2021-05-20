import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<Date> list = new ArrayList<>();
        for (int i = 1; i <=3; i++) {
            System.out.println("输入第"+ i +"日期(yyyy-MM-dd):");
            String line = scan.nextLine();
            Date date = sdf.parse(line);
            list.add(date);
        }
        Collections.sort(list);
        System.out.println(list);

    }
}
