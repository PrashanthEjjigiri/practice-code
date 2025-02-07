package com.java;

import java.util.*;

public class AllCodePractice {
    public static void main(String[] args) {
        wordOccurence();
        reverseWordsInString();
        secondLargestNumberInArray();
        frequencyOfEachString();
        removeDuplicatesFromListString();
        isPrimeOrNot();
        printPrimeNumbers();
        binarySearchforArray();
        findDuplicatesInArray();
        reverseAnArray();
        sortArray();
        findAllSubArray();
        findMaxSubArray();
        moveAllZerosToEnd();
        isSortedArray();
        findLargestAndSmallestValueInArray();
        palindrome();
        armStrongNumbers();
        stringSwapping();
        anagramsCheck();
        isValidParanthsys();
        
        
        
        
         int firstDuplicateIndex = firstDuplicateIndex();
         if(firstDuplicateIndex != -1) {
        	 System.out.println("Index"+firstDuplicateIndex);
         }

    }
    
 
    
    private static int firstDuplicateIndex() {
        int[] arr = {2, -1, 4, 7, 9, 10, 4, 2, 1};
         HashSet<Integer> set = new HashSet<>();
    
        for (int i = 0; i < arr.length; i++) {
           if(set.contains(arr[i])){
        	   return i;
           }
       
           set.add(arr[i]);
        }
		return -1;
        

    }

    private static boolean isValidParanthsys() {
        String s = "{[()]}";

        boolean isValidParanthasys = true;

        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if ((c == '{') || (c == '(') || (c == '[')) {
                stack.push(c);

            } else if ((c == ']') && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if ((c == '}') && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if ((c == ')') && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                isValidParanthasys = false;
                System.out.println(isValidParanthasys);
                return false;

            }

        }
        System.out.println(isValidParanthasys);
        return stack.isEmpty();
    }

    private static void anagramsCheck() {
        String s1 = "listen";
        String s2 = "silent";
        boolean isAnagram = false;

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) {
                isAnagram = false;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        if (map.isEmpty()) System.out.println(isAnagram = true);
    }

    private static void stringSwapping() {
        String s1 = "Rama";
        String s2 = "Prashanth";
        System.out.println(s1 + "======" + s2);
        s1 = s1 + s2;
        s2 = s1.substring(0, (s1.length() - s2.length()));
        s1 = s1.substring(s2.length());

        System.out.println(s1 + "======" + s2);
    }

    private static void armStrongNumbers() {


        for (int num = 1; num <= 500; num++) {
            int temp, sum = 0;
            temp = num;
            for (int j = num; j > 0; j = j / 10) {
                int rem = j % 10;
                sum = sum + rem * rem * rem;
            }
            if (temp == sum) {
                System.out.println(sum + "yes its arm");
            }

        }


    }

    private static void palindrome() {
        int num = 151;

        int temp = num;
        int sum = 0;
        int rem;

        while (num > 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;

        }
        if (temp == sum) {
            System.out.println("its palindrome");
        }

    }

    private static void findLargestAndSmallestValueInArray() {
        // int[] arr = {0, -1, 0, 7, 9, 0, 4, 2, 1};
        int[] arr = {23, 25, 3, 47};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max + "  " + min);
    }


    private static void isSortedArray() {
        int[] arr = {0, -1, 0, 7, 9, 0, 4, 2, 1};
        //int[] arr = {1,4,6,8,9,10};
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
            }
        }
        System.out.println(isSorted);
    }

    private static void moveAllZerosToEnd() {
        int[] arr = {0, -1, 0, 7, 9, 0, 4, 2, 1};

        int modifyIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[modifyIndex] = arr[i];
                modifyIndex++;
            }
        }
        while (modifyIndex < arr.length) {
            arr[modifyIndex++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void findMaxSubArray() {
        int[] arr = {2, -1, 4, 7, 9, 10, 4, 2, 1};
        int res = arr[0];
        int curSum = arr[0];
        for (int i = 1; i < arr.length; i++) {

            curSum = Math.max(arr[i], curSum + arr[i]);
            res = Math.max(res, curSum);
        }
        System.out.println(res);
    }


    private static void findAllSubArray() {
        int[] arr = {2, -1, 4, 7, 9, 10, 4, 2, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    private static void sortArray() {
        int[] arr = {2, -1, 4, 7, 9, 10, 4, 2, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        int i = 0;
        while (arr[i] < arr[i + 1]) {
            arr[i] = arr[i] + arr[i + 1];
            arr[i + 1] = arr[i] - arr[i + 1];
            arr[i] = arr[i] - arr[i + 1];

        }
        System.out.println(Arrays.toString(arr));

    }

    private static void reverseAnArray() {
        int[] arr = {2, -1, 4, 7, 9, 10, 4, 2, 1};
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            arr[first] = arr[first] + arr[last];
            arr[last] = arr[first] - arr[last];
            arr[first] = arr[first] - arr[last];
            first++;
            last--;


        }
        System.out.print(Arrays.toString(arr));

    }

    private static void findDuplicatesInArray() {
        int[] arr = {2, -1, 4, 7, 9, 10, 4, 2, 1};
        int[] temp = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicates :" + arr[i] + " ");
                    temp[index++] = arr[i];
                    break;
                }
            }
        }
    }

    private static void binarySearchforArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("Found Search Index at ->" + mid);
                return;
            } else {
                System.out.println(target + "-> Not Found in Search Index");
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    private static void printPrimeNumbers() {
        int n = 15;
        for (int i = 0; i <= 15; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            int flag = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i + " ");


        }

    }

    private static void isPrimeOrNot() {

        int n = 19;
        boolean flag = false;
        if (n < 2) {
            flag = false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println(n + " -> yes, Its Prime");
        } else {
            System.out.println(n + " -> No, Its Not Prime");
        }

    }

    private static void removeDuplicatesFromListString() {
        List<String> list = Arrays.asList("java", "C++", "java", "python", "C++");

        ArrayList<String> uniqueList = new ArrayList<>();
        for (String s : list) {
            if (!uniqueList.contains(s)) {
                uniqueList.add(s);
            }
        }
        System.out.println(uniqueList.toString());
    }

    private static void frequencyOfEachString() {
        String s = "java java is programme";
        //String[] words = s.split("\\s+");
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        for (Map.Entry e : map.entrySet()) {
            System.out.println(e.getKey() + ": count -> " + e.getValue());
        }
        System.out.println();
    }

    private static void secondLargestNumberInArray() {
        int[] arr = {12, 2, 10, 6, 5, 11, 7, 9, -1};
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

        }
        System.out.println("second Large :" + secondLargest);
    }

    private static void reverseWordsInString() {
        String s = "java is java programme pra pra pra";
        String[] words = s.split("\\s+");
        StringBuffer str = new StringBuffer();
        for (int i = words.length - 1; i >= 0; i--) {
            str.append(words[i]);
            if (i > 0) {
                str.append(" ");
            }
        }
        System.out.println("Reversed Word :" + str);
    }


    public static void wordOccurence() {
        String s = "java is java programme pra pra pra";
        String[] words = s.split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        for (String s1 : words) {
            map.put(s1, map.getOrDefault(s1, 0) + 1);
        }
        for (String s2 : map.keySet()) {
            System.out.println("word :" + s2 + " Count :" + map.get(s2));
        }
    }
}
