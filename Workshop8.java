// import java.io.*;

// public class FileCopyExample {
//     public static void main(String[] args) {
//         String inputFile = "one.txt";
//         String outputFile = "two.txt";

//         try {
//             // Create BufferedInputStream to read from inputFile
//             FileInputStream fileInputStream = new FileInputStream(inputFile);
//             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

//             // Create BufferedOutputStream to write to outputFile
//             FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
//             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

//             // Read from BufferedInputStream and write to BufferedOutputStream
//             int bytesRead;
//             byte[] buffer = new byte[1024]; // Buffer size set to 1KB

//             while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
//                 bufferedOutputStream.write(buffer, 0, bytesRead);
//             }

//             // Close streams
//             bufferedInputStream.close();
//             bufferedOutputStream.close();

//             System.out.println("File copied successfully!");
//         } catch (IOException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }
// //
// // import java.io.*;

// // public class FileCopyExample {
// //     public static void main(String[] args) {
// //         String inputFile = "one.txt";
// //         String outputFile = "two.txt";

// //         try {
// //             // Create BufferedReader to read from inputFile
// //             FileReader fileReader = new FileReader(inputFile);
// //             BufferedReader bufferedReader = new BufferedReader(fileReader);

// //             // Create BufferedWriter to write to outputFile
// //             FileWriter fileWriter = new FileWriter(outputFile);
// //             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

// //             // Read from BufferedReader and write to BufferedWriter
// //             String line;
// //             while ((line = bufferedReader.readLine()) != null) {
// //                 bufferedWriter.write(line);
// //                 bufferedWriter.newLine(); // Add newline after each line
// //             }

// //             // Close streams
// //             bufferedReader.close();
// //             bufferedWriter.close();

// //             System.out.println("File copied successfully!");
// //         } catch (IOException e) {
// //             System.out.println("Error: " + e.getMessage());
// //         }
// //     }
// // }
// // //import java.io.*;
// // import java.util.ArrayList;
// // import java.util.List;
// // import java.util.StringTokenizer;

// // public class NumberFileProcessor {

// //     public static void main(String[] args) {
// //         String inputFile = "numbers.txt"; // Path to input file
// //         String evenOutputFile = "even.txt"; // Path to output file for even numbers
// //         String oddOutputFile = "odd.txt"; // Path to output file for odd numbers

// //         try {
// //             List<Integer> numbers = read(inputFile);

// //             List<Integer> evenNumbers = getEven(numbers);
// //             List<Integer> oddNumbers = getOdd(numbers);

// //             write(evenNumbers, evenOutputFile);
// //             write(oddNumbers, oddOutputFile);

// //             System.out.println("Numbers processed and written to files successfully!");
// //         } catch (IOException e) {
// //             System.out.println("Error: " + e.getMessage());
// //         }
// //     }

// //     // Method to extract even numbers from a list of integers
// //     public static List<Integer> getEven(List<Integer> numbers) {
// //         List<Integer> evenNumbers = new ArrayList<>();
// //         for (Integer number : numbers) {
// //             if (number % 2 == 0) {
// //                 evenNumbers.add(number);
// //             }
// //         }
// //         return evenNumbers;
// //     }

// //     // Method to extract odd numbers from a list of integers
// //     public static List<Integer> getOdd(List<Integer> numbers) {
// //         List<Integer> oddNumbers = new ArrayList<>();
// //         for (Integer number : numbers) {
// //             if (number % 2 != 0) {
// //                 oddNumbers.add(number);
// //             }
// //         }
// //         return oddNumbers;
// //     }

// //     // Method to write a list of integers to a text file
// //     public static void write(List<Integer> numbers, String filePath) throws IOException {
// //         BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
// //         for (Integer number : numbers) {
// //             writer.write(number.toString());
// //             writer.newLine();
// //         }
// //         writer.close();
// //     }

// //     // Method to read numbers from a text file and return them as a list of integers
// //     public static List<Integer> read(String filePath) throws IOException {
// //         List<Integer> numbers = new ArrayList<>();
// //         BufferedReader reader = new BufferedReader(new FileReader(filePath));
// //         String line;
// //         while ((line = reader.readLine()) != null) {
// //             StringTokenizer tokenizer = new StringTokenizer(line);
// //             while (tokenizer.hasMoreTokens()) {
// //                 String token = tokenizer.nextToken();
// //                 int number = Integer.parseInt(token);
// //                 numbers.add(number);
// //             }
// //         }
// //         reader.close();
// //         return numbers;
// //     }
// // }
// // //
// // import java.io.BufferedReader;
// // import java.io.FileReader;
// // import java.io.IOException;
// // import java.util.StringTokenizer;

