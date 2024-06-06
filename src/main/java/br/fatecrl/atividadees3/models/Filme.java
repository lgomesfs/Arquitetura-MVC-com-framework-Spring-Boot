package br.fatecrl.atividadees3.models;

public class Filme {
    private String nome;
    private String diretor;
    private int duracao;
    private int lancamento;

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Filme(String nome, String diretor, int duracao, int lancamento) {
        this.nome = nome;
        this.diretor = diretor;
        this.duracao = duracao;
        this.lancamento = lancamento;
    }

    public Filme() {
    }
}
