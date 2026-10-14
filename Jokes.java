
import java.util.Random;
public class Jokes {
    public static void main(String[] args) {
        String[] jokes = {
            "Why do programmers prefer dark mode? Because light attracts bugs 😄",
            "Java developer ka favourite drink? Java ☕",
            "Why did the computer go to the doctor? Because it caught a virus 🤧",
            "Programmer ka breakup reason: 'You deserve someone better… with more RAM' 😂",
            "Why do Java developers wear glasses? Because they don't C# 😜"
        };
        Random random = new Random();
        int index = random.nextInt(jokes.length);
        System.out.println("😂 Random Joke 😂");
        System.out.println(jokes[index]);
    }
}
