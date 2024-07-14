public class Reversestr {
    public static void main(String[] args) { //This code reverse the stringbuilder
        StringBuilder sb = new StringBuilder("Akarsh");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            // Swap the characters
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println("Reversed String: " + sb.toString());
    }
}
