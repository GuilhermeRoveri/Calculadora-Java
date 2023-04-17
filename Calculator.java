public class Calculator{
    /* O programa funciona como uma calculadora que tem como função fazer contas de adição,divisão,
    multiplicação e a conta de módulo, que exibe a sobra de uma divisão quebrada. Ex: 24/5
     */
    //Construtor
    public Calculator(){}
    //Método 1
     public int add(int numero1, int numero2){
       
        int sum = numero1 + numero2;
        
        return sum;
    }

    public int subtract(int numero1, int numero2){

        int less = numero1 - numero2;

        return less;

    }
    public int multiply(int numero1, int numero2){
        
        int multiply = numero1 * numero2;

        return multiply;
    }
    public double divide(int numero1, int numero2){

        double division = numero1 / numero2;

        return division;
    }
    public int modulo(int numero1, int numero2){
       
        int modulo = numero1 % numero2;

        return modulo;
    }

    public static void main(String [] args){
        //Objeto
        Calculator myCalculator = new Calculator();
        System.out.println("A soma dos valores é " +myCalculator.add(5,7));
        System.out.println("A subtração dos valores é " +myCalculator.subtract(45,11));
        System.out.println("A multiplicação dos valores é " +myCalculator.multiply(14,20));
        System.out.println("A divisão dos valores é " +myCalculator.divide(54,2));
        System.out.println("O módulo entre os valores é " +myCalculator.modulo(98,17));

    }
}