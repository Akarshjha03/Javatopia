public class Append {
    public static void main(String[] args) { //This file uses append() function on string builder
        StringBuilder sn = new StringBuilder("A");
        System.out.println(sn);
        sn.append("k");
        sn.append("a");
        sn.append("r");
        sn.append("s");
        sn.append("h");
        System.out.println(sn);
    }
}
