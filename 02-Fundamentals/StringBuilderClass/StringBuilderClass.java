package StringBuilderClass;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Raiyan");
        sb.append(" Jiyon");
        System.err.println(sb);

        sb.reverse();
        
        sb.append("\nAge is - " + 24);
        System.out.println(sb);

        sb.delete(0, 5);
        System.out.println(sb);
    }

}
