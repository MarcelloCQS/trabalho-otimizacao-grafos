//Coloquei os metodos novos comentados para realizar testes. Este pode ser nosso novo main principal. Basta tirar
//os comentarios.


package MatrizAdjacencia;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		try {
		FileReader arquivo = new FileReader("Grafos.txt");
		BufferedReader lerArquivo = new BufferedReader(arquivo);
		
		Grafo grafo = new Grafo(lerArquivo);
		MatrizAdjacencia matriz = new  MatrizAdjacencia();
		
		
		//grafo.adicionarNovaAresta(1,5); //testando a adicao de nova aresta
		//grafo.adicionarNovaAresta(7,8); //testando a adicao de nova aresta
		
		//grafo.removerAresta(4,5); //testando a remocao de aresta
		//grafo.removerAresta(2,3); //testando a remocao de aresta
		
		//grafo.adicionarVertice(6); //testando a adicao de vertice. Nao esta funcionando
		
		matriz.lerGrafo(grafo);//monta a matriz adjacencia
		
		//grafo.retornarNosVizinhos(4); //testando. Nao esta funcioando perfeitamente
		

		
		//fechando o arquivo
		arquivo.close();
		lerArquivo.close();
		
		//imprime a matriz adjacencia
		System.out.println("Matriz AdjacÃªncia \n" + grafo.formataSaidaDaMatriz());
		
		//System.out.println("Quantidade de vertices = " + grafo.n);
		//System.out.println("Quantidade de arestas = " + grafo.m);
		


		
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
}
