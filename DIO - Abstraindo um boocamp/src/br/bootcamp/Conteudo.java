package br.bootcamp;

public class Conteudo {

    private String nome;
    private String descricao;
    private double xp;
    private double cargaHoraria;

    public Conteudo(String nome, String descricao, double xp, double cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.xp = xp;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}
