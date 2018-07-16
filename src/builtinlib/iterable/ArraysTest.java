package builtinlib.iterable;

import org.omg.CORBA.INTERNAL;
import util.L;

import java.util.Arrays;
import java.util.List;

/**
 * author:https://github.com/honglei92
 * time:2018/7/16
 */
public class ArraysTest {
    static String[] mArray = {"3", "2", "1", "9"};

    public static void main(String[] args) {
//        sort();
        fill();
    }

    /**
     * 填充
     */
    private static void fill() {
        Arrays.fill(mArray, 1, 3, "A");
        L.p(Arrays.toString(mArray));
    }


    /**
     * 排序
     */
    private static void sort() {
        Integer[] mArrayInt = {3, 2, 1, 9};
        List<String> list = Arrays.asList(mArray);
        for (int i = 0; i < list.size(); i++) {
            L.p(list.get(i));
        }
        //排序
//        Arrays.sort(mArray);
        //限定起止下标
        Arrays.sort(mArray, 0, 3);
        Arrays.sort(mArrayInt);
        List<String> listSorted = Arrays.asList(mArray);
        for (int i = 0; i < listSorted.size(); i++) {
            L.p(listSorted.get(i));
        }
        List<Integer> listSortedInt = Arrays.asList(mArrayInt);
        for (int i = 0; i < listSortedInt.size(); i++) {
            L.p(listSortedInt.get(i) + "int");
        }
    }
}
