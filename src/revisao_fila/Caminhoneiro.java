package revisao_fila;

public class Caminhoneiro {
    private String nome;
    private String placa;
    private String horarioChegada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada = horarioChegada;
    }
    
    @Override
    public String toString(){
        return getNome();
    }
}
