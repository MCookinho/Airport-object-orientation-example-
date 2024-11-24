package ent;

import java.util.Date;

public class Executivo extends Voo {

    private float preco;
    private String cardapio;

    public Executivo(int codigo, String companhia, String paisOrigem, String paisDestino, String estadoOrigem, String estadoDestino, String cidadeOrigem, String cidadeDestino, Date partidaHorario, Date chegadaHorario, float preco, String cardapio) {
        super(codigo, companhia, paisOrigem, paisDestino, estadoOrigem, estadoDestino, cidadeOrigem, cidadeDestino, partidaHorario, chegadaHorario);
        this.preco = preco;
        this.cardapio = cardapio;
    }

    public float getPrecoBase() {
        return preco;
    }

    public void setPrecoBase(float preco) {
        this.preco = preco;
    }

    public String getCardapio() {
        return cardapio;
    }

    public void setCardapio(String cardapio) {
        this.cardapio = cardapio;
    }
}
