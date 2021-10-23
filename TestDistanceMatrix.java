public class TestDistanceMatrix {
    public static void main(String[] args) {
        
        DistanceMatrix matrix = new DistanceMatrix(); 

        GeometricPoint p1 = new GeometricPoint(2.3, 7.4, "Barcelona");
        GeometricPoint p2 = new GeometricPoint(4.8, 13.6, "Ankara");
        GeometricPoint p3 = new GeometricPoint(8.3, 94, "New York");
        GeometricPoint p4 = new GeometricPoint(22.6, 34, "Hong Kong");
        
        matrix.addCity(p1);
        matrix.addCity(p2);
        matrix.addCity(p3);
        matrix.addCity(p4);


        // Priting cities
        System.out.println(" ");

        System.out.println("Every city in LikedList: ");
        for (int idx = 0; idx < matrix.getNoOfCities(); idx++){
            System.out.print(matrix.getCityName(idx) + ", ");
        }
        System.out.println(" ");
        System.out.println(" ");

        matrix.createDistanceMatrix();

        System.out.println("Distance between " + p1.getName() + " and " + p2.getName() + ": " + matrix.getDistance(0, 1));

        System.out.println(" ");

        // Priting distanceMatrix
        System.out.println("Distance matrix: ");
        for (int i = 0; i < matrix.getNoOfCities(); i++) {
            for (int j = 0; j < matrix.getNoOfCities(); j++) {
                System.out.print(matrix.getDistance(i,j) + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
