package OOP_Lab_03.theOtherProjects.garbage;


public class NoGarbage {
    public static void main(String[] args) {
        // Simulate reading a large "file" by creating a byte array
        byte[] inputBytes = new byte[1000000]; // 1MB of data
        for (int i = 0; i < inputBytes.length; i++) {
            inputBytes[i] = (byte) (i % 128); // Fill with ASCII-like values
        }

        // Measure time for concatenation using StringBuffer
        long startTime = System.currentTimeMillis();
        StringBuffer outputBuffer = new StringBuffer();
        for (byte b : inputBytes) {
            outputBuffer.append((char) b);
        }
        String outputString = outputBuffer.toString();
        long endTime = System.currentTimeMillis();

        // Print the time taken
        System.out.println("Time taken using StringBuffer: " + (endTime - startTime) + " ms");
    }
}
