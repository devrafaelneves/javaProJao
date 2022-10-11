public class Formula {

    int a;
    int b;
    int c;
    double delta;
    double x1;
    double x2;

    public void CalcularDelta(){
        //delta = b**2 = -4*a*c
        this.delta = (this.b * this.b) - (4 * this.a * this.c);
    }
    public void CalcularX1(){
        this.x1 = ((-1 * this.b) + Math.sqrt(this.delta)) / (2 * this.a);
    }
    public void Calcularx2(){
        this.x2 = ((-1 * this.b) - Math.sqrt(this.delta)) / (2 * this.a);
    }
}



// Bhaskara formula = new Bhaskara();

//     formula.a = 1;
//     formula.b = 3;
//     formula.c = 2;
    
//     formula.CalcularDelta();
//     formula.CalcularX1();
//     formula.Calcularx2();

//     System.out.println("O valor de delta é " + formula.CalcularDelta);
//     System.out.println("O valor de delta é " + formula.CalcularX1);
//     System.out.println("O valor de delta é " + formula.CalcularX2);