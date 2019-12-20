import java.io.*;
import java.util.ArrayList;

public class AdventOfCode {

    private static final int DIVIDE_BY = 3;
    private static final int SUBTRACT_BY = 2;

    public static void main(String[] args) throws IOException {
        long totalFuel = 0;
        ArrayList<String> inputs = getInputs();
        for(String input : inputs) {
            long mass = calculateFuel(Long.parseLong(input));
            totalFuel += mass;
        }

        System.out.println("Total Fuel Needed = " + totalFuel);

    }

    public static long calculateFuel(long mass) {
        long fuelRequired = 0;
        long tempFuelRequired = (Math.floorDiv(mass, DIVIDE_BY)) - SUBTRACT_BY;

        while(tempFuelRequired > 0) {
            fuelRequired += tempFuelRequired;
            tempFuelRequired = (Math.floorDiv(tempFuelRequired, DIVIDE_BY)) - SUBTRACT_BY;
        }
        return fuelRequired;
    }

    private static ArrayList<String> getInputs() throws IOException {
        ArrayList<String> results = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dave\\Documents\\AdventOfCodeDayOneInput.txt"));
        String line = reader.readLine();

        while(line != null) {
            results.add(line);
            line = reader.readLine();
        }

        return results;
    }
}
