public class WrapperClass {
    public static void main(String[] args) {
        int x = 10;
        // System.out.println(x.getClass().getSimpleName());

        // Autoboxing -> convert primitive datatype to object
        Integer y = Integer.valueOf(x);
        System.out.println("Value of Y - " + y);
        // System.out.println("Type of Y - "+Type(y));

        // another way of Autoboxing

        Integer z = x;
        System.out.println("Value of Z - " + z);

        // Unboxing -> convert Object to premitive datatype

        Double d = new Double(10.22);
        double d2 = d.doubleValue();
        System.out.println("Value of D - " + d2);

        // another way of Unboxing

        double d3 = d;
        System.out.println("Value of d - " + d3);
    }

}
