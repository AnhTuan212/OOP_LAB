package OOP_Lab_03.theOtherProjects.garbage;


public class GarbageCreator {
    public static void main(String[] args) {
        // Simulate reading a large "file" by creating a byte array
        byte[] inputBytes = new byte[1000000]; // 1MB of data
        for (int i = 0; i < inputBytes.length; i++) {
            inputBytes[i] = (byte) (i % 128); // Fill with ASCII-like values
        }

        // Measure time for concatenation using + operator
        long startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        long endTime = System.currentTimeMillis();

        // Print the time taken
        System.out.println("Time taken using + operator: " + (endTime - startTime) + " ms");
    }
}
