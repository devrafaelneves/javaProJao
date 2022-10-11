public class Bhaskara { 
    public static void main (String[]args){

Formula formula = new Formula();

    formula.a = 1;
    formula.b = 3;
    formula.c = 2;
    
    formula.CalcularDelta();
    formula.CalcularX1();
    formula.Calcularx2();

    System.out.println("O valor de delta é " + formula.delta);
    System.out.println("O valor de delta é " + formula.x1);
    System.out.println("O valor de delta é " + formula.x2);
}
}

