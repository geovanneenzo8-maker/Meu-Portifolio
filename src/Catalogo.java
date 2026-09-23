 import java.util.ArrayList;
 import java.util.List;

public class Catalogo {
    private  List<Jogo> jogos;
    private int proximoId;

    public Catalogo(){
        this.jogos = new ArrayList<>();
        this.proximoId = 1;

    }
    public void adicionarJogo(String titulo, String plataforma){
        Jogo novoJogo = new Jogo(this.proximoId, titulo, plataforma);
        this.jogos.add(novoJogo);

        System.out.println("Jogo '" + titulo + "' adicionado com sucesso! (ID : " + this.proximoId + ")");

        this.proximoId++;
    }

    public void listarJogos(){
        if(this.jogos.isEmpty()){
            System.out.println("Nenhum jogo cadastrado ainda.");
            return;
        }
        System.out.println("===Catalogo de Jogos===");
        for(Jogo j : this.jogos){
            System.out.println(j);
        }
    }
    public Jogo buscarPorId(int id){
            for(Jogo j : this.jogos){
                if(j.getId() == id){
                    return j;
                }
            }
            return null;
        }
        public boolean registrarHoras(int id, double horas){
            Jogo jogo = buscarPorId(id);

            if(jogo == null){
                return false;
            }
           return jogo.registrarHoras(horas);

        }
        public double calcularTotalHoras(){
            double total = 0.0;
            for(Jogo j : this.jogos){
                total += j.getHorasJogadas();
            }
            return total;


        }
    }
