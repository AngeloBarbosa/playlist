import java.util.ArrayList;

public class Filme {

    private int id;
    private String titulo;
    private int duracao;
    private double avaliacao;
    private ArrayList<Genero> generos;

    public Filme(int id, String titulo, int duracao, double avaliacao) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
        this.avaliacao = avaliacao;
        this.generos = new ArrayList();
        
    }

    public Filme() {
        this.generos = new ArrayList();
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
            
            return this.getId() == e.getId();
            
        } else { return false;}
            
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.getTitulo() + " - ");
        for (int i = 0; i < this.getAvaliacao(); i++) {
            sb.append("☆");
        }
        sb.append(" - " + this.getDuracao() + "min - " + this.generos.get(0).getNome() + " - id: " + this.getId());
     
        return sb.toString();
    }
    
}
