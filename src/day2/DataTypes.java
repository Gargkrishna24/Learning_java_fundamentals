package day2;

public class DataTypes {
    public static void main(String[] args) {
        // Integrals Number -> byte , short , int , long;
        byte age1 = -20 ;
        short age32 = 20;
        int age = 20;
        long age3 = 20 ;
        //System.out.println(Integer.MIN_VALUE);
        //System.out.println(Integer.MAX_VALUE);
        // Decimal number-> float , double
        float mySalary = 1000.112121212121212f;
        double yourSalary = 1000.112121212121212;
        // Character -> char;
        char myCharacter = 'a';
        System.out.println((int) myCharacter);
        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);
        char hindiNumber = 2345;
        System.out.println(hindiNumber);
        char heart = '\u2756';  // unicode representation
        // Boolean -> boolean
        boolean isEligible = false; // false is reserved keyword;
        System.out.println(isEligible);


        // Wedening conversion / implicit conversion / automatic conversion -> is conversion one datatype into another automatically
        // narrowing conversion / explicit conversion -> in this conversion always some data is loss by  converting float into int.

        System.out.println(Integer.toBinaryString(-1));
        byte a = 1 ;
        a+=1; // compound assigment operator
    }
}
