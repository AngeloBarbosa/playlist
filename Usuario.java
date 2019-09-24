import java.util.Date;

public class Usuario {

    private int id;
    private String nome;
    private Date dataNascimento = new Date();
    
    public Usuario(int id, String nome, Date dataNascimento) {
       this.id = id;
       this.nome = nome;
       this.dataNascimento = dataNascimento;
       
    }
    
    public Usuario() {
        
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

    public void setNome(String nome2) {
        nome = nome2;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento2) {
        dataNascimento = dataNascimento2;
    }
    
    
}
