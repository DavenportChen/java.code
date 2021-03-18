package mapset;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-02-04
 * Time: 20:45
 */

public class TestDemo {
    /**
     * 找出10W个数据当中，第一个重复的数据
     * 思路：遍历list 拿到每个元素之后 存到set 注意，存储之前，需要看set中是否
     * 有这个数据？有 就说明找到了第一个重复的数据
     *
     * @return
     */
    public static int findFirstRepeatNumber() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(1_0000));
        }

        HashSet<Integer> set = new HashSet<>();
        //contatins
        for (int i = 0; i < 100000; i++) {
            if (!set.contains(list.get(i))) {
                set.add(list.get(i));
            } else {
                return list.get(i);
            }
        }
        return -1;
    }

    /**
     * 把10W个数据当中的重复的数据 去重
     * 思路：只需要把10W个数据放到集合当中
     *
     * @return
     */
    public static Set<Integer> deputil() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(1_0000));
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 100000; i++) {  //set.addAll(list);
            set.add(list.get(i));
        }
        return set;
    }


    public static void func(){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            Integer key = list.get(i);
            if(map.get(key) == null){
                map.put(key,1);
            }else{
                Integer  number = map.get(key);
                map.put(key,number+1);
            }
        }
        /*for(int i = 0; i < map.size(); i++){
            Integer key = list.get(i);
            if(map.get(key) > 1){
                System.out.println(key +"="+map.get(key));
            }

            */

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+ "=" + entry.getValue());
            }
        }

//            if(!map.containsKey(i)){
//                map.put(i,1);
//            }else{
//                map.put(i,1);
//            }
//        }
//        for(int i = 0; i < map.size(); i++){
//            if(map.){
//
//            }
        }


    public static void main(String[] args) {
        func();
    }


}
