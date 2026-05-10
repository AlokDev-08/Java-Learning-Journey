public class Methods {
    public static void main(String[] args) {

        String name = " Kaizen ";
        System.out.println(name);

        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(1);
        System.out.println(letter);

        int index = name.indexOf("a");
        System.out.println(index);

        int lastIndex = name.lastIndexOf(" e");
        System.out.println(lastIndex);

        name = name.toLowerCase();
        System.out.println(name);

        name = name.toUpperCase();
        System.out.println(name);

        name = name.trim();
        System.out.println(name);

        name = name.replace("i", "e");
        System.out.println(name);

        System.out.println(name.isBlank());

        System.out.println(name.contains("z"));

        System.out.println(name.equals("kaizen"));

    }
}
