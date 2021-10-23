public class GeometricPoint {

    // Atributes
    private double positionX;
    private double positionY;
    private String name;

// Constructor
    public GeometricPoint (double x, double y, String name) {
        this.positionX = x;
        this.positionY = y;
        this.name = name;
    }

    // Getters
    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setPoistionX(double x) {
        positionX = x;
    }

    public void setPoistionY(double y) {
        positionY = y;
    }

    public void setName(String name){
        this.name = name;
    }

    // distancePoint
    public double distancePoint(GeometricPoint gP2) {
        
        double gP2X = gP2.positionX;
        double gP2Y = gP2.positionY;

        double x = getPositionX();
        double y = getPositionY();

        double distance = Math.sqrt(Math.pow((x-gP2X), 2) + Math.pow((y-gP2Y), 2));

        return distance;
    }

    // Print Point
    public void printPoint() {
        System.out.println("(" + positionX + ", " + positionY + ")");
    }

}


