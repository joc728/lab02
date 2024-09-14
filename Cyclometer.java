public class Cyclometer{
    public static void main(String[] args) {
        int secsTrip1 = 480;//Duration of Trip #1 in seconds
        int secsTrip2 = 3220;//Duration of Trip #2 in seconds 
        int countsTrip1 = 1561;//Amount of rotations during Trip #1
        int countsTrip2 = 9037;//Amount of rotations during Trip #2
        double wheelDiameter = 27,  // Value of the Diameter of the wheel
        PI = 3.14159,               //Value of Pi: needed to calculate the distances of the Trips
        feetPerMile = 5280,         //Conversion of Feet per Mile
        inchesPerFoot = 12,         //Conversion of Inches to Feet
        secondsPerMinute = 60;      //Conversion of Minutes to Seconds
        //Print Statements for the Time and Rotations of the Trips
        double distanceTrip1, distanceTrip2, totalDistance; //
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute) + " minutes and had "+ countsTrip1 + " counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute) + " minutes and had "+ countsTrip2 + " counts.");

        distanceTrip1 = countsTrip1 * wheelDiameter * PI; 
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1 /= inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2 = countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance = distanceTrip1+distanceTrip2;
        //Print Statements for the Distance of the Trips
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }
}