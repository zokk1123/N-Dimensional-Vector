import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Objects;

public class Vector implements Iterable<Double>, Cloneable{
    private List<Double> coordinates;


    public Vector (List<Double> coordinates) {
        this.coordinates= new ArrayList<>(coordinates);
    }

    public Vector (double... coordinates) {
        this.coordinates= new ArrayList<>();
        for(double coordinate : coordinates){
            this.coordinates.add(coordinate);
        }
    }

    public double get(int i){
        return coordinates.get(i);
    }
    public void set(int i,double value){
        coordinates.set(i,value);
    }
    public int lenght(){
        return coordinates.size();
    }
    public Vector add(Vector other){
        if (this.lenght() != other.lenght()){
            throw new  IllegalArgumentException("Vector must have the same dimensions for addition");
        }
        List<Double> resultCoordinates= new ArrayList<>();
        for (int i = 0; i < this.lenght(); i++) {
            resultCoordinates.add(this.coordinates.get(i) + other.coordinates.get(i));
        }
        return new Vector(resultCoordinates);
    }
    @Override
    public Vector clone(){
        try{
            Vector cloned=(Vector) super.clone();
            cloned.coordinates= new ArrayList<>(coordinates);
            return cloned;
        }catch(CloneNotSupportedException e){
            throw new AssertionError(e);
        }
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("<");
        for (int i = 0; i < coordinates.size(); i++) {
            sb.append(coordinates.get(i));
            if (i < coordinates.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Objects.equals(coordinates, vector.coordinates);
    }
    @Override
    public Iterator<Double> iterator() {
        return coordinates.iterator();
    }
}

