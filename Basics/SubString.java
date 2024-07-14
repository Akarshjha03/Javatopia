public class SubString {
    String sentence = "My name is AKARSH JHA";
    String name;

    public SubString() {
        name = sentence.substring(11, 17);
    }

    public void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        SubString subString = new SubString();
        subString.printName();
    }
}
