package ent;

import java.util.Date;

public class Convencional extends Voo {

    private float preco;

    public Convencional(int codigo, String companhia, String paisOrigem, String paisDestino, String estadoOrigem, String estadoDestino, String cidadeOrigem, String cidadeDestino, Date partidaHorario, Date chegadaHorario, float precoBase) {
        super(codigo, companhia, paisOrigem, paisDestino, estadoOrigem, estadoDestino, cidadeOrigem, cidadeDestino, partidaHorario, chegadaHorario);
        this.preco = precoBase;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
