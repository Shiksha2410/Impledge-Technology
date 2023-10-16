import java.io.*;
import java.util.*;

public class LongestCompoundWord {
    // Inner class for fast reading from a file
    static class FastReader {
        BufferedReader fileReader;
        StringTokenizer tokens;
        
        // Constructor to initialize the BufferedReader with a file
        public FastReader(String fileName) throws IOException {
            File file = new File(fileName);
            fileReader = new BufferedReader(new FileReader(file));
        }
        
        // Read the next token from the file
        String next() {
            while (tokens == null || !tokens.hasMoreElements()) {
                try {
                    tokens = new StringTokenizer(fileReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return tokens.nextToken();
        }
        
        // Read the next integer from the file
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        // Read the next long from the file
        long nextLong() {
            return Long.parseLong(next());
        }
        
        // Read the next double from the file
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        // Read the next line from the file
        String nextLine() {
            String line = "";
            try {
                line = fileReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return line;
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        FastReader reader = new FastReader(fileName);
        TreeMap<String, Boolean> treeMap = new TreeMap<>(new SortByLengthDecreasing());
        HashMap<String, Boolean> hashMap = new HashMap<>();
        String fileLine;
        
        // Read lines from the file and populate the TreeMap and HashMap
        while ((fileLine = reader.nextLine()) != null) {
            treeMap.put(fileLine, true);
            hashMap.put(fileLine, true);
        }
        
        long startTime = System.currentTimeMillis();
        String[] longestCompoundWords = findLongestCompoundWords(treeMap, hashMap);
        long endTime = System.currentTimeMillis();
        
        // Print the results and execution time
        System.out.println("LONGEST COMPOUND WORD IS: " + longestCompoundWords[0]);
        System.out.println("SECOND LONGEST COMPOUND WORD IS: " + longestCompoundWords[1]);
        System.out.println("TIME REQUIRED TO COMPLETE THE EXECUTION IS: " + (endTime - startTime) + " milliseconds");
        sc.close();
    }
    
    // Function to find the longest and second longest compound words
    public static String[] findLongestCompoundWords(TreeMap<String, Boolean> treeMap, HashMap<String, Boolean> hashMap) {
        String[] result = new String[2];
        boolean foundLongest = false;
        boolean foundSecondLongest = false;
        
        // Iterate through the TreeMap to find the longest and second longest compound words
        for (Map.Entry<String, Boolean> entry : treeMap.entrySet()) {
            String word = entry.getKey();
            if (checkPossible(word, hashMap)) {
                if (!foundLongest) {
                    result[0] = word;
                    foundLongest = true;
                } else if (!foundSecondLongest) {
                    result[1] = word;
                    foundSecondLongest = true;
                    break;
                }
            }
        }
        return result;
    }
    
    // Function to check if a word can be formed by concatenating other words
    public static boolean checkPossible(String s, HashMap<String, Boolean> hashMap) {
        if (s.length() == 0) {
            return false;
        }
        if (s.length() == 1) {
            return hashMap.containsKey(s);
        }
        
        // Check if the word can be split into two parts, both of which are in the HashMap
        for (int i = 1; i < s.length(); i++) {
            String firstPart = s.substring(0, i);
            String secondPart = s.substring(i);
            if (hashMap.containsKey(firstPart)) {
                if (hashMap.containsKey(secondPart) || checkPossible(secondPart, hashMap)) {
                    return true;
                }
            }
        }
        return false;
    }
}

// Comparator for sorting strings by length in decreasing order
class SortByLengthDecreasing implements Comparator<String> {
    public int compare(String a, String b) {
        return b.length() - a.length();
    }
}
