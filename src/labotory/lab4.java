package labotory;

import java.util.*;

public class lab4 {
  public static void main(String[] args) {
    // System.out.println("Exercise 1: ");
    // Ex1();
    // System.out.println("\n");

    // System.out.println("Exercise 2: ");
    // Ex2();
    // System.out.println("\n");

    // System.out.println("Exercise 3: ");
    // Ex3();
    // System.out.println("\n");

    // System.out.println("Exercise 4: ");
    // Ex4();
    // System.out.println("\n");

    // System.out.println("Exercise 5: ");
    // Ex5();
    // System.out.println("\n");

    System.out.println("Exercise 6: ");
    Ex6();
    System.out.println("\n");
  }

  public static void Ex1() {
    // Returning the sum of characters (that are not space character) of the input
    // string
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    int sum = 0;
    for (Character word : str.toLowerCase().toCharArray()) {
      if (word >= 'a' && word <= 'z') {
        sum += 1;
      }
    }

    System.out.println(sum);
    System.out.println("Sum of characters: " + sum);
    System.out.println("----------------------------------------");
    // Print out the reserve string of the input string
    String reserve = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reserve += str.charAt(i);
    }
    System.out.println("Reserve string: " + reserve);
    // If the string’s length > 3, print out the third character of the input
    // string.
    if (str.length() > 3) {
      System.out.println("The third character of the input string: " + str.charAt(2));
    } else {
      System.out.println("Undefined");
    }
    System.out.println("----------------------------------------");
    // Y4
    // code here
    // System.out.println("----------------------------------------");
    // Write an algorithm to accept two strings and check whether the second string
    // exists within the first string.
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the first string: ");
    String firstString = sc.nextLine();
    System.out.print("Enter the second string: ");
    String secondString = sc.nextLine();
    if (firstString.contains(secondString)) {
      System.out.println("The second string exists within the first string");
      System.out.println("The second string starts at index: " + firstString.indexOf(secondString));
    } else {
      System.out.println("The second string does not exist within the first string");
    }
    System.out.println("----------------------------------------");
    // How many the numeral characters, the vowel characters, the consonant
    // characters and the special characters does the input string have
    Scanner srcn = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String strg = sc.nextLine();
    System.out.println("The numeral characters: " + countNumeral(strg));
    System.out.println("The vowel characters: " + countVowel(strg));
    System.out.println("The consonant characters: " + countConsonant(strg));
    System.out.println("The special characters: " + countSpecial(strg));
    System.out.println("----------------------------------------");
    // How many word in the input string
    Scanner scnr = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String strng = sc.nextLine();
    System.out.println("The number of words: " + countWord(strng));
    System.out.println("----------------------------------------");
    // Print out the lower case letters of input string
    Scanner scnrr = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String strngg = sc.nextLine();
    System.out.println("The lower case letters: " + lowerCase(strngg));
    System.out.println("----------------------------------------");
    // Print out the upper case letters of input string
    Scanner scnrrr = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String strnggg = sc.nextLine();
    System.out.println("The upper case letters: " + upperCase(strnggg));
    System.out.println("----------------------------------------");
    // Replace letters that are identical and uninterrupted by one
    Scanner scnrrrr = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String strngggg = sc.nextLine();
    System.out.println("The string after replacing: " + replace(strngggg));
    System.out.println("----------------------------------------");
    // Create a method that input a string then all remove unnescessary blanks
    Scanner scnrrrrr = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String strnggggg = sc.nextLine();
    String replaceString = strnggggg.replaceAll("\\s+", " ");
    System.out.println("The string after removing: " + replaceString);
    System.out.println("----------------------------------------");
    // Create a method that input a string then count the number of presence of each
    // letter.

    // Create a method that input a string and an integer n then output n letters
    // from the right side of that string

