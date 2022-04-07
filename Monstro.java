public class Monstro {
  String nome;
  int forca;
  int pontosDeVida;

  int causarDano(){
    int dano = forca * 3;
    return dano;
  }
  String grunhir(){
    return "UOOOWWWWWWWWWWW!!!";
    }
  void receberDano(int dano) {
    pontosDeVida = pontosDeVida - dano;
    if(pontosDeVida <= 0)
      morrer();
    }

void morrer(){
    System.out.println("O monstro foi morto...");
  }
}