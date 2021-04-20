package exercises;
import java.util.Scanner;
public class Index {
    public static void main(String[] args) {

        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
//        String aliceLC = alice.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term: ");
        String search = input.next();

//        String searchLC = search.toLowerCase();

        int index = alice.indexOf(search);
        int length = search.length();
        System.out.println("Your search term is at index " + index + " and is " + length + " characters long.");
        String[] parts = alice.split(search);
                System.out.println(parts[0] + parts[1]);

    }
}