    // Create a method that convert an input to title case (ex: "java programming
    // class" “Java Programming Class”)
    Scanner scnrrrrrrr = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String strnggggggg = sc.nextLine();
    System.out.println("The string after converting: " + titleCase(strnggggggg));
    System.out.println("----------------------------------------");
    // Create a method that convert an input to the English-name-like string
    // (ex:"Pham Thanh Son"  "Son Pham Thanh")
    Scanner scnrrrrrrrr = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String strngggggggg = sc.nextLine();
    englishName(strngggggggg);
    System.out.println("----------------------------------------");
    // Create a method that reverse an input by each word (ex "Pham Thanh Son" 
    // "Son Thanh Pham")
    Scanner scnrrrrrrrrr = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String strnggggggggg = sc.nextLine();
    System.out.println("The string after reversing: " + reverse(strnggggggggg));
    System.out.println("----------------------------------------");
  }

  private static String reverse(String strnggggggggg) {
    String[] words = strnggggggggg.split("\\s+");
    String reverse = "";
    for (int i = words.length - 1; i >= 0; i--) {
      reverse += words[i] + " ";
    }
    return reverse;
  }

  public static void englishName(String first) {
    String[] name = first.split("\\s+");
    System.out.print("English name: " + name[name.length - 1]);
    for (int i = 0; i < name.length - 1; i++) {
      System.out.print(" " + name[i]);
    }
  }

  private static String titleCase(String strnggggggg) {
    String[] words = strnggggggg.split("\\s+");
    String titleCase = "";
    for (String word : words) {
      titleCase += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
    }
    return titleCase;
  }

  private static String replace(String strngggg) {
    String result = "";
    for (int i = 0; i < strngggg.length(); i++) {
      if (i == strngggg.length() - 1) {
        result += strngggg.charAt(i);
      } else {
        if (strngggg.charAt(i) != strngggg.charAt(i + 1)) {
          result += strngggg.charAt(i);
        }
      }
    }
    return result;
  }

  private static String upperCase(String strnggg) {
    String upperCase = "";
    for (Character word : strnggg.toCharArray()) {
      if (word >= 'A' && word <= 'Z') {
        upperCase += word;
      }
    }
    return upperCase;
  }

  private static String lowerCase(String strngg) {
    String lowerCase = "";
    for (Character word : strngg.toCharArray()) {
      if (word >= 'a' && word <= 'z') {
        lowerCase += word;
      }
    }
    return lowerCase;
  }

  private static String countWord(String strng) {
    int count = 0;
    for (Character word : strng.toLowerCase().toCharArray()) {
      if (word >= 'a' && word <= 'z') {
        count += 1;
      }
    }
    return String.valueOf(count);
  }

  private static String countSpecial(String strg) {
    int count = 0;
    for (Character word : strg.toLowerCase().toCharArray()) {
      if (!(word >= 'a' && word <= 'z' || word >= '0' && word <= '9')) {
        count += 1;
      }
    }
    return String.valueOf(count);
  }

  private static String countConsonant(String strg) {
    int count = 0;
    for (Character word : strg.toLowerCase().toCharArray()) {
      if (word != 'a' && word != 'e' && word != 'i' && word != 'o' && word != 'u') {
        count += 1;
      }
    }
    return String.valueOf(count);
  }

  private static String countVowel(String strg) {
    int count = 0;
    for (Character word : strg.toLowerCase().toCharArray()) {
      if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
        count += 1;
      }
    }
    return String.valueOf(count);
  }

  private static String countNumeral(String strg) {
    int count = 0;
    for (Character word : strg.toLowerCase().toCharArray()) {
      if (word >= '0' && word <= '9') {
        count += 1;
      }
    }
    return null;
  }

  public static void Ex2() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the list: ");
    String arrayList = scnr.nextLine();
    String[] array = arrayList.split("\\s+");
    ArrayList<String> input = new ArrayList<String>(List.of(array));
    for (int i = 0; i < input.size(); i++) {
      if (input.get(i).length() % 2 == 0) {
        input.remove(input.get(i));
        i--;
      }
    }
    for (String word : input) {
      System.out.print(word + " ");
    }
    System.out.println("----------------------------------------");
  }

  public static void Ex3() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the list: ");
    String setOfString = scanner.nextLine();
    String[] input = setOfString.split("\\s+");
    Set<String> hashSet = new HashSet<String>(List.of(input));
    Iterator itrt = hashSet.iterator();
    while (itrt.hasNext()) {
      String check = (String) itrt.next();
      if (check.length() % 2 == 0) {
        itrt.remove();
      }
    }
    for (String word : hashSet) {
      System.out.print(word + " ");
    }
    System.out.println("----------------------------------------");
  }

  public static void Ex4() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the list: ");
    String[] input = scanner.nextLine().trim().split("\\s+");
    ArrayList<String> arrayListOfString = new ArrayList<String>(List.of(input));
    for (int i = 0; i < arrayListOfString.size(); i++) {
      arrayListOfString.add(i, arrayListOfString.get(i));
      i++;
    }
    for (String word : arrayListOfString) {
      System.out.print(word + " ");
    }
    System.out.println();
    System.out.println("----------------------------------------");
  }

  public static void Ex5() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the list: ");
    String[] input = scanner.nextLine().trim().split("\\s+");
    ArrayList<String> arrayListOfString = new ArrayList<String>(List.of(input));
    for (int i = 0; i < arrayListOfString.size() - 1; i++) {
      for (int j = i + 1; j < arrayListOfString.size(); j++) {
        if (arrayListOfString.get(i).equals(arrayListOfString.get(j))) {
          arrayListOfString.remove(j);
          j--;
        }
      }
    }
    Collections.sort(arrayListOfString);
    for (String word : arrayListOfString) {
      System.out.print(word + " ");
    }
    System.out.println();
    System.out.println("----------------------------------------");

  }

  public static void Ex6() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the list: ");
    String setOfString = scanner.nextLine();
    String[] input = setOfString.split("\\s+");
    HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    for (String word : input) {
      hashMap.containsKey(word);
      if (hashMap.containsKey(word)) {
        int count = hashMap.get(word);
        count++;
        hashMap.put(word, count);
      } else {
        hashMap.put(word, 1);
      }
    }
    for (String word : hashMap.keySet()) {
      if (hashMap.get(word) >= 3) {
        System.out.println(word + " occurs " + hashMap.get(word) + " times.");
      }
    }
    System.out.println();
    System.out.println("----------------------------------------");
  }
}