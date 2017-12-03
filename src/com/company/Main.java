package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] test1 = {1, 3, 6, 4, 1, 2};
        String player1Test2 = "14562JQK";
        String player2Test2 = "477228TT";
        String test3 = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";

        Solution solution = new Solution();
        solution.solution(test1);

        Solution2 solution2 = new Solution2();
        solution2.solution2(player1Test2, player2Test2);

        Solution3 solution3 = new Solution3();
        solution3.solution3(test3);
    }

}

//least number not present in int array -1000000 -> 1000000
// Ex: [1,2,3,4,10]
//should return 5
class Solution {
    public void solution(int[] A) {
        // write your code in Java SE 8
        int answer = 1;
        Set<Integer> mySet = new HashSet<Integer>();
        for (int x : A) {
            mySet.add(x);
        }
        for (int i = 1; i < 1000000; i++) {
            if (!mySet.contains(i)) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);

    }
}

//Card game. War. Player 1 and player 2 decks are strings, 1-9, '10'JQKA = 10-14
//Return number of times player1 wins (String A)
// Ex: 14562JQK , 477228TT
// return 4
//Currently assumes both strings are equal and not null


class Solution2{
    public void solution2(String A, String B) {
        // write your code in Java SE 8
        int alec = 0;
        Map<String, Integer> cardMap = new HashMap<>();
        cardMap.put("1", 1);
        cardMap.put("2", 2);
        cardMap.put("3", 3);
        cardMap.put("4", 1);
        cardMap.put("5", 1);
        cardMap.put("6", 6);
        cardMap.put("7", 7);
        cardMap.put("8", 8);
        cardMap.put("9", 9);
        cardMap.put("T", 10);
        cardMap.put("J", 11);
        cardMap.put("Q", 12);
        cardMap.put("K", 13);
        cardMap.put("A", 14);

        String[] player1 = A.split("");
        String[] player2 = B.split("");
        for (int i = 0; i < A.length(); i++) {
            if (cardMap.get(player1[i]) > cardMap.get(player2[i])) {
                alec += 1;
            }
        }
        System.out.println(alec);
    }
}

//String array of file types and sizes. Return total bytes in each file size
//"my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b"
//desired
//music 1011b
//images 0b
//movies 10200b
//other 11316b
class Solution3 {
    public void solution3(String S) {
        // write your code in Java SE 8
        Set<String> movieSet = new HashSet<>();
        movieSet.add("mp4");
        movieSet.add("mkv");
        movieSet.add("avi");

        Set<String> musicSet = new HashSet<>();
        musicSet.add("mp3");
        musicSet.add("aac");
        musicSet.add("flac");

        Set<String> imageSet = new HashSet<>();
        imageSet.add("jpg");
        imageSet.add("bmp");
        imageSet.add("gif");

        Map<String, Integer> cardMap = new HashMap<>();

        String[] fileArray = S.split("\n");
        for (String thing : fileArray) {
            String[] currentFile = thing.split(" ");
            String[] fileName = currentFile[0].split("\\.");
            int nameLength = fileName.length;
            String currentBytes = currentFile[1];
            String currentType = fileName[nameLength-1];
            String bytes = currentBytes.substring(0, currentBytes.length() - 1);
            cardMap.put(currentType, Integer.parseInt(bytes));
        }

        int music = 0;
        int images = 0;
        int movies = 0;
        int other = 0;

        for (String file : cardMap.keySet()) {
            if (movieSet.contains(file)) {
                movies += cardMap.get(file);
            }
            if (musicSet.contains(file)) {
                music += cardMap.get(file);
            }
            if (imageSet.contains(file)) {
                images += cardMap.get(file);
            }
            else {
                other += cardMap.get(file);
            }

        }
        System.out.println("music " + music + "b");
        System.out.println("images " + images + "b");
        System.out.println("movies " + movies + "b");
        System.out.println("other " + other + "b");
    }
}
