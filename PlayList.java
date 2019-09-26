import java.util.ArrayList;

public class PlayList {
    
    private int id;
    private String nome;
    private ArrayList<Filme> filmes;

    public PlayList(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.filmes = new ArrayList();
    }
        
   
    public PlayList() {
        this.filmes = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }
    
    public boolean adicionar(Filme filme){
        
        if(!this.filmes.contains(filme)){
            
            filmes.add(filme);
            System.out.println("Filme adicionado à lista com sucesso.");
            return true;
        } else {
            System.out.println("O filme já está na lista. Impossível adicioná-lo mais de uma vez.");
            return false;
        }
        
    }
    
    public ArrayList<Filme> listar() {
        
        return filmes;
    }
    
    public boolean remover(Filme filme) {
        for (Filme f2 : filmes) {
            if (f2.getTitulo().equalsIgnoreCase(filme.getTitulo())) {
                filmes.remove(f2);
                return true;
            }
        }

        return false;
            
    }
    
    public int calcularDuracao() {
        int duracaoTotal = 0;
        
        for (Filme f : filmes) {
           duracaoTotal += f.getDuracao();
        }
        
        return duracaoTotal;
    }
    
    public Filme buscar(String titulo) {

        for (Filme f3 : filmes) {
            if (f3.getTitulo().equalsIgnoreCase(titulo)) {
                return f3;
            }
        }

        return null;
              
    }
}
