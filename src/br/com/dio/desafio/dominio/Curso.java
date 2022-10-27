package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
   private int cargaHoraria;

   public Curso(){}

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "curso='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
    @Override
    public double calculaXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
