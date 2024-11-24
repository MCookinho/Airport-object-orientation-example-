package programa;
import ent.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class codigo {
    static public void main( String args[] ) throws ParseException {
        int esc=0, codigo, senha, escvoo, escadm;
        Date partidaHorario, chegadaHorario, limpadata;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        limpadata = formato.parse("2000-11-11 10:10:10");
        Pessoa pesstemp = new Pessoa(" ", " "," ");
        Integer assento;
        String cpf, nome, email, companhia, paisOrigem, paisDestino, estadoOrigem, estadoDestino, cidadeOrigem, cidadeDestino, cardapio, chegadaStr, partidaStr;
        float preco;
        Repositorio save = new Repositorio();
        Scanner scan = new Scanner(System.in);
        ArrayList<Pessoa> passageiro = new ArrayList<Pessoa>();
        ArrayList<Executivo> executivos = new ArrayList<Executivo>();
        ArrayList<Convencional> convencionais = new ArrayList<Convencional>();
        ArrayList<Passagem> passagens = new ArrayList<Passagem>();
        passageiro = save.lerArquivoPess();
        executivos = save.lerArquivoExe();
        convencionais = save.lerArquivoConv();
        passagens = save.lerArquivoPsg();
        while(esc!=6) {
        	save.escreverArquivoPess(passageiro);
        	save.escreverArquivoConv(convencionais);
        	save.escreverArquivoExe(executivos);
        	save.escreverArquivoPsg(passagens);
            Convencional convtemp = new Convencional(0, " ", " ", " ", " ", " ", " ", " ", limpadata, limpadata, 0);
            Executivo exetemp = new Executivo(0, " ", " ", " ", " ", " ", " ", " ", limpadata, limpadata, 0, " ");
            Passagem passtemp = new Passagem(pesstemp, convtemp, exetemp, 3);
            System.out.println( "------OLA BEM VINDO AO PORTAL VIAGENS------" );
            System.out.println( "1- Cadastrar passageiro" );
            System.out.println( "2- Comprar passagem" );
            System.out.println("3- Ver os Voos");
            System.out.println( "4- Buscar passagens" );
            System.out.println( "5- ADM" );
            System.out.println( "6- Sair" );
            System.out.print( "Escolha: " );
            esc = scan.nextInt();
            System.out.println( "\n\n\n\n\n" );
            if(esc==1) {
            	int bool=1;
                System.out.print( "DIGITE O NOME: " );
                scan.nextLine();
                nome = scan.nextLine();
                System.out.print( "DIGITE O CPF: " );
                cpf = scan.next();
                for(int i=0;i<passageiro.size();i++) {
                	if(passageiro.get(i).getCpf().equals(cpf)) {
                		bool=0;
                	}
                }
                if(bool == 1) {
	                System.out.print( "DIGITE O EMAIL: " );
	                email = scan.next();
	                for(int i=0;i<passageiro.size();i++) {
	                	if(passageiro.get(i).getEmail().equals(email)) {
	                		bool=0;
	                	}
	                }
	                if(bool == 1) {
	                pesstemp = new Pessoa(cpf, nome, email);
	                passageiro.add(pesstemp);
	                System.out.print( "PASSAGEIRO CADASTRADO!!" );}
	                else {
	                	System.out.print( "--ESSE EMAIL PERTENCE A UMA PESSOA JA CADASTRADA--" );
	                }
                
                }
                else {
                	System.out.print( "--ESSE CPF PERTENCE A UMA PESSOA JA CADASTRADA--" );
                }
            }

            if(esc==2) {
                System.out.print("------VOOS------\n\n");
                System.out.print("Convencionais:\n");
                for(int i = 0; i < convencionais.size(); i++) {
                    System.out.println(convencionais.get(i).getCodigo() + ": " +convencionais.get(i).getCidadeOrigem() + " X " + convencionais.get(i).getCidadeDestino() + "  -  "+ convencionais.get(i).getPartidaHorario() + " = R$" + convencionais.get(i).getPreco());
                }
                System.out.print("\nExecutivos:\n");
                for(int i = 0; i < executivos.size(); i++) {
                    System.out.println(executivos.get(i).getCodigo() + ": " +executivos.get(i).getCidadeOrigem() + " X " + executivos.get(i).getCidadeDestino() + "  -  " + executivos.get(i).getPartidaHorario()+ " = R$" + executivos.get(i).getPrecoBase() + "  -  CARDAPIO: " + executivos.get(i).getCardapio());
                }

                int bool = 0;
                System.out.print("\n\nDIGITE SEU CPF: ");
                cpf = scan.next();
                for(int i = 0; i<passageiro.size(); i++) {
                    if(passageiro.get(i).getCpf().equals(cpf)) {
                        pesstemp = passageiro.get(i);
                        bool=1;
                        break;
                    }
                }
                if(bool ==1) {
                    bool=0;
                    System.out.print("\nDIGITE SE O VOO EH EXECUTIVO(1) OU CONVENCIONAL(2): ");
                    escvoo = scan.nextInt();
                    if(escvoo < 1 || escvoo >2) {
                        System.out.print("-ESCOLHA INVALIDA-");
                    }
                    else {
                        System.out.print("\nDIGITE O CODIGO DO VOO: ");
                        codigo = scan.nextInt();
                        if(escvoo==1) {
                            for(int i = 0; i<executivos.size(); i++) {
                                if(executivos.get(i).getCodigo() == codigo) {
                                    bool = 1;
                                    exetemp = executivos.get(i);
                                    break;}}
                        }
                        if(escvoo==2) {
                            for(int i = 0; i<convencionais.size(); i++) {
                                if(convencionais.get(i).getCodigo() == codigo) {
                                    bool=1;
                                    convtemp = convencionais.get(i);
                                    break;}}
                        }
                        if(bool==1) {
                            System.out.print("\nDIGITE SEU ASSENTO: ");
                            assento = scan.nextInt();
                            for(int i = 0; i<passagens.size(); i++) {
                                if(((escvoo == 1 && passagens.get(i).getCodigoExe() == codigo) || (escvoo == 2 && passagens.get(i).getCodigoConv() == codigo)) && passagens.get(i).getAssento() == assento || assento > 410  || assento < 1) {
                                    bool=0;
                                }
                            }
                            if(bool==1) {
                                passtemp = new Passagem(pesstemp,convtemp, exetemp,assento);
                                passagens.add(passtemp);
                                System.out.print("PASSAGEM COMPRADA!!!");
                            }
                            else {
                                System.out.print("-ASSENTO INVALIDO-");
                            }
                        }
                        else {
                            System.out.print("-CODIGO INVALIDO-");
                        }

                    }}
                else {
                    System.out.print("-CPF INVALIDO-");
                }

            }

            if(esc==4) {
                System.out.print("\n\nDIGITE SEU CPF: ");
                cpf = scan.next();
                System.out.print("\n\n--CONVENCIONAIS--\n");
                for(Passagem passagem: passagens){
                    passagem.buscarAtributosConv(cpf);
                }
                System.out.print("\n\n--EXECUTIVOS--\n");
                for(Passagem passagem : passagens){
                    passagem.buscarAtributosExe(cpf);
                }
            }

            if(esc==5) {
                System.out.print( "DIGITE A SENHA: " );
                senha = scan.nextInt();
                if(senha == 6847) {
                    System.out.print( "DIGITE (1) PARA CRIAR VOO OU (2) PARA REMOVER: " );
                    escadm = scan.nextInt();
                    if(escadm == 1) {
                        System.out.print( "Digite o codigo do voo: " );
                        codigo=scan.nextInt();
                        System.out.print( "Digite a companhia: " );
                        companhia=scan.next();
                        System.out.print( "Digite o país de origem: " );
                        paisOrigem=scan.next();
                        System.out.print( "Digite o país de destino: " );
                        paisDestino=scan.next();
                        System.out.print( "Digite o estado de origem: " );
                        estadoOrigem=scan.next();
                        System.out.print( "Digite o estado de destino: " );
                        estadoDestino=scan.next();
                        System.out.print( "Digite a cidade de origem: " );
                        cidadeOrigem=scan.next();
                        System.out.print( "Digite a cidade de destino: " );
                        cidadeDestino=scan.next();
                        System.out.print( "Digite o preco: " );
                        preco=scan.nextFloat();
                        System.out.print( "Digite a data e horario de partida (yyyy-MM-dd HH:mm:ss): " );
                        scan.nextLine();
                        partidaStr=scan.nextLine();
                        partidaHorario = formato.parse(partidaStr);
                        System.out.print( "Digite a data e horario de chegada (yyyy-MM-dd HH:mm:ss): " );
                        chegadaStr=scan.nextLine();
                        chegadaHorario = formato.parse(chegadaStr);;
                        System.out.print( "Digite se o voo eh executivo(1) ou convencional(2):" );
                        escvoo=scan.nextInt();
                        if(escvoo == 1) {
                            System.out.print( "Digite o cardapio: " );
                            cardapio=scan.next();
                            exetemp= new Executivo(codigo, companhia, paisOrigem, paisDestino, estadoOrigem, estadoDestino, cidadeOrigem, cidadeDestino, partidaHorario, chegadaHorario, preco, cardapio );
                            executivos.add(exetemp);
                        }

                        if(escvoo == 2) {
                            convtemp= new Convencional(codigo, companhia, paisOrigem, paisDestino, estadoOrigem, estadoDestino, cidadeOrigem, cidadeDestino, partidaHorario, chegadaHorario, preco );
                            convencionais.add(convtemp);
                        }

                    }
                    if(escadm==2) {
                        System.out.print( "Digite se o voo eh executivo(1) ou convencional(2):" );
                        escvoo = scan.nextInt();
                        System.out.print( "Digite o codigo do voo que quer remover: " );
                        codigo = scan.nextInt();
                        if(escvoo==1) {
                            for(int i=0; i< executivos.size(); i++) {
                                if(executivos.get(i).getCodigo()==codigo) {
                                    executivos.remove(i);
                                }
                            }
                        }
                        if(escvoo==2) {
                            for(int i=0; i< convencionais.size(); i++) {
                                if(convencionais.get(i).getCodigo()==codigo) {
                                    convencionais.remove(i);
                                }
                            }
                        }

                    }
                }
                else {
                    System.out.print( "--SENHA INVALIDA--");
                }
            }
            if(esc == 3){
                System.out.print("Convencionais:\n");
                for(int i = 0; i < convencionais.size(); i++) {
                    System.out.println(convencionais.get(i).getCodigo() + ": " +convencionais.get(i).getCidadeOrigem() + " X " + convencionais.get(i).getCidadeDestino() + "  -  "+ convencionais.get(i).getPartidaHorario() + " = R$" + convencionais.get(i).getPreco());
                }
                System.out.print("\nExecutivos:\n");
                for(int i = 0; i < executivos.size(); i++) {
                    System.out.println(executivos.get(i).getCodigo() + ": " +executivos.get(i).getCidadeOrigem() + " X " + executivos.get(i).getCidadeDestino() + "  -  " + executivos.get(i).getPartidaHorario()+ " = R$" + executivos.get(i).getPrecoBase() + "  -  CARDAPIO: " + executivos.get(i).getCardapio());
                }
            }


            System.out.println( "\n\n\n\n" );
        }
        scan.close();
    }
}