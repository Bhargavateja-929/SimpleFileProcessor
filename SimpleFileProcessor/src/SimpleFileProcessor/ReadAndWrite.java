package SimpleFileProcessor;

import java.io.*;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try {
            // Use Scanner to read the input file
            Scanner scanner = new Scanner(new File(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(","); 
                
                // Write data to the output file
                writer.write("Name: " + data[0]);
                writer.newLine();
                writer.write("Age: " + data[1]);
                writer.newLine();
                writer.write("Id: " + data[2]);
                writer.newLine();
                writer.newLine();
            }

            // Close resources
            scanner.close();
            writer.close();

            System.out.println("Data has been processed and written to " + outputFileName);
            
        } catch (IOException e) {
            System.err.println("An error occurred while processing the file: " + e.getMessage());
        }
    }
}

