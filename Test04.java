import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        List<Integer> sublist = list.subList(3,7);
        for (int i = 0; i < sublist.size(); i++) {
             sublist.set(i, sublist.get(i) * 10);
        }

        //sublist方法是在原先地址上修改值
        System.out.println(sublist);
        System.out.println(list);
        list.subList(7,9).clear();
        System.out.println(list);
    }
}
