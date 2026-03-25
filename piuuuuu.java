import java.util.Random;
public class JokeGenerator {
    public static void main(String[] args) {
        String[] jokes = {
            "Why do Java developers wear glasses? Because they can't C ",
            "Why did the computer go to the doctor? It caught a virus ",
            "Why was the Java code sad? Because it had too many bugs "
        };
        Random rand = new Random();
        int index = rand.nextInt(jokes.length);
        System.out.println(jokes[index]);
    }
}
