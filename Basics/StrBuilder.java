public class StrBuilder {
    public static void main(String[] args) { //This file uses string builder & uses setCharAt() function
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.setCharAt(0, 'M');
        System.out.println(sb);
    }
}
