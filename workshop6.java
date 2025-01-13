/* 
import java.util.ArrayList;

public class workshop6 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Bibek");
        students.add("Amrit");
        students.add("Ashran");
        students.add("Ashim");

        System.out.println("List of the students:");
        printArrayList(students);

        ArrayList<String> examinees = new ArrayList<>();

        examinees.add("Examinee1");
        examinees.add("Examinee2");
        examinees.add("Examinee3");
        examinees.add("Examinee4");

        System.out.println("\nList of examinees:");
        printArrayList(examinees);

         examinees.remove("Examinee3");

        System.out.println("\nUpdated list of the examinee after withdrawl");
        printArrayList(examinees);
    }

    public static void printArrayList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element);
        }

        }
    }
*/
/* 
import java.util.LinkedList;

public class Workshop6 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(5);
        linkedList.addLast(10);
        if (linkedList.isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            System.out.println("Linked list is not empty");
        }
    }
}
*/
/* 

import java.util.ArrayList;
import java.util.Collections;

public class Workshop6 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        int rotateBy = 2;

        Collections.rotate(arrayList, rotateBy);

        System.out.println(arrayList);
    }
}
*/

/* 
import java.util.LinkedList;
import java.util.Collections;

public class Workshop6 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Colors in the linked list:");
        for (String color : colors) {
            System.out.println(color);
        }

        if (colors.contains("Red")) {
            System.out.println("Red exists in the linked list.");
        } else {
            System.out.println("Red does not exist in the linked list.");
        }

        Collections.shuffle(colors);
        System.out.println("Shuffled colors:");
        for (String color : colors) {
            System.out.println(color);
        }

        Collections.sort(colors);
        System.out.println("Colors in ascending order:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
*/
/*
import java.util.Stack;

public class Workshop6 {
    public static void main(String[] args) {
        Stack<String> taskStack = new Stack<>();

        taskStack.push("Read");
        taskStack.push("Write");
        taskStack.push("Code");

        String poppedTask = taskStack.pop();
        System.out.println("Popped task: " + poppedTask);

        taskStack.push("Debug");
        taskStack.push("Test");

        String topTask = taskStack.peek();
        System.out.println("Top task: " + topTask);

        // Print the stack
        System.out.println("Tasks in the stack:");
        for (String task : taskStack) {
            System.out.println(task);
        }
    }
}
*/
/* 
import java.util.Stack;

public class Workshop6 {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        Stack<String> wordStack = new Stack<>();
        
        for (String word : words) {
            wordStack.push(word);
        }
        
        StringBuilder reversedSentence = new StringBuilder();
        while (!wordStack.isEmpty()) {
            reversedSentence.append(wordStack.pop()).append(" ");
        }
        
        return reversedSentence.toString().trim();
    }
}
*/

/* 
import java.util.LinkedList;
import java.util.Queue;

public class Workshop6 {
    public static void main(String[] args) {
        Queue<String> printQueue = new LinkedList<>();

        printQueue.add("Document1");
        printQueue.add("Document2");
        printQueue.add("Document3");

        String dequeuedJob = printQueue.poll();
        System.out.println("Dequeued job: " + dequeuedJob);

        printQueue.add("Document4");
        printQueue.add("Document5");

        String nextJob = printQueue.peek();
        System.out.println("Next job in the queue: " + nextJob);

        System.out.println("Print jobs in the queue:");
        for (String job : printQueue) {
            System.out.println(job);
        }
    }
}

*/

/* 
import java.util.TreeSet;

public class Workshop6 {
    public static void main(String[] args) {
        TreeSet<String> namesSet = new TreeSet<>();

        namesSet.add("Bibek");
        namesSet.add("Amrit");
        namesSet.add("Ashran");
        namesSet.add("David");

        System.out.println("Names in alphabetical order:");
        for (String name : namesSet) {
            System.out.println(name);
        }
    }
}
*/

/* 
import java.util.HashSet;
import java.util.Set;

public class workshop6 {
    
    public static Set<String> performUnion(Set<String> set1, Set<String> set2) {
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }
    
    public static Set<String> performIntersection(Set<String> set1, Set<String> set2) {
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
    
    public static Set<String> performDifference(Set<String> set1, Set<String> set2) {
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }
    
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Elephant");
        set1.add("Lion");
        
        Set<String> set2 = new HashSet<>();
        set2.add("Cat");
        set2.add("Giraffe");
        set2.add("Dog");
        set2.add("Monkey");
        
        System.out.println("Original sets:");
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        
        Set<String> union = performUnion(set1, set2);
        System.out.println("\nUnion of sets:");
        System.out.println(union);
        
        Set<String> intersection = performIntersection(set1, set2);
        System.out.println("\nIntersection of sets:");
        System.out.println(intersection);
        
        Set<String> difference = performDifference(set1, set2);
        System.out.println("\nDifference of sets (Set1 - Set2):");
        System.out.println(difference);
    }
}
*/

