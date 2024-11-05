package entidades;

public class PlanoPrata extends Passageiro {
		private Integer reserva;

		public PlanoPrata(Integer rg, String nome, String email, String passaporte, String companhia, Integer reserva) {
			super(rg, nome, email, passaporte, companhia);
			this.reserva = reserva;
		}

		public Integer getReserva() {
			return reserva;
		}

		public void Reservar(Integer reserva) {
			this.reserva = reserva;
		}
		
}