// // public class WordCount {

// //     public static void main(String[] args) {
// //         String filename = "input.txt"; // Path to the input text file

// //         try {
// //             int wordCount = countWords(filename);
// //             System.out.println("Total number of words in the file: " + wordCount);
// //         } catch (IOException e) {
// //             System.out.println("Error reading file: " + e.getMessage());
// //         }
// //     }

// //     // Method to count words in a text file
// //     public static int countWords(String filename) throws IOException {
// //         int count = 0;

// //         // Open the file for reading
// //         BufferedReader reader = new BufferedReader(new FileReader(filename));

// //         // Read each line from the file
// //         String line;
// //         while ((line = reader.readLine()) != null) {
// //             // Tokenize each line into words
// //             StringTokenizer tokenizer = new StringTokenizer(line);

// //             // Count the number of words in the line
// //             count += tokenizer.countTokens();
// //         }

// //         // Close the reader
// //         reader.close();

// //         return count;
// //     }
// // }
// // //
// // import java.io.FileWriter;
// // import java.io.IOException;
// // import java.util.Scanner;

// // public class StudentInfoToCSV {

// //     public static void main(String[] args) {
// //         Scanner scanner = new Scanner(System.in);

// //         // Get student information from the user
// //         System.out.println("Enter student information:");
// //         System.out.print("First Name: ");
// //         String firstName = scanner.nextLine();

// //         System.out.print("Last Name: ");
// //         String lastName = scanner.nextLine();

// //         System.out.print("Address: ");
// //         String address = scanner.nextLine();

// //         System.out.print("Contact Number: ");
// //         String contactNumber = scanner.nextLine();

// //         System.out.print("Semester: ");
// //         String semester = scanner.nextLine();

// //         // Create a Student object with the entered information
// //         Student student = new Student(firstName, lastName, address, contactNumber, semester);

// //         // Write student information to a CSV file
// //         String csvFile = "students.csv";
// //         try {
// //             writeStudentToCSV(student, csvFile);
// //             System.out.println("Student information written to " + csvFile + " successfully.");
// //         } catch (IOException e) {
// //             System.out.println("Error writing to CSV file: " + e.getMessage());
// //         }

// //         scanner.close();
// //     }

// //     // Method to write student information to a CSV file
// //     public static void writeStudentToCSV(Student student, String fileName) throws IOException {
// //         FileWriter csvWriter = new FileWriter(fileName, true);

// //         // Write student information as a CSV record
// //         csvWriter.append(String.join(",", student.getFirstName(), student.getLastName(),
// //                 student.getAddress(), student.getContactNumber(), student.getSemester()));
// //         csvWriter.append("\n");

// //         csvWriter.flush();
// //         csvWriter.close();
// //     }

// //     // Student class with attributes
// //     static class Student {
// //         private String firstName;
// //         private String lastName;
// //         private String address;
// //         private String contactNumber;
// //         private String semester;

// //         // Constructor
// //         public Student(String firstName, String lastName, String address, String contactNumber, String semester) {
// //             this.firstName = firstName;
// //             this.lastName = lastName;
// //             this.address = address;
// //             this.contactNumber = contactNumber;
// //             this.semester = semester;
// //         }

// //         // Getters
// //         public String getFirstName() {
// //             return firstName;
// //         }

// //         public String getLastName() {
// //             return lastName;
// //         }

// //         public String getAddress() {
// //             return address;
// //         }

// //         public String getContactNumber() {
// //             return contactNumber;
// //         }

// //         public String getSemester() {
// //             return semester;
// //         }
// //     }
// // }
// // //
// // import java.io.*;
// // import java.util.HashMap;
// // import java.util.Map;

// // public class ProductAverageSales {

// //     public static void main(String[] args) {
// //         String inputFile = "products.txt"; // Path to the input text file
// //         String outputFile = "average_sales.csv"; // Path to the output CSV file

// //         try {
// //             Map<String, ProductStats> productMap = readProductData(inputFile);
// //             writeAverageSalesToCSV(productMap, outputFile);
// //             System.out.println("Average sales exported to " + outputFile + " successfully.");
// //         } catch (IOException e) {
// //             System.out.println("Error: " + e.getMessage());
// //         }
// //     }

