import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
import java.io.File;
import java.io.FileNotFoundException;

class HuffmanNode {
    int data;
    char c;

    HuffmanNode left;
    HuffmanNode right;
}

class MyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.data - y.data;
    }
}

public class Huffman {
    public static void printCode(HuffmanNode root, String s) {
        if (root.left == null && root.right == null) {
            System.out.println("ascii(" + (int) root.c + ") : " + s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void countLengths(HuffmanNode root, int[] charBitLength, int length) {
        if (root.left == null && root.right == null) {
            charBitLength[(int) root.c] = length;
            return;
        }
        countLengths(root.left, charBitLength, length + 1);
        countLengths(root.right, charBitLength, length + 1);
    }

    static int buildCharFreqFromFile(char[] charArray, int[] charFreq) {
        // remove code below *********************
              
        
        // remove code above *********************
        // open file and build static
        // your code here *********************
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) i;
            charFreq[i] = 0;
        } 
        int count = 0;
        try {
            // String bookName = "Book 7 - The Deathly Hallows.txt";
            String path = "D:\\HarryPotter\\";
            File myObj = new File(path);
            File[] listFile = myObj.listFiles();
            Scanner myReader = new Scanner("");
            for(File n:listFile) {
                myReader = new Scanner(n);
                while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                    for(char chr:data.toCharArray()) {
                        if (chr >= charArray.length) continue;
                        charFreq[chr]++;
                        count++;
                    }
                }
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          return count;
        // end your code *********************
    }

    // main function
    public static void main(String[] args) {
        char[] charArray = new char[256];
        int[] charFreq = new int[256];
        int cnt = buildCharFreqFromFile(charArray, charFreq);
        int n = charArray.length;

        PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new MyComparator());

        for (int i = 0; i < n; i++) {
            HuffmanNode hn = new HuffmanNode();

            hn.c = charArray[i];
            hn.data = charFreq[i];

            hn.left = null;
            hn.right = null;

            q.add(hn);
        }

        HuffmanNode root = null;

        while (q.size() > 1) {
            HuffmanNode x = q.peek();
            q.poll();

            HuffmanNode y = q.peek();
            q.poll();

            HuffmanNode f = new HuffmanNode();

            f.data = x.data + y.data;
            f.left = x;
            f.right = y;
            q.add(f);
        }
        root = q.peek();

        int[] charBitLength = new int[n];
        printCode(root, "");
        countLengths(root, charBitLength, 0);

        int sumBit = 0;
        int sumChar = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("ascii(" + i + "): " + charBitLength[i] + " ");
            sumBit += (charBitLength[i] * charFreq[i]);
            sumChar += charFreq[i];
        }
        System.out.println("Average bits per char: " + sumBit / (double) sumChar);
        System.out.println("Num of Characters is : " + cnt);

    }
}

// This code is contributed by Kunwar Desh Deepak Singh
