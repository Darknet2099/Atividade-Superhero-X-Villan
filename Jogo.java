public class Jogo {
  public static void main(String[] args) {
    
    //insira aqui o seu super heroi:
    SuperHeroi Heroi= new SuperHeroi("Spiderman", "Peter Parker");
    Heroi.adicionaSuperpoder(new SuperPoder("Força", 5));
    Heroi.adicionaSuperpoder(new SuperPoder("Agilidade", 4));
    Heroi.adicionaSuperpoder(new SuperPoder("Lança-teias", 2));
    Heroi.adicionaSuperpoder(new SuperPoder("Sentido aranha", 4));
    Heroi.Ficha();
    //insira aqui o seu Antagonista:
    Vilao Vilao = new Vilao(10, "Magneto", "August Ferguson");
      Vilao.adicionaSuperpoder(new SuperPoder("Manipulação de metais", 9));
      Vilao.adicionaSuperpoder(new SuperPoder("Telecinese", 6));
      Vilao.adicionaSuperpoder(new SuperPoder("Controle de campos magnéticos", 8));
      Vilao.Ficha();
    
    Confronto Confronto = new Confronto();
    int ResultadoConfronto = Confronto.executar(Heroi, Vilao);
    if (ResultadoConfronto == 1) { 
      System.out.println("O Super herói se provou superior ao seu adversário.");
    } else if (ResultadoConfronto == 2) {
       System.out.println("O Super herói não foi páreo ao seu adversário, e a cidade pagou o preço por seu fracasso.");
    } else if (ResultadoConfronto == 3) {
       System.out.println("O Super herói e o Super vilão decidiram resolver suas diferenças de maneira amistosa, e tudo terminou em pizza.");
    }
  }
}