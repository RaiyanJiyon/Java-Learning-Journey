package String;

public class Part4 {
    public static void main(String[] args) {
        String s1 = "This is my country";
        System.out.println("Original String - "+s1);
        
        //replace method replace old character to given new character
        String s2 = s1.replace('i', 'h');
        System.out.println("Replace String - "+s2);
        
        //split method split the given string into whatever programmer wanted to split 
        String[] s3 = s1.split(" "); // here we split the s1 string into a space
        
        //printing the split string s3
        for (String string : s3) {
            System.out.println(string);
        }
    }
    
}
