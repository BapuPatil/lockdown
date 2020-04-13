// Given an array of strings, group anagrams together.

// For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Return:

// [
//   ["ate", "eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] array  = {"tea","ate","tan","nat","bat","eat"};

        Arrays.sort(array);
        Map<String, ArrayList<String>> map = new HashMap();

        for(String str : array)
        {
                char[] charArray = str.toCharArray();
                Arrays.sort(charArray);
                String key = new String(charArray);

                if(!map.containsKey(key)){
                    map.put(key,new ArrayList<String>());
                }
                    map.get(key).add(str);

        }
        System.out.println(map.values());

    }
}
