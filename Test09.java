import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        List<Emp> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scan = new Scanner(System.in);
        String info = scan.nextLine();
        String[] em_arr = info.split(";");
        for (String data : em_arr) {
            String[] emp_info = data.split(",");
            String name = emp_info[0];
            int age = Integer.parseInt(emp_info[1]);
            String gender = emp_info[2];
            int salary = Integer.parseInt(emp_info[3]);
            Date hire_date = sdf.parse(emp_info[4]);
            Emp e = new Emp(name , age , gender , salary , hire_date);
            list.add(e);
        }
        for (Emp e :list) {
            System.out.println(e);
        }
        for (Emp e :list) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(e.getHiredate());
            cal.add(Calendar.MONTH,3);
            cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
            System.out.println(e.getName()+"的转正日期为:"+sdf.format(cal.getTime()));
        }
    }
}
