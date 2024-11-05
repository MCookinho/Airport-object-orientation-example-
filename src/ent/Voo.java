package ent;

import java.time.LocalDate;

public abstract class Voo {

	private String codigoVoo;
	private String origem, destino;
	private LocalDate horarioChegada, horarioPartida;
	private double preco;
	
	public Voo(String codigoVoo, String origem, String destino, LocalDate horarioChegada, LocalDate horarioPartida,	double preco) {
		super();
		this.codigoVoo = codigoVoo;
		this.origem = origem;
		this.destino = destino;
		this.horarioChegada = horarioChegada;
		this.horarioPartida = horarioPartida;
		this.preco = preco;
	}

	
	
	
	
	public String getCodigoVoo() {
		return codigoVoo;
	}

	public void setCodigoVoo(String codigoVoo) {
		this.codigoVoo = codigoVoo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getHorarioChegada() {
		return horarioChegada;
	}

	public void setHorarioChegada(LocalDate horarioChegada) {
		this.horarioChegada = horarioChegada;
	}

	public LocalDate getHorarioPartida() {
		return horarioPartida;
	}

	public void setHorarioPartida(LocalDate horarioPartida) {
		this.horarioPartida = horarioPartida;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public abstract String mostraVoo();
	
	
	
}
