class StaticMethod {
    static int id;
    static String name;

    //creating single static block
    static{
        id = 221902113;
        name = "MD. Raiyan Ur Rahman Jiyon";
    }

    static void display() {
        System.out.println("ID - "+id);
        System.out.println("Name - "+name);
    }
}
public class test {
    public static void main(String[] args) {
        StaticMethod.display();        
    }
}
