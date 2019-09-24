import java.util.ArrayList;

public class Filme {

    private int id;
    private String titulo;
    private int duracao;
    private double avaliacao;
    private ArrayList<Genero> generos = new ArrayList();

    public Filme(int id, String titulo, int duracao, double avaliacao) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
        this.avaliacao = avaliacao;
        this.generos = generos;
        
    }

    public Filme() {
        
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    public ArrayList<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(ArrayList<Genero> generos) {
        this.generos = generos;
    }
    
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Filme) {
            Filme e = (Filme) obj;
            
            return this.getTitulo().equalsIgnoreCase(e.getTitulo());
            
        } else { return false;}
            
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + " - " + avaliacao + " - " + duracao + "min - " + generos.get(1).getNome());
     
        return sb.toString();
    }
    
}
