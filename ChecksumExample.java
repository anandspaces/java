import java.util.Scanner;
public class ChecksumExample {
    // Function to calculate the checksum
    public static String calculateChecksum(String data) {
        int checksum = 0;

        // Calculate the checksum by XOR-ing all the 8-bit values
        for (int i = 0; i < 8; i++) {
            checksum ^= Character.getNumericValue(data.charAt(i));
        }

        return String.format("%8s", Integer.toBinaryString(checksum)).replace(' ', '0'); // Convert to 8-bit binary string
    }

    // Function to validate data
    public static boolean validateData(String dataWithChecksum) {
        String data = dataWithChecksum.substring(0, 8); // Extract the original data
        String receivedChecksum = dataWithChecksum.substring(8, 16); // Extract the received checksum

        // Calculate the checksum of the received data (excluding the received checksum)
        String calculatedChecksum = calculateChecksum(data);

        // Check if the calculated checksum matches the received checksum
        return calculatedChecksum.equals(receivedChecksum);
    }

    public static void main(String[] args) {
        // String data = "11011010"; // Replace this with your 8-bit binary data
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        // Calculate checksum and append it to the data
        String checksum = calculateChecksum(data);
        String dataWithChecksum = data + checksum;

        System.out.println("Data with checksum: " + dataWithChecksum);

        // Simulate receiving data with a possible error
        String receivedData = dataWithChecksum;
        boolean isError = !validateData(receivedData);

        if (isError) {
            System.out.println("Error in received data");
        } else {
            System.out.println("No error in received data");
        }
        scanner.close();
    }
}
