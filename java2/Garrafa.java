public class Garrafa {
    String cor;
    String conteudo;
    int volume;
    String material;

    public void encher (String conteudo, int volume){

        this.conteudo = conteudo;
        this.volume = volume;

    }

    public void tomar (int volume){

        this.volume = this.volume - volume;
    }

    public void volume (){

        //to tentando usar o if pra nao aparecer nulo no terminal
        // if this.conteudo = null{
        //     System.out.println(" nada ")
        // }

        System.out.println("Tem " + this.volume + " ml de "+ this.conteudo + " na garrafa");
    }

}

//this. <- faz referencia à classe especifica pra nao repetir a variavel criada  acima