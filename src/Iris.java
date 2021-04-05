import java.util.Comparator;


public class Iris {

    //declare variables
    double sepalLength;
    double sepalWidth;
    double petalLength;
    double petalWidth;
    String species;

    //default constructor
    public Iris(){
        sepalLength = 0.0;
        sepalWidth = 0.0;
        petalLength = 0.0;
        petalWidth = 0.0;
        species = "NA";

    }

    //parameterized constructor
    public Iris(double sepalLength, double sepalWidth, double petalLength, double petalWidth, String species){
        this.sepalLength = sepalLength;
        this.sepalWidth = sepalWidth;
        this.petalLength = petalLength;
        this.petalWidth = petalWidth;
        this.species = species;
    }

    //get methods
    public double getSepalLength(){
        return sepalLength;
    }

    public double getSepalWidth(){
        return sepalWidth;
    }

    public double getPetalLength(){
        return petalLength;
    }

    public double getPetalWidth(){
        return petalWidth;
    }

    public String getSpecies(){
        return species;
    }

    //set methods
    public void setSepalLength(double sepalLength){
        this.sepalLength = sepalLength;
    }

    public void setSepalWidth(double sepalWidth){
        this.sepalWidth = sepalWidth;
    }

    public void setPetalLength(double petalLength){
        this.petalLength = petalLength;
    }

    public void setPetalWidth(double petalWidth){
        this.petalWidth = petalWidth;
    }

    public void setSpecies(String species){
        this.species = species;
    }


    //toString method
    @Override //WHAT DID SHE WANT HERE????
    public String toString(){
        return "Sepal Length: " + getSepalLength() + " Sepal Width: " + getSepalWidth() + " Petal Length: " + getPetalLength() + " Petal Width: " + getPetalWidth() + " Species: " + getSpecies();
        //returns a string version of the information stored in the class
    }

    public int Comparator(Iris Iris2){
        irisComparator irisCompare = new irisComparator();
        return irisCompare.compare(this, Iris2);
    }


    class irisComparator implements Comparator<Iris>{

        //compareTo method// only supposed to be one parameter???

        public int compare(Iris Iris1, Iris Iris2){

            //doube check dont need and
            int compareSepal = Double.compare(Iris1.getSepalLength(), Iris2.getSepalLength());
            int comparePetal = Double.compare(Iris1.getPetalLength(), Iris2.getPetalLength());

            if(compareSepal == 0){
                return comparePetal;
            }
            else{
                return compareSepal;
            }


        }
    }


   public boolean isLessThan(Iris Iris2){
            irisComparator iCompare = new irisComparator();
            if(iCompare.compare(this, Iris2)> 0){
                return false;
            }
            else{
                return true;
            }
    }

}
