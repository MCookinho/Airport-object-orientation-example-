package ent;

import java.util.Date;

public abstract class Voo {

    private int codigo;
    private String companhia;
    private String paisOrigem, paisDestino;
    private String estadoOrigem, estadoDestino;
    private String cidadeOrigem, cidadeDestino;
    private Date partidaHorario, chegadaHorario;

    public Voo(int codigo, String companhia, String paisOrigem, String paisDestino, String estadoOrigem, String estadoDestino, String cidadeOrigem, String cidadeDestino, Date partidaHorario, Date chegadaHorario) {
        this.codigo = codigo;
        this.companhia = companhia;
        this.paisOrigem = paisOrigem;
        this.paisDestino = paisDestino;
        this.estadoOrigem = estadoOrigem;
        this.estadoDestino = estadoDestino;
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.partidaHorario = partidaHorario;
        this.chegadaHorario = chegadaHorario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public String getEstadoOrigem() {
        return estadoOrigem;
    }

    public void setEstadoOrigem(String estadoOrigem) {
        this.estadoOrigem = estadoOrigem;
    }

    public String getEstadoDestino() {
        return estadoDestino;
    }

    public void setEstadoDestino(String estadoDestino) {
        this.estadoDestino = estadoDestino;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public Date getPartidaHorario() {
        return partidaHorario;
    }

    public void setPartidaHorario(Date partidaHorario) {
        this.partidaHorario = partidaHorario;
    }

    public Date getChegadaHorario() {
        return chegadaHorario;
    }

    public void setChegadaHorario(Date chegadaHorario) {
        this.chegadaHorario = chegadaHorario;
    }

    @Override
    public String toString() {
        return "Voo{" + "codigo=" + codigo + ", companhia=" + companhia + ", paisOrigem=" + paisOrigem + ", paisDestino=" + paisDestino + ", estadoOrigem=" + estadoOrigem + ", estadoDestino=" + estadoDestino + ", cidadeOrigem=" + cidadeOrigem + ", cidadeDestino=" + cidadeDestino + ", partidaHorario=" + partidaHorario + ", chegadaHorario=" + chegadaHorario + '}';
    }

}
