public class WordSplitter {
    public static void main(String[] args) {
        // 1. In src/WordSplitter.java: String word = "extraordinary". Print length, first char, last
        //    char.
        // 2. Print the first half and the second half using length() / 2 and substring.
        // 3. Print the word with its first and last letters swapped, built from substring pieces.
        // 4. Print the index of "ord" and the text that comes after "ord".
        // 5. Test with "programming". What does your ord code print, and why? Comment your answer. Push.
    
        String word = "extraordinary";
        int wordLength = word.length();
        char first = word.charAt(0);
        char last = word.charAt(wordLength-1);
        System.out.println(wordLength);
        System.out.println(first);
        System.out.println(last);

        int middle = wordLength/2;
        String half1 = word.substring(0, middle);
        String half2 = word.substring(middle);

        System.out.println(half1);
        System.out.println(half2);

        String mid = word.substring(1, wordLength - 1);
        String fLetter = word.substring(0, 1);
        String lLetter = word.substring(wordLength - 1);
        String swap = lLetter + mid + fLetter;
        System.out.println(swap);

        int index1 = word.indexOf("ord");
        System.out.println(index1);

        if (index1 != -1) {
            String afterOrd = word.substring(index1 + 3);
            System.out.println(afterOrd);
        } else {
            System.out.println(" ");
        }
    
    //When using "programming", the code returns " " because "ord" is not found in "programming" so it gets passed to the else statement whicb prints " "


    }
}
