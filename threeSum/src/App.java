import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        int[] array = {12, 3, 1, 2, -6, 5, -8, 6}; 


        System.out.println("Valid triplets are - " + threeSum(array, 0));
    }

    public static List<Integer[]> threeSum(int[] array, int k){
        List<Integer[]> list = new ArrayList<Integer[]>();

        if(array.length < 3) return list;

        Arrays.sort(array);

        for(int idx=0; idx<array.length-2; idx++){
            int leftIdx = idx+1;
            int rightIdx = array.length - 1;
            while(leftIdx < rightIdx){
                if(array[idx] + array[leftIdx] + array[rightIdx] == k){
                    Integer[] triplets = {array[idx], array[leftIdx], array[rightIdx]};
                    list.add(triplets);
                    leftIdx++;
                    rightIdx--;
                }
                else if(array[idx] + array[leftIdx] + array[rightIdx] > k){
                    rightIdx--;
                }
                else if(array[idx] + array[leftIdx] + array[rightIdx] < k){
                    leftIdx++;
                }
            }
        }
        for(int i=0; i<list.size(); i++){
            System.out.println("{ " + list.get(i) + " }");
        }

        return list;
    }

}
