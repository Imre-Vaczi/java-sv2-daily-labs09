package day03;

import java.util.Locale;

public class Caesar extends Encryption{

    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        StringBuilder sb = new StringBuilder();
        for (Character character : input.toUpperCase(Locale.ROOT).toCharArray()) {
            if (((int) character) + offset > 90) {
                sb.append(Character.toChars(((int) character) + offset - 25));
            } else {
                sb.append(Character.toChars(((int) character) + offset));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println((int) 'A');
        System.out.println((int) 'B');
        System.out.println((int) 'C');
        System.out.println((int) 'X');
        System.out.println((int) 'Y');
        System.out.println((int) 'Z');
        System.out.println(Character.toChars(65));
        System.out.println(Character.toChars(66));
        System.out.println(Character.toChars(67));
        System.out.println(Character.toChars(((int) 'A') + 23));
        System.out.println(Character.toChars(((int) 'B') + 23));
        System.out.println(Character.toChars(((int) 'C') + 23));
    }
}
