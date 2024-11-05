package entidades;

public class PlanoOuro extends Passageiro {
		private Integer reserva;
		private String cardapio;
		
		public PlanoOuro(Integer rg, String nome, String email, String passaporte, String companhia, Integer reserva, String cardapio) {
			super(rg, nome, email, passaporte, companhia);
			this.reserva = reserva;
			this.cardapio = cardapio;
		}
		
		public Integer getReserva() {
			return reserva;
		}

		public void Reservar(Integer reserva) {
			this.reserva = reserva;
		}

		public String getCardapio() {
			return cardapio;
		}

		public void Cardapio(String cardapio) {
			this.cardapio = cardapio;
		}
		
		
		




	}
