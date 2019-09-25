
public class Teste {
    public static void main2(String[] args) {
        PlayList p1 = new PlayList(1, "Filmes do projeto");
        Filme f1 = new Filme(1, "Missão Impossível", 120, 5.0);
        Filme f2 = new Filme(2, "Era Uma Vez Em Hollywood", 132, 4.8);
    
        p1.adicionar(f1);
        p1.adicionar(f2);
        p1.listar();
  
    }
    
}
