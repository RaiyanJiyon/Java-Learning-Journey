package StringBufferClass;

public class StringBufferClass {
    public static void main(String[] args) {

        //StringBuffer class is not required to create another object for changes the original string.
        StringBuffer sb = new StringBuffer("Raiyan");
        sb.append(" Jiyon");
        System.out.println(sb);
        
        sb.append("\nAge is : "+24);
        System.out.println(sb);
        
        sb.setLength(5);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0, 5);
        System.out.println(sb);

    }
    
}
