package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ent.*;
public class aplicacao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		List<Voo> voos = new ArrayList();
		Companhia comp = new Companhia("Azul");
		
		int escolhas=1; 
		
		while(escolhas != 7) {
			System.out.println("1.Cadastrar Passageiros");
			System.out.println("2. Cadastrar Voo");
			System.out.println("3. Busca Voo");
			System.out.println("4. Busca Passageiro");
			System.out.println("5. Fazer Reserva");
			System.out.println("6. Exibir todos os Voos");
			System.out.println("7. Sair");
			escolhas = ler.nextInt();
			if(escolhas ==1) {
				System.out.println("Digite os  dados pessoais:");
				System.out.println("Nome: ");
				String nome = ler.nextLine();
				System.out.println("Email: ");
				String email = ler.nextLine();
				System.out.println("Numero do passaporte: ");
				String numbPassaporte = ler.nextLine();
				
				System.out.println("rg: ");
				Integer rg = ler.nextInt();
				System.out.println("Digite o nome da sua companhia aerea e depois seu codigo de voo: ");
				String nomeComp = ler.next();
				String codigo = ler.next();
				System.out.println("Qual plano o cliente  possui ?");
				System.out.println("Digite 1. Plano Prata");
				System.out.println("Digite 2 . Plano ouro");
				int plano = ler.nextInt();
				System.out.println("Digite (s/n) se usuario fara reserva");
				String decideRv = ler.nextLine();
				Integer reservar = null;
					if(decideRv == "s") {
						System.out.println("Digite o numero do assento que voce deseja reservar");
						 reservar = ler.nextInt();
					}
					if(decideRv =="n") {
						 reservar = null;
					}
						if(plano == 1) {
							Passageiro p = new PlanoPrata(rg,nome,email,numbPassaporte,nomeComp,reservar);
						}
						if(plano == 2) {
							System.out.println("Considerando o plano do usuario ele tem direito a escolhar uma refeicao");
							String comida = ler.nextLine();
							Passageiro p = new PlanoOuro(rg,nome,email,numbPassaporte,nomeComp,reservar,comida);
						}
						else {
							System.out.println("aconteceu algo de errado. Tente novamente mais tarde ");
						}
			}
			if(escolhas==2 ) {
				
			}
				
		}
		
		
		/* Ideia
		System.out.println(""
				+ "1.Cadastrar  Passageiros"
				rg
				nome
				email
				numero do Passaporte
				qual plano?
				
				
				+ "2. Cadastrar Voo"
	     			saber nome da companhia 
					codigo voo 
					qual tipo de voo? Nacional ou interNacional?
					INICIO --> Destino
					Horario de saida e de chegada
				+ "3. Busca Voo"
					usar a interface 
					
				
				
				
				+ "4. fazer Reserva"
					ainda nsei
				+ "5. Exibir todos os Voos"
				 fazer loop para printar todos os voos 
				+ "6. Busca Passageiro"
					usar interface
					
				+ "7. Sair ");
				acaba aqui o loop
		
		*/
		

		
	}
	
	
}
