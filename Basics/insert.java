public class insert {
    public static void main(String[] args) { //This file uses insert() function on string builder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.insert(5,'o');
        System.out.println(sb);
    }
}

