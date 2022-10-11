public class Aula1{
    public static void main (String[]args){
        
        System.out.println("Alunos de ADS: ");
        System.out.println("");

    Aluno aluno01 = new Aluno();

        aluno01.nome = "Rafael";
        aluno01.idade = 20;
        aluno01.semestre = 2;

            aluno01.informacoesAluno();

    System.out.println("---------------------");

    Aluno aluno02 = new Aluno();

        aluno02.nome = "Eduardo";
        aluno02.idade = 25;
        aluno02.semestre = 3;

            aluno02.informacoesAluno();

System.out.println("----------------------");

//outra class interagindo
    Garrafa pet = new Garrafa();
        
        pet.volume();

        pet.encher("agua", 500);

        pet.volume();

        pet.tomar(100);

        pet.volume();
    }
}


 // SEGUNDO mandei isso pra class, mas como lá já existe a variavel, só coloca as variaveis
        // System.out.println("O nome do aluno é: " + aluno01.nome);
        // System.out.println("Idade é: "+ aluno01.idade);
        // System.out.println("Semestre é: "+ aluno01.semestre);

//CLASSES 
//int i;
//String exemplo (é uma classe gigante com coisas dentros) 
//