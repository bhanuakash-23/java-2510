package fourth_operators;

public class Demo {
    public static void main(String[] args) {
        //ARITHMETIC OPERATORS
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        System.out.println("Sum: "+sum);

        int diff = num1 - num2;
        System.out.println("Difference: "+diff);
        System.out.println("Product: "+(num1*num2));
        System.out.println("division: "+(num1/num2));
        System.out.println("Modulus: "+(num1%num2));

        //INCREMENT AND DECREMENT OPERATORS
        int a = 10;
        System.out.println("a: "+a);
        System.out.println("++a: "+(++a));
        System.out.println("a++: "+(a++));
        System.out.println("a: "+a);

        //DECREMENT
        System.out.println("a: "+a);
        System.out.println("--a: "+(--a));
        System.out.println("a--: "+(a--));
        System.out.println("a: "+a);

        //COMPOUND ASSIGNMENT OPERATORS
        int num = 10;
        num += 5; 
        System.out.println("Number is: "+num);
        
        num *= 5;
        System.out.println("Number is: "+num);

        //RELATIONAL OPERATORS
        int x = 10;
        int y = 5;
        System.out.println("X IS GREATER THAN Y: "+(x>y));
        System.out.println("X IS LESS THAN Y: "+(x<y));
        System.out.println("X IS EQUAL TO Y: "+(x==y));

        //LOGICAL OPERATORS
        
    }

}
