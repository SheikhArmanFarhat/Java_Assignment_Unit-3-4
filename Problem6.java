import java.util.StringTokenizer;

class Problem6 {
    public static void main(String[] args) {

        String sentence = "Java is very easy to learn";

        StringTokenizer st = new StringTokenizer(sentence);

        int count = st.countTokens();

        System.out.println("Total words: " + count);
    }
}
