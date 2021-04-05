import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //switch method to go with bubble sort
    public static void switchMethod(ArrayList<Iris> a, int f, int s){
        Iris temp = a.get(f);
        a.set(f, a.get(s));
        a.set(s, temp);
    }


    //bubble sort which loops and sorts
    public static void BubbleSort(ArrayList<Iris> a, int size){
        boolean swapped;
        for(int i = 0; i<size-1; i++){
            swapped = false;
            for (int j = 0; j<size - 1 - i; j++){
                if(!a.get(j).isLessThan(a.get(j+1))){
                    switchMethod(a, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

            //fix me
        }
    }


    //merge sort which is recursive and calls mergesortedlist
    public static void mergeSort(ArrayList<Iris> a, ArrayList<Iris> tmp, int left, int right){

        if(left<right){
            int middle = (left+right)/2;

            //recursion
            mergeSort(a, tmp, left, middle);
            mergeSort(a, tmp, middle+1, right);

            mergeSortedLists(a, tmp, left, middle, right);

        }

    }

    //merge sorted list method which sorts the array list
    public static void mergeSortedLists(ArrayList<Iris> a, ArrayList<Iris> tmp, int left, int middle, int right) {
        int first = left;
        int second = middle + 1;

        tmp = new ArrayList<Iris>();

        //puts elements in order

        while(first<middle+1 && second<=right){
            if(a.get(first).isLessThan(a.get(second))){
                tmp.add(a.get(first));
                first = first + 1;
            }
            else {
                tmp.add(a.get(second));
                second = second + 1;
            }

        }

        while(first<middle+1){
            tmp.add(a.get(first));
            first = first + 1;
        }

        while(second<=right){
            tmp.add(a.get(second));
            second = second + 1;
        }

        int third = left;
        for(int k=0; k<tmp.size(); k++){
            a.set(third, tmp.get(k));
            third = third + 1;
        }

        }


    public static <myFile> void main(String [] args){

        //array lists
        ArrayList<Iris> list=new ArrayList<Iris>(); // list to be sorted
        ArrayList<Iris> tmp=new ArrayList<Iris>();   // temporary workspace

        //making tmp same as list
        for(int i =0; i<list.size();i++){
            tmp.add(list.get(i));
        }

        //read from file
        FileInputStream myFile = null;
        Scanner reader = null;

        //try and catch to see if the file is not found
        try {
            myFile = new FileInputStream("fish-iris.csv.txt");
            reader = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            System.out.println("Could not open input file - ending program");
            System.exit(1);
        }

        //printing label line
        System.out.println(reader.nextLine());

        //fill list
        for (int i =0; i<100; i++){
            String[] nextLine = reader.nextLine().split(",");
            double sepalLength = Double.parseDouble(nextLine[0]);
            double sepalWidth = Double.parseDouble(nextLine[1]);
            double petalLength = Double.parseDouble(nextLine[2]);
            double petalWidth = Double.parseDouble(nextLine[3]);
            String species = nextLine[4];
            list.add(new Iris(sepalLength, sepalWidth, petalLength, petalWidth, species));
        }

        //runs for this long
        int update = 0;
        while(list.size()<100000){
            list.add(list.get(update%list.size()));
            update = update + 1;
        }


        //Create a copy from list for Bubble sort
        ArrayList <Iris> list2=new ArrayList<Iris>();
        for(int i=0;i<list.size();i++)
            list2.add(list.get(i));

        //prints the information
        for(Iris k : list){
            System.out.println(k.toString());
        }


        //calculating mergesort runtime
        long startTime = System.nanoTime();

        // sort list using mergesort
        mergeSort(list, tmp, 0, list.size()-1);

        //printing runtime
        long endTime = System.nanoTime();
        System.out.println("Time of MergeSort: " + (endTime-startTime)+ "ns");



        //calculating bubble sort runtime
        startTime = System.nanoTime();

        //sort list2 using Bubble sort
        BubbleSort(list2, list2.size());

        //printing runtime
        endTime = System.nanoTime();
        System.out.println("Time of BubbleSort: " + (endTime-startTime)+ "ns");


           }
}
