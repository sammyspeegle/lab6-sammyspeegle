public class Iris {

    //declare variables
    int sepalLength;
    int sepalWidth;
    int petalLength;
    int petalWidth;

    //default constructor
    public Iris(){
        sepalLength = 0;
        sepalWidth = 0;
        petalLength = 0;
        petalWidth = 0;
    }

    //parameterized constructor
    public Iris(int sepalLength, int sepalWidth, int petalLength. int petalWidth){


    }

    //toString method
    public String toString(){
        return "Sepal Length: " + sepalLength + " Sepal Width: " + sepalWidth + " Petal Length: " + petalLength + " Petal Width: " + petalWidth;
        //returns a string version of the information stored in the class
    }
    //@Override

    public int compareTo(Iris Iris2){
        if(sepalLengthIris1< sepalLengthIris2){
            Iris1< Iris2;
        }
    }

    public boolean isLessThan(Iris Iris2){

    }

}
