public class SuperPoder{
  private String NomePoder;
  private int Categoria;

  public SuperPoder(String NomePoder, int Categoria) {
    this.NomePoder = NomePoder;
    this.Categoria = Categoria; }

  public String getNomePoder() {
    return this.NomePoder; }

  public void setNomePoder(String NomePoder){
   this.NomePoder = NomePoder; 
  }

  public int getCategoria() {
    return this.Categoria; }

  public void setCategoria(int Categoria) {
    this.Categoria = Categoria;
  }
}