/* 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class workshop6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> contacts = new HashMap<>();

        // Adding some initial contacts
        contacts.put("John Doe", "1234567890");
        contacts.put("Jane Smith", "9876543210");
        contacts.put("Alice Johnson", "5551234567");

        // Display menu
        while (true) {
            System.out.println("\nContact Manager Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    contacts.put(name, phoneNumber);
                    System.out.println("Contact added successfully.");
                    break;
                case 2:
                    System.out.print("Enter contact name to search: ");
                    String searchName = scanner.nextLine();
                    if (contacts.containsKey(searchName)) {
                        System.out.println("Phone number: " + contacts.get(searchName));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
}
*/

/* 
import java.util.HashMap;
import java.util.Map;

public class workshop6 {
    private static Map<String, String> countryCapitals = new HashMap<>();

    public static void main(String[] args) {
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("UK", "London");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("Japan", "Tokyo");

        printMap(countryCapitals);

        String capital = getCapital("USA");
        System.out.println("Capital of USA: " + capital);

        boolean exists = containsCapital("London");
        System.out.println("Is London a capital? " + exists);

        System.out.println("\nCountry-Capital Pairs:");
        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void printMap(Map<String, String> map) {
        System.out.println("Printing Map:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static String getCapital(String country) {
        return countryCapitals.get(country);
    }

    public static boolean containsCapital(String capital) {
        return countryCapitals.containsValue(capital);
    }
}
*/
/* 
import java.util.Arrays;

public class workshop6 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 7, 1, 9, 3};

        Arrays.sort(numbers);
        System.out.println("Sorted array in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nSorted array in descending order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
*/

/* 
import java.util.ArrayList;
import java.util.Collections;

public class workshop6 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        Collections.sort(colors);
        System.out.println("Sorted list of colors in ascending order:");
        for (String color : colors) {
            System.out.println(color);
        }

        Collections.sort(colors, Collections.reverseOrder());
        System.out.println("\nSorted list of colors in descending order:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
*/
/* 
import java.util.ArrayList;
import java.util.Collections;

public class workshop6 {
    public static void main(String[] args) {
        // Initialize ArrayList with a set of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        // Sort the ArrayList (binary search requires a sorted list)
        Collections.sort(numbers);

        // Number to search
        int target = 30;

        // Perform binary search
        int index = binarySearch(numbers, target);

        // Print the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the list.");
        }
    }

    // Binary search implementation
    public static int binarySearch(ArrayList<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) == target) {
                return mid; // Element found
            } else if (arr.get(mid) < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }
}
*/
/* 
public class workshop6 {
    public static void main(String[] args) {
        String input = "HelloWorld123";
        boolean containsOnlyAllowedChars = containsOnlyAllowedChars(input);
        
        if (containsOnlyAllowedChars) {
            System.out.println("The string contains only a-z, A-Z, and 0-9.");
        } else {
            System.out.println("The string contains characters other than a-z, A-Z, and 0-9.");
        }
    }
    
    public static boolean containsOnlyAllowedChars(String str) {
        return str.matches("[a-zA-Z0-9]+");
    }
}
*/
/* 
public class workshop6 {
    public static void main(String[] args) {
        String input = "HelloWorld JavaIsGreat";
        findSequence(input);
    }
    
    public static void findSequence(String str) {
        StringBuilder sequence = new StringBuilder();
        
        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);
            
            if (Character.isUpperCase(currentChar) && Character.isLowerCase(nextChar)) {
                sequence.append(currentChar);
                sequence.append(nextChar);
            }
        }
        
        if (sequence.length() > 0) {
            System.out.println("Sequence of one uppercase letter followed by lowercase letters: " + sequence.toString());
        } else {
            System.out.println("No such sequence found in the string.");
        }
    }
}
*/

public class workshop6 {
    public static void main(String[] args) {
        String filename1 = "document.txt";
        String filename2 = "data.csv";
        
        if (hasTxtExtension(filename1)) {
            System.out.println(filename1 + " represents a file with a .txt extension.");
        } else {
            System.out.println(filename1 + " does not represent a file with a .txt extension.");
        }
        
        if (hasTxtExtension(filename2)) {
            System.out.println(filename2 + " represents a file with a .txt extension.");
        } else {
            System.out.println(filename2 + " does not represent a file with a .txt extension.");
        }
    }
    
    public static boolean hasTxtExtension(String filename) {
        return filename.endsWith(".txt");
    }
}
