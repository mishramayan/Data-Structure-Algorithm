
public class App {
    public static void main(String[] args) throws Exception {

        int[] array = {2, 1, 2, 2, 2, 3, 4, 2};

        System.out.println("Code Running, proof - ");
        System.out.println(moveElementsToEnd(array, 2));
        
    }

    static int[] moveElementsToEnd(int[] array, int toMove){

        int i = 0;
        int j = array.length-1;
        int temp;

        while(i < j){
            while(array[j] == toMove &&  i<j){
                j--;
            }

            if(array[i] == toMove){
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                
            }
            i++;
        }


        for(int k=0; k<array.length; k++){
            System.out.print(array[k] + " ");
        }
        return array;
    }

}
