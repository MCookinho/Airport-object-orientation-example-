package ent;



public class Passagem {

    Pessoa passageiro;
    Convencional vooConvencional;
    Executivo vooExecutivo;
    Integer assento;
  
    public Passagem(Pessoa passageiro, Convencional vooConvecional, Executivo vooExecutivo, Integer assento) {
		super();
		this.passageiro = passageiro;
		this.vooConvencional = vooConvecional;
		this.vooExecutivo = vooExecutivo;
		this.assento = assento;
	}
	
	public String getCpfPassageiro() {
		return passageiro.getCpf();
	}
	
	public int getCodigoConv() {
		return vooConvencional.getCodigo();
	}
	
	public int getCodigoExe() {
		return vooExecutivo.getCodigo();
	}

    public Integer getAssento() {
        return assento;
    }

    public void setAssento(Integer assento) {
        this.assento = assento;
    }

    public String toStringConv() {
        return "*** PASSAGEM ***\n\n" + "Passageiro = " + passageiro.getNome() + "\nDecolagem: " + vooConvencional.getCidadeOrigem() + ", " + vooConvencional.getEstadoOrigem() + ", " + vooConvencional.getPaisOrigem() + "\nDesembarque: " + vooConvencional.getCidadeDestino() + ", " + vooConvencional.getEstadoDestino() + ", " + vooConvencional.getPaisDestino() + "\nAssento: " + assento + '\n';
    }
    
    public String toStringExe() {
        return "*** PASSAGEM ***\n\n" + "Passageiro = " + passageiro.getNome() + "\nDecolagem: " + vooExecutivo.getCidadeOrigem() + ", " + vooExecutivo.getEstadoOrigem() + ", " + vooExecutivo.getPaisOrigem() + "\nDesembarque: " + vooExecutivo.getCidadeDestino() + ", " + vooExecutivo.getEstadoDestino() + ", " + vooExecutivo.getPaisDestino() + "\nAssento: " + assento + '\n';
    }
}
