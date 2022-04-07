public class Player {
  float posX, posY;
  String nome;
  int pontoVida;
  int critico;

  Arma arma = new Arma();

  void mover(float posX, float posY){

    posX = posX + 5;
    posY = posY + 5;
}
  public float posicaoX(float posX) {
  System.out.println ("Sua posição em X:" + posX);
  return posX;
}

  public float posicaoY(float posY) {
   System.out.println ("Sua posição em Y:" + posY);
   return posY;
} 

   public void dano(int critico){ 

     critico = pontoVida - critico; 

}
    public int pontosDeVida(){
    pontoVida = 100;

    return pontoVida;
}

  public String exibirStatus(){
  return "Nome personagem: " + nome + "/" + pontoVida + "Life"; 
    }
  
}