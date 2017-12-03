//package com.company;
//
//public class Foursquare {
//    A robot is located at the top-left corner of a m x n rectangular grid
//
//    The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
//
//    How many possible unique paths are there?
//
//    xxx
//            xxx
//
//    xxx xx  x
//    x  xx xxx
//
//    image: https://cl.ly/nSrf
//    Above is a 3 x 7 grid. How many possible unique paths are there?
//
//    Note: m and n will be at most 100.


// for 1x1 grid, we have 1 path
// for mxn grid
// right -> mx(n-1) grid -> # path = countUniquePaths(m, n-1)
// down -> (m-1)xn -> # path = countUniquePaths(m-1, n)
// total path = countUniquePaths(m, n-1) + countUniquePaths(m-1, n)

//
//    int countUniquePaths(int m, int n) {
//        int base = 1;
//        int height = m;
//        int width = n;
//        int numberWays = 0;
//    int countUniquePathsN(m, n-1) {
//        int count = 0;
//        if (n = base) {
//            return count;
//        } else {
//            count +=1;
//            countUniquePathsN(m, n-1);
//        }
//    int countUniquePathsM(m - 1, n) {
//        int count = 0;
//        if (m = base) {
//            return count;
//        } else {
//            count +=1;
//            countUniquePathsM(m - 1, n);
//        }
//        return countUniquePathsN + countUniquePathsM;
//        h
//
//
//
//
//
//
//
//
//
//
//
//        aba -> true
//        abcba -> true
//        17dd71 -> true

// "abc".charAt(1) = 'b'
// of type char

//        boolean checkPallandrome(String word) {
//            String[] reverse = word.split("");
//            String newstring = "";
//            for (int i = reverse.length; i > 0; i --) {
//                newString + reverse[i];
//
//            }
//            if (word == newString) {
//                return true;
//            } else {
//                return falae;
//            }
//
//        }
//
//        12345
//        abcba
//        boolean checkPallandrome(string word) {
//            int size = word.size();
//            for (int i = 1; i <= word.size(); i++) {
//                if (word.charAt(i) == word.charAt(size)) {
//                    size = size - 1;
//                }  else {
//                    return false;
//                }
//            }
//            return true;
//        }
//

// JAVA
// Given an array of integers, write a function that takes this array
// and an integer value N and finds the two values in the array that sum to N.
//
// Examples:
// twoSum([2, 7, 1, 0], 9) -> true
// twoSum([2, 7, 1, 0], 7) -> true
// twoSum([2, 7, 1, 0], 4) -> false

// 2 + x = 9
//
//    public static boolean twoSum(int[] array, int target) {
//        // implement the method here
//        Set<int> set = new Hashset<>();
//
//        for(Integer number : array) {
//            int difference = target - number;
//            if (set.contains(difference) {
//                return true;
//            } else {
//                set.add(number);
//            }
//        }
//        return false;
//    }
//
//}
