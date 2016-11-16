/**
 * Created by opilane on 16.11.2016.
 */
public class C9_Characters {

    public static void main(String[] args) {
        String fruit = "banana";
        char letter = fruit.charAt(0);
        System.out.println("Roman alphabet: ");
        for(char a = 'A'; a <= 'Z'; a++) {
            System.out.print(a);
        }

        System.out.println();
        String smoothie = fruit.replace("a", "z");
        System.out.println(smoothie);

        for (char letter2 : fruit.toCharArray()) {
            System.out.print(letter2);
        }
    }
}
