package ent;



public class Passagem {

    Pessoa passageiro;
    Convencional vooConvencional;
    Executivo vooExecutivo;
    Integer assento;
  
    public Passagem(Pessoa passageiro, Convencional vooConvecional, Integer assento) {
		super();
		this.passageiro = passageiro;
		this.vooConvencional = vooConvecional;
		this.assento = assento;
	}
    
	public Passagem(Pessoa passageiro, Executivo vooExecutivo, Integer assento) {
		super();
		this.passageiro = passageiro;
		this.vooExecutivo = vooExecutivo;
		this.assento = assento;
	}
	
	public String getCpf() {
		return passageiro.getCpf();
	}

    public Integer getAssento() {
        return assento;
    }

    public void setAssento(Integer assento) {
        this.assento = assento;
    }

    @Override
    public String toString() {
        return "*** PASSAGEM ***\n\n" + "Passageiro = " + passageiro.getNome() + "\nDecolagem: " + vooConvencional.getCidadeOrigem() + ", " + vooConvencional.getEstadoOrigem() + ", " + vooConvencional.getPaisOrigem() + "\nDesembarque: " + vooConvencional.getCidadeDestino() + ", " + vooConvencional.getEstadoDestino() + ", " + vooConvencional.getPaisDestino() + "\nAssento: " + assento + '\n';
    }
}
