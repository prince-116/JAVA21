package Collections;

import java.util.*;

public class Sequenced {
    public static void sequencedCollection(){

        List<Integer> integerList = new ArrayList<>();

        for (int i = 1; i<=10; i++ ){
            integerList.add(i); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        }


        System.out.println(STR."First: \{integerList.get(0)}"); // 1
        System.out.println(STR."First: \{integerList.getFirst()}"); // 1

        System.out.println(STR."Last: \{integerList.get(integerList.size() - 1)}"); // 10
        System.out.println(STR."Last: \{integerList.getLast()}"); //10

        integerList.remove(0);
        System.out.println(integerList); // [2, 3, 4, 5, 6, 7, 8, 9, 10]

        integerList.removeFirst();
        System.out.println(integerList); // [3, 4, 5, 6, 7, 8, 9, 10]

        integerList.remove(integerList.size() -1);
        System.out.println(integerList); // [3, 4, 5, 6, 7, 8, 9]

        integerList.removeLast();
        System.out.println(integerList); // [3, 4, 5, 6, 7, 8]

        List<Integer> reversedList = new ArrayList<>();
        for (int i = integerList.size() - 1; i >= 0; i--) {
            reversedList.add(integerList.get(i));
        }

        System.out.println(reversedList); // [8, 7, 6, 5, 4, 3]
        System.out.println(integerList.reversed()); // [8, 7, 6, 5, 4, 3]

    }

    private static void forMAP(){
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        map.firstEntry();   //1=One
        map.lastEntry();    //3=Three

        System.out.println(map);  //{1=One, 2=Two, 3=Three}

        Map.Entry<Integer, String> first = map.pollFirstEntry();   //1=One
        Map.Entry<Integer, String> last = map.pollLastEntry();    //3=Three

        System.out.println(map);  //{2=Two}

        map.putFirst(1, "One");     //{1=One, 2=Two}
        map.putLast(3, "Three");    //{1=One, 2=Two, 3=Three}

        System.out.println(map);  //{1=One, 2=Two, 3=Three}
        System.out.println(map.reversed());   //{3=Three, 2=Two, 1=One}
    }

    public static void main(String[] args) {
        sequencedCollection();
        forMAP();

        List<Integer> list = List.of(1, 2, 3);
//        list.addLast(4);

        List<Integer> empty = List.of();
//        System.out.println(empty.get(0));
//        System.out.println(empty.getFirst());
    }
}
