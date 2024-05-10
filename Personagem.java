public class Personagem {
  private String Nome;
  private String NomeReal;
  private SuperPoder[] poderes;
  private int numPoderes;
  private int Ameaça;
//preciso limitar o vetor a 4 espaços 
  public Personagem(String Nome, String NomeReal) {
  this.Nome = Nome;
  this.NomeReal = NomeReal;
  this.poderes = new SuperPoder[4];
  this.numPoderes = 0; }

public void adicionaSuperpoder(SuperPoder poder) {
if(numPoderes < 4 ) {
this.poderes[numPoderes] = poder;
  numPoderes++;
} else {
System.out.print("Limite de poderes atingido");
   }
}
  
public int getPodertotal() {
  int soma = 0;
  for (int cont = 0; cont < numPoderes ; cont++) {
    soma += poderes[cont].getCategoria();
  }
  return soma; }

  public int getNumPoderes(){
  return numPoderes; }

  public SuperPoder[] getpoderes() {
  return poderes; }

public void Ficha() {
    System.out.println("\nCodinome: " + this.Nome + "\nIdentidade secreta: " + this.NomeReal);

    // Exibe a soma das categorias dos superpoderes
    int somaCategorias = getPodertotal();
    System.out.println("Soma das categorias dos superpoderes: " + somaCategorias);

    // Verifica se o personagem é um Campeão Formidável
    if (somaCategorias >= 10) {
        System.out.println("Campeão Formidável detectado");
    }

    // Exibe a quantidade de habilidades do personagem
    System.out.println("Quantidade de habilidades: " + getNumPoderes());
 }
}