// //     // Method to read product data from the text file and calculate average sales
// //     public static Map<String, ProductStats> readProductData(String inputFile) throws IOException {
// //         Map<String, ProductStats> productMap = new HashMap<>();

// //         BufferedReader reader = new BufferedReader(new FileReader(inputFile));
// //         String line;

// //         while ((line = reader.readLine()) != null) {
// //             String[] parts = line.split(";");
// //             if (parts.length == 2) {
// //                 String productName = parts[0].trim();
// //                 double price = Double.parseDouble(parts[1].trim());

// //                 // Update product stats
// //                 if (productMap.containsKey(productName)) {
// //                     ProductStats stats = productMap.get(productName);
// //                     stats.addSale(price);
// //                 } else {
// //                     ProductStats stats = new ProductStats();
// //                     stats.addSale(price);
// //                     productMap.put(productName, stats);
// //                 }
// //             }
// //         }

// //         reader.close();
// //         return productMap;
// //     }

// //     // Method to write average sales of each product to a CSV file
// //     public static void writeAverageSalesToCSV(Map<String, ProductStats> productMap, String outputFile) throws IOException {
// //         BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
// //         writer.write("Product,Average Sales\n");

// //         for (Map.Entry<String, ProductStats> entry : productMap.entrySet()) {
// //             String productName = entry.getKey();
// //             double averageSales = entry.getValue().getAverageSales();
// //             writer.write(productName + "," + averageSales + "\n");
// //         }

// //         writer.close();
// //     }

// //     // Helper class to store product sales statistics
// //     static class ProductStats {
// //         private int count;
// //         private double totalSales;

// //         public ProductStats() {
// //             this.count = 0;
// //             this.totalSales = 0.0;
// //         }

// //         public void addSale(double price) {
// //             this.count++;
// //             this.totalSales += price;
// //         }

// //         public double getAverageSales() {
// //             if (count == 0) {
// //                 return 0.0;
// //             }
// //             return totalSales / count;
// //         }
// //     }
// // }
// // //
// // import java.io.BufferedReader;
// // import java.io.FileReader;
// // import java.io.FileWriter;
// // import java.io.IOException;
// // import java.util.ArrayList;
// // import java.util.HashMap;
// // import java.util.List;
// // import java.util.Map;

// // public class CSVToTextFiles {

// //     public static void main(String[] args) {
// //         String csvFile = "input.csv"; // Path to the input CSV file

// //         try {
// //             List<String> headers = readHeaders(csvFile);
// //             Map<String, List<String>> dataMap = readCSVData(csvFile, headers);

// //             for (String header : headers) {
// //                 String outputFileName = header + ".txt";
// //                 List<String> columnValues = dataMap.get(header);
// //                 writeTextFile(outputFileName, columnValues);
// //                 System.out.println("Created file: " + outputFileName);
// //             }
// //         } catch (IOException e) {
// //             System.out.println("Error: " + e.getMessage());
// //         }
// //     }

// //     // Method to read headers from the CSV file (first line)
// //     public static List<String> readHeaders(String csvFile) throws IOException {
// //         BufferedReader reader = new BufferedReader(new FileReader(csvFile));
// //         String headerLine = reader.readLine();
// //         reader.close();

// //         String[] headersArray = headerLine.split(",");
// //         List<String> headers = new ArrayList<>();
// //         for (String header : headersArray) {
// //             headers.add(header.trim());
// //         }

// //         return headers;
// //     }

// //     // Method to read CSV data into a map of column headers to lists of values
// //     public static Map<String, List<String>> readCSVData(String csvFile, List<String> headers) throws IOException {
// //         Map<String, List<String>> dataMap = new HashMap<>();

// //         BufferedReader reader = new BufferedReader(new FileReader(csvFile));
// //         reader.readLine(); // Skip the first line (headers)

// //         for (String header : headers) {
// //             dataMap.put(header, new ArrayList<>());
// //         }

// //         String line;
// //         while ((line = reader.readLine()) != null) {
// //             String[] values = line.split(",");
// //             for (int i = 0; i < values.length && i < headers.size(); i++) {
// //                 String header = headers.get(i);
// //                 String value = values[i].trim();
// //                 dataMap.get(header).add(value);
// //             }
// //         }

// //         reader.close();
// //         return dataMap;
// //     }

// //     // Method to write a text file with column values
// //     public static void writeTextFile(String fileName, List<String> values) throws IOException {
// //         FileWriter writer = new FileWriter(fileName);
// //         for (String value : values) {
// //             writer.write(value + "\n");
// //         }
// //         writer.close();
// //     }
// // }
