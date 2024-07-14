public class delete {
        public static void main(String[] args) { //This file uses insert() function on string builder
            StringBuilder sb = new StringBuilder("Hello");
            System.out.println(sb);
            sb.delete(5,'o');
            //for substring: sb.delete(start,end-explicit)
            System.out.println(sb);
        }
    }
