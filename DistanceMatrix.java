import java.util.LinkedList;

public class DistanceMatrix {

    private LinkedList<GeometricPoint> cities;
    private double[][] matrix;


    // Constructor
    public DistanceMatrix() {
        this.cities = new LinkedList<GeometricPoint>();
    }

    public void addCity(GeometricPoint city) {
        
        cities.add(city);
    }

    public String getCityName(int idx) {
        return cities.get(idx).getName(); 
    }

    public int getNoOfCities() {
        return cities.size(); 
    }

    public void createDistanceMatrix() {

        this.matrix = new double[cities.size()][cities.size()];

        for (int i = 0; i < cities.size(); i++) {
            for (int j = 0; j < cities.size(); j++) {
                matrix[i][j] = cities.get(i).distancePoint(cities.get(j));
            }
        }
    }

    public double getDistance(int idx1, int idx2) {
        return matrix[idx1][idx2];
    }
}
