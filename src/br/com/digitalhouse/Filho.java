package br.com.digitalhouse;

public class Filho {
    // Atributos
    private String mae;
    private String pai;
    private String nome;

    // Construtor Especifico
    public Filho(String nomeMae, String nomePai, String nomeFilho) {
        mae = nomeMae;
        pai = nomePai;
        nome = nomeFilho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }


}
