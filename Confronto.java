public class Confronto {
    //não consegui fazer essa Subclasse rodar na main.
    public int executar(SuperHeroi superHeroi, Vilao supervilao) {
        int poderSuperHeroi = superHeroi.getPodertotal();
        int poderSupervilao = supervilao.getPodertotal();

        if (poderSuperHeroi > poderSupervilao) {
            return 1;
        } else if (poderSuperHeroi < poderSupervilao) {
            return 2; 
        } else {
            return 3; 
        }
    }
}
