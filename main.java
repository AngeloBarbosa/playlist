import java.util.Scanner;
import java.util.Date;

public class main {
        
    public static void main(String[] args) throws InterruptedException {    
        
        Scanner read = new Scanner(System.in);
        Usuario u1 = new Usuario();
        
        System.out.println("Qual é seu nome?");
        u1.setNome(read.nextLine());
        
        
        System.out.println("Insira sua data de nascimento (com números): \n");
        System.out.println("Dia (1-31) :");
        u1.getDataNascimento().setDate(read.nextInt());
        
        System.out.println("\nMês (1-12) : ");
        u1.getDataNascimento().setMonth(read.nextInt() - 1);
        
        System.out.println("\nAno: ");
        u1.getDataNascimento().setYear(read.nextInt() - 1900);
        
    
        System.out.println("Criando uma nova playlist: ");
        System.out.println("\nInsira o nome da playlist: ");

        
        PlayList p1 = new PlayList(1, read.nextLine());
         
        byte answear = 0;
         
        do {
            clear();
            menu(u1);
            
            answear = read.nextByte();
           
            switch (answear) {
                case 1: //Se escolheu adicionar
                    clear();
                    Filme filme = new Filme();
                   
                    System.out.println("Insira o título do filme: ");
                    read.nextLine();
                    filme.setTitulo(read.nextLine());
                           
                    System.out.println("\nInsira a duração do filme (em minutos): ");
                    filme.setDuracao(read.nextInt());
                    
                    System.out.println("\nInsira a avaliação do filme (0 - 5): ");
                    filme.setAvaliacao(read.nextDouble());
                    
                    System.out.println("\nInsira o id do filme (int): ");
                    filme.setId(read.nextInt());
                   
                    System.out.println("\nInsira a seguir os gêneros do filme. Ao terminar, digite 'esc' ao ser pedido o gênero.");
                    String genre;

                    
                    
                    do {
                        System.out.println("Insira o gênero: ");
                        read.nextLine();
                        genre = read.nextLine();
                        
                        if (genre.equalsIgnoreCase("esc")) {break;}
                        
                        System.out.println("\nInsira o id do gênero: ");
                        int id = read.nextInt();
                        
                        filme.getGeneros().add(new Genero(id, genre));
                        System.out.println("\n\n");
                        
                    } while (!genre.equalsIgnoreCase("esc"));
                    
                    p1.adicionar(filme);                   
                    Thread.sleep(2000);
                    break;
                case 2: //Se escolheu buscar
                    System.out.println("Insira o título do filme a ser pesquisado: ");
                    read.nextLine();
                    String title = read.nextLine();
                    
                    Filme f1 = p1.buscar(title);
                    
                    if (f1 == null) {
                        System.out.println("\nFilme não encontrado.");
                    } else {
                        System.out.println("\nFilme encontrado: \n");
                        System.out.println(f1.toString());
                    }
                    
                    System.out.println("Pressione enter para voltar para o menu principal.");
                    read.nextLine();
                    
                    break;
                case 3: //Se escolheu remover
                    System.out.println("Insira o título do filme a ser removido: ");
                    read.nextLine();
                    String title2 = read.nextLine();
                    
                    Filme f2 = new Filme();
                    f2.setTitulo(title2);
                    
                    if (p1.remover(f2)) {
                        System.out.println("\nFilme removido com sucesso.");
                    } else {
                        System.out.println("\nFilme não encontrado. Tente novamente.");
                    }
                    
                    System.out.println("\nPressione enter para voltar para o menu principal.");
           
                    read.nextLine();
                    
                    break;
                    
                case 4: //Se escolheu listar
                    clear();
                    
                    System.out.println("--------------------------------------------------");
                    for (Filme f : p1.listar()) {
                        System.out.println(f.toString());
                    }
                    System.out.println("\n--------------------------------------------------");
        
                    System.out.println("Pressione enter para voltar para o menu principal.");
                    read.nextLine();
                    read.nextLine();
                    break;
                
                case 5: 
                    int duracao = p1.calcularDuracao();
                    StringBuilder sb = new StringBuilder();
                    sb.append(duracao/1440 + " dias, ");
                    sb.append(duracao%1440/60 + " horas,");
                    sb.append(duracao%1440%60 + " minutos e 0 segundos.");

                    System.out.println(sb.toString());
                    System.out.println("Pressione enter para voltar para menu principal.");

                    read.nextLine();
                    break;
                    
                case 6:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Entrada inválida.\n");
                    break;
           }
        } while (answear != 6);
    }
    
    public static void menu(Usuario usuario) {
        StringBuilder sb = new StringBuilder();
        sb.append("Escolha uma opção, " + usuario.getNome() + ": \n");
        sb.append("--------------------------------------------------" + "\n1 - Adicionar" + "\n2 - Buscar" + "\n3 - Remover" );
        sb.append("\n4 - Listar" + "\n5 - Calcular duração" + "\n6 - Sair" + "\n--------------------------------------------------");
        System.out.println(sb.toString());
    }
    
    public static void clear() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }
}   