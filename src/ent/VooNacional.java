package ent;

import java.time.LocalDate;

public class VooNacional extends Voo{
	
	private String estadoFinal, estadoInicial;
	
	public VooNacional(String codigoVoo, String origem, String destino, LocalDate horarioChegada,LocalDate horarioPartida, double preco, String estadoFinal, String estadoInicial) {
		super(codigoVoo, origem, destino, horarioChegada, horarioPartida, preco);
		this.estadoFinal = estadoFinal;
		this.estadoInicial = estadoInicial;
	}
	
	
	

	@Override
	public String mostraVoo() {
		
		StringBuilder sb = new StringBuilder() ;
		sb.append("Codigo de voo: "+ getCodigoVoo());
		sb.append("Origem: "+getOrigem() +" -"+getEstadoInicial() + "-->"+ "Destino: "+getDestino()+ " -"+getEstadoFinal());
		sb.append("Horario de embarque: "+getHorarioPartida() + "Horario de Chegada: "+getHorarioChegada());
		
		
		
		return sb.toString();
	}




	public String getEstadoFinal() {
		return estadoFinal;
	}




	public void setEstadoFinal(String estadoFinal) {
		this.estadoFinal = estadoFinal;
	}




	public String getEstadoInicial() {
		return estadoInicial;
	}




	public void setEstadoInicial(String estadoInicial) {
		this.estadoInicial = estadoInicial;
	}

	
	
	
	
}
