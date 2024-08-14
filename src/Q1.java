interface MathOperation{
    double calculate(double a , double b);
}


public class Q1 {
    public static void main(String[]args){
        MathOperation modulus=(double a , double b) ->a%b;
        System.out.println("Modulus :"+ modulus.calculate(10,3));

        MathOperation power= Math::pow ;
        System.out.println("Power:"+ power.calculate(2,3));
    }
}
