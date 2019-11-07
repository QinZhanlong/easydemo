package com.codeman.springclouddemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private char gender;

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        String[] words = line.split(" ");
//        System.out.println(Arrays.toString(words));
//        System.out.println(words[words.length - 1].length());
//        String[] words1 = line.split(" ");
//        String first = words1[0];
//        String last = words1[1].toLowerCase(Locale.ENGLISH);
//        char lastChar = last.charAt(0);
//        char[] charArr = first.toLowerCase(Locale.ENGLISH).toCharArray();
//        int wordCount = 0;
//        for (char character : charArr){
//            if (character == lastChar) {
//                wordCount++;
//            }
//        }
//        System.out.println(wordCount);
//        scanner.close();
//        while (scanner.hasNext()) {
//            Integer[] data = new Integer[scanner.nextInt()];
//            int num = data.length;
//            for (int i = 0; i < num; i++) {
//                data[i] = scanner.nextInt();
//            }
//            Set<Integer> set = new HashSet<>();
//            List<Integer> list = Arrays.asList(data);
//            set.addAll(list);
//            List<Integer> list1 = new ArrayList<>();
//            list1.addAll(set);
//            Collections.sort(list1);
//            for (Integer element : list1) {
//                System.out.println(element);
//            }
//            System.exit(0);
//        }

//        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                while (sc.hasNext()) {
                    TreeSet<Integer> set = new TreeSet<Integer>();
                    int n = sc.nextInt();
                    if (n > 0 && n < 1000) {
                        for (int i = 0; i < n; i++) {
                            set.add(sc.nextInt());
                        }
                    } else {
                        System.out.println("chaochufanwei");
                        continue;
                    }
                    System.out.println(set);
                    for (Integer i : set) {
                        System.out.println(i);
                    }
                    System.exit(0);
                }

            }
        }
//    }
//}
