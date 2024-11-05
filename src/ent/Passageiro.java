package entidades;

public abstract class Passageiro {
		private Integer rg;
		private String nome;
		private String email;
		private String passaporte;
		private String companhia;
		
		public Passageiro(Integer rg, String nome, String email, String passaporte, String companhia) {
			this.rg = rg;
			this.nome = nome;
			this.email = email;
			this.passaporte = passaporte;
			this.companhia = companhia;
		}

		public Integer getRg() {
			return rg;
		}

		public void setRg(Integer rg) {
			this.rg = rg;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassaporte() {
			return passaporte;
		}

		public void setPassaporte(String companhia) {
			this.companhia = companhia;
		}
		
		public String getCompanhia() {
			return companhia;
		}

		public void setCompanhia(String passaporte) {
			this.passaporte = passaporte;
		}

		
		public String toString() {
			return "Rg=" + rg + ", Nome=" + nome + ", Email=" + email + ", Passaporte=" + passaporte;
		}
			
		
}
