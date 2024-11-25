package ent;
import java.util.ArrayList;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
public class Repositorio {
	public ArrayList<Executivo> lerArquivoExe() {
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    ArrayList<Executivo> voo = new ArrayList<>();
	    File file = new File("repositorios/voos/executivos.json");
	    Type tipoLista = new TypeToken<ArrayList<Executivo>>() {}.getType();
	    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
	        voo = gson.fromJson(reader, tipoLista);
	    } catch (IOException e) {
	        e.printStackTrace(); 
	    }
	    return voo;
	}
	
	public void escreverArquivoExe(ArrayList<Executivo> voo) {
		  Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        File arquivo = new File("repositorios/voos/executivos.json");

	        try {
	            // Verifica se o diretório pai existe, e o cria caso não exista
	            File diretorioPai = arquivo.getParentFile();
	            if (diretorioPai != null && !diretorioPai.exists()) {
	                diretorioPai.mkdirs(); // Cria os diretórios pai
	            }

	            // Cria o arquivo JSON
	            try (FileWriter file = new FileWriter(arquivo)) {
	                gson.toJson(voo, file);
	            }
	        } catch (IOException e) {
	            e.printStackTrace(); // Exibe o erro no console para diagnóstico
	        }
		
	}
	
	public ArrayList<Convencional> lerArquivoConv() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    ArrayList<Convencional> voo = new ArrayList<>();
	    File file = new File("repositorios/voos/convencional.json");
	    Type tipoLista = new TypeToken<ArrayList<Convencional>>() {}.getType();
	    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
	        voo = gson.fromJson(reader, tipoLista);
	    } catch (IOException e) {
	        e.printStackTrace(); 
	    }
	    return voo;
	}
	
	public void escreverArquivoConv(ArrayList<Convencional> voo) {
		  Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        File arquivo = new File("repositorios/voos/convencional.json");

	        try {
	            // Verifica se o diretório pai existe, e o cria caso não exista
	            File diretorioPai = arquivo.getParentFile();
	            if (diretorioPai != null && !diretorioPai.exists()) {
	                diretorioPai.mkdirs(); // Cria os diretórios pai
	            }

	            // Cria o arquivo JSON
	            try (FileWriter file = new FileWriter(arquivo)) {
	                gson.toJson(voo, file);
	            }
	        } catch (IOException e) {
	            e.printStackTrace(); // Exibe o erro no console para diagnóstico
	        }
	}


	public ArrayList<Pessoa> lerArquivoPess() {
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
    ArrayList<Pessoa> voo = new ArrayList<>();
    File file = new File("repositorios/voos/passageiros.json");
    Type tipoLista = new TypeToken<ArrayList<Pessoa>>() {}.getType();
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        voo = gson.fromJson(reader, tipoLista);
    } catch (IOException e) {
        e.printStackTrace(); 
    }
    return voo;
}

	public void escreverArquivoPess(ArrayList<Pessoa> voo) {
	  Gson gson = new GsonBuilder().setPrettyPrinting().create();
        File arquivo = new File("repositorios/voos/passageiros.json");

        try {
            // Verifica se o diretório pai existe, e o cria caso não exista
            File diretorioPai = arquivo.getParentFile();
            if (diretorioPai != null && !diretorioPai.exists()) {
                diretorioPai.mkdirs(); // Cria os diretórios pai
            }

            // Cria o arquivo JSON
            try (FileWriter file = new FileWriter(arquivo)) {
                gson.toJson(voo, file);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Exibe o erro no console para diagnóstico
        }
}
	
	public ArrayList<Passagem> lerArquivoPsg() {
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
    ArrayList<Passagem> voo = new ArrayList<>();
    File file = new File("repositorios/voos/passagem.json");
    Type tipoLista = new TypeToken<ArrayList<Passagem>>() {}.getType();
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        voo = gson.fromJson(reader, tipoLista);
    } catch (IOException e) {
        e.printStackTrace(); 
    }
    return voo;
}

	public void escreverArquivoPsg(ArrayList<Passagem> voo) {
	  Gson gson = new GsonBuilder().setPrettyPrinting().create();
        File arquivo = new File("repositorios/voos/passagem.json");

        try {
            // Verifica se o diretório pai existe, e o cria caso não exista
            File diretorioPai = arquivo.getParentFile();
            if (diretorioPai != null && !diretorioPai.exists()) {
                diretorioPai.mkdirs(); // Cria os diretórios pai
            }

            // Cria o arquivo JSON
            try (FileWriter file = new FileWriter(arquivo)) {
                gson.toJson(voo, file);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Exibe o erro no console para diagnóstico
        }
}
}
