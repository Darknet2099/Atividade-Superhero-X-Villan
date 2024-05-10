   public class SuperHeroi extends Personagem {

       public SuperHeroi(String Nome, String NomeReal){
           super(Nome, NomeReal);
       }

       public int getPodertotal() {
           int soma = 0;
           for (int cont = 0; cont < this.getNumPoderes(); cont++) {
               soma += this.getpoderes()[cont].getCategoria(); 
           } 

           if (this.getNumPoderes() >= 2) {
               System.out.println("O Super Herói Confia em suas HABILIDADES!!!!");
           } 
           return (int) (soma + soma * 10 / 100); 
       }
      //Esse método seria um recurso para fazer o Embate ficar mais "Emocionante", porém não consegui implementar o mesmo.
       public int EmbateFinal() {
           return (int) (getPodertotal() + this.getNumPoderes() * 3);
       }
   }

