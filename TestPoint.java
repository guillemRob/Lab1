public class TestPoint {

    public static void main( String[] args){

        // Creating instances 
        GeometricPoint p1 = new GeometricPoint(2.3, 7.4, "Barcelona");
        GeometricPoint p2 = new GeometricPoint(4.8, 13.6, "Ankara");

        // Testing methods
        
        System.out.println(" ");

        System.out.println("Updating cordinates with setters: ");
        System.out.println("    Position x before: " + p1.getPositionX());
        p1.setPoistionX(34);
        System.out.println("    Position x after: " + p1.getPositionX());

        System.out.println("    Position y before: " + p1.getPositionY());
        p1.setPoistionY(4.9);
        System.out.println("    Position y after: " + p1.getPositionY());
        
        System.out.println(" ");

        System.out.println("Trying the PrintPoint method:");
        System.out.print("    Resulting point:");
        p1.printPoint();

        System.out.println(" ");

        System.out.println("Trying the setName method:");
        System.out.println("    City name before: " + p1.getName());
        p1.setName("Caceres");
        System.out.println("    City name after: " +p1.getName());

        System.out.println(" ");

        System.out.println("Trying the distancePoint method:");
        System.out.println("    Distance between p1 and p2: " + p1.distancePoint(p2));
    
        System.out.println(" ");





    }
    
}
