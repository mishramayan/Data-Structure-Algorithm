import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double mid;

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(6);
        list1.add(3);
        list1.add(4);
        

        list2.add(5);
        list2.add(1);
        list2.add(7);
        list2.add(5);
        list2.add(6);
        list2.add(2);


        list1.addAll(list2);

        System.out.println(list1);

        Collections.sort(list1);

        System.out.println("Sorted list - "+list1);

        if(list1.size()%2 ==0){
            mid = (list1.get(list1.size()/2) + list1.get(list1.size()/2 - 1)) / 2  +  0.5;
        }

        else{
            mid = (list1.get(list1.size()/2)) / 2;
        }

        System.out.println(mid);
    }
}
