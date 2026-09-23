public class Jogo {
   private String titulo;
    private String plataforma;
    private int id;
    private double horas;

    public Jogo(int id, String titulo, String plataforma){
        this.id = id;
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.horas = 0.0; //Vai sempre iniciar 0 por padrão definido.
    }



    public int getId() {
        return this.id;
    }



    public String getPlataforma() {
        return this.plataforma;
    }



    public String getTitulo() {
        return this.titulo;
    }


    public double getHorasJogadas() {
        return this.horas;
    }

    public boolean registrarHoras(double horas){
        if(horas <= 0){
            return false;
        }
        this.horas += horas;

        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String toString(String titulo, String plataforma, int id) {
        return "ID: " + this.id + "/ Jogo: " + this.titulo + "/ Plataforma: " + this.plataforma + "/ Horas: " + this.horas +"h"  ;

    }
}
