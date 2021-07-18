package strings;

public class Anagrams {
    public static void main(String[] args) {
        // anagram - same no of elements repeating same times in both strings
        String a = "abcba";
        String b = "badac";
        boolean isAnagram = false;
        boolean visited[] = new boolean[b.length()];
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                isAnagram = false;
                for (int j = 0; j < a.length(); j++) {

                    if (c == b.charAt(j) && !visited[j]) {
                        isAnagram = true;
                        visited[j] = true;
                    }

                }
                if (!isAnagram) {
                    break;
                }
            }
        }
        System.out.println(" is anagram " + isAnagram);
    }

}
