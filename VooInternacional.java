package ent;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class VooInternacional extends Voo {
	private String PaisInicial, PaisFinal;
	
	
	public VooInternacional(String codigoVoo, String origem, String destino, LocalDate horarioChegada,
			LocalDate horarioPartida,  String PaisInicial, String PaisFinal) {
		super(codigoVoo, origem, destino, horarioChegada, horarioPartida);
		this.PaisFinal= PaisFinal;
		this.PaisInicial= PaisInicial;
	}

	public String getPaisInicial() {
		return PaisInicial;
	}

	public void setPaisInicial(String paisInicial) {
		PaisInicial = paisInicial;
	}

	public String getPaisFinal() {
		return PaisFinal;
	}

	public void setPaisFinal(String paisFinal) {
		PaisFinal = paisFinal;
	}

	@Override
public String mostraVoo() {
		
		StringBuilder sb = new StringBuilder() ;
		sb.append("Codigo de voo: "+ getCodigoVoo());
		sb.append("Origem: "+getOrigem() +" -"+getPaisInicial() + "-->"+ "Destino: "+getDestino()+ " -"+getPaisFinal());
		sb.append("Horario de embarque: "+getHorarioPartida() + "Horario de Chegada: "+getHorarioChegada());
		
		
		
		return sb.toString();
	}

	
	/*
	public void buscaVoo(String codigo, List<Voo> voos) {
		
		for(Voo v : voos) {
			
			if(super.getCodigoVoo() == codigo) {
				System.out.println();
			}
		}
	}
	*/
	@Override
	public void buscaVoo() {
		// TODO Auto-generated method stub
		
	}
	
}
