package java250list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagram(words));
    }
    public static List<List<String>> groupAnagram(String[] strs){
        // Map to store sorted word as key, and list of anagrams as value
        Map<String,List<String>> map = new HashMap<>();

        // Sort characters of word
        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Add word into corresponding anagram group
            map.putIfAbsent(sorted,new ArrayList<>());
            map.get(sorted).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
