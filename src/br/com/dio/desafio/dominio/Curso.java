package br.com.dio.desafio.dominio;

public class Curso {
   private String titulo;
   private String descricaoo;
   private int cargaHoraria;

    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricaoo() {
        return descricaoo;
    }

    public void setDescricaoo(String descricaoo) {
        this.descricaoo = descricaoo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricaoo='" + descricaoo + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
