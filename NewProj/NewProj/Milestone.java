package NewProj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Milestone {

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.isEmpty() || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int totalLength = words.length * wordLength;
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLength; i++) {
            int left = i;
            Map<String, Integer> subCount = new HashMap<>();

            for (int j = i; j <= s.length() - wordLength; j += wordLength) {
                String word = s.substring(j, j + wordLength);
                subCount.put(word, subCount.getOrDefault(word, 0) + 1);

                while (subCount.get(word) > wordCount.getOrDefault(word, 0)) {
                    String leftWord = s.substring(left, left + wordLength);
                    subCount.put(leftWord, subCount.get(leftWord) - 1);
                    left += wordLength;
                }

                if (j - left == totalLength - wordLength) {
                    result.add(left);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
   
        String s1 = "barfoothefoobarman";
        String[] words1 = {"foo", "bar"};
        System.out.println(findSubstring(s1, words1));  

    
        String s2 = "wordgoodgoodgoodbestword";
        String[] words2 = {"word", "good", "best", "word"};
        System.out.println(findSubstring(s2, words2));  

    
        String s3 = "barfoofoobarthefoobarman";
        String[] words3 = {"bar", "foo", "the"};
        System.out.println(findSubstring(s3, words3)); 
    }

}
