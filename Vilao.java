public class Vilao extends Personagem {
    private int AnosLockdown;

    public Vilao(int AnosLockdown, String Nome, String NomeReal) {
        super(Nome, NomeReal);
        this.AnosLockdown = AnosLockdown;}

      public int getPodertotal() {
        int soma = 0;
        for (int cont = 0; cont < this.getNumPoderes() ; cont++) {
          soma += this.getpoderes()[cont].getCategoria(); }
        if (this.AnosLockdown >= 5 && this.AnosLockdown <= 10){
          System.out.println("O Vilão esteve em TREINAMENTO!!!! ");
        } return (int) (soma + AnosLockdown); }
}
