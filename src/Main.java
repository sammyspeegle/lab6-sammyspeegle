import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    //Method declarations


    public static void switchMethod(ArrayList<Iris> a, int f, int s){
        int temp = a.get(f);
        a.set(f, a.get(s));
        a.set(s, temp);
    }


    public static void BubbleSort(ArrayList<Iris> a, int size){


        boolean swapped;
        for(int i = 0; i<a.size()-1; i++){
            swapped = false;
            for (int j = 0; j<a.size() - 1 - i; j++){
                if(a.get(j)>a.get(j+1)){
                    switchMethod(a, j, j+1);
                }
            }

            //fix me
        }
    }
    public static void mergeSort(ArrayList<Iris> a, ArrayList<Iris> tmp, int left, int right){
     int middle = (right-left)/2;
      int array1[] = new int [middle];
      int array2[] = new int[a.size() - middle];

      for (int i = 0; i<middle; i++){
          array1[i] = a[i];
      }

      for(int i = middle; i< right; i++){
          array2[i] = a[i];
      }



        //fix me
    }
    public static void mergeSortedLists(ArrayList<Iris> a, ArrayList<Iris> tmp, int left, int middle, int right){
        //fix me
    }

    public static void main(String [] args){
        //.....



        //....
        ArrayList<Iris> list=new ArrayList<Iris>();   // list to be sorted
        ArrayList<Iris> tmp=new ArrayList<Iris>();   // temporary workspace
        //fill list
        //....
        //...

        //Create a copy from list for Bubble sort
        ArrayList <Iris> list2=new ArrayList<Iris>();
        for(int i=0;i<list.size();i++)
            list2.add(list.get(i));

        // sort list using mergesort
        mergeSort(list, tmp, 0, list.size());
        //sort list2 using Bubble sort
        BubbleSort(list2, list2.size());

           }
}
