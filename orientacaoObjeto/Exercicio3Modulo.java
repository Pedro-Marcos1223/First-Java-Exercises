package orientacaoObjeto;

public class Exercicio3Modulo {

	String produto;
	double valor;
	String fichaTecnica;
	boolean ligado= true;
	
	public Exercicio3Modulo()
	{
		this.produto="JBL-8000";
		this.valor=1500.0;
		this.fichaTecnica="Audio Bpm +3000";
		this.ligado=true;
	}
	public void informarProduto()
	{
		System.out.println("O produto �: "+produto);
	}
	
	public void informarValor()
	{
		System.out.println("O valor do produto �: "+valor);
	}
	
	public void informarFichaTecnica()
	{
		System.out.println("FICHA TECNICA: "+"\n"+fichaTecnica);
	}
	
	public void ligadando()
	{
		this.ligado=true;
		System.out.println("LIGANDO... \r\n"+" Ent�o viaja de avi�o, m�' princesa, m�' press�o\r\n"
				+ "S� vapo, vapo do malvad�o, oh\r\n"
				+ "Ela joga beijo, faz car�o, de quatro, de quatro, que tes�o\r\n"
				+ "Vai com calma, meu cora��o, oh");
	}
	
	public void desligando()
	{
		this.ligado=false;
		System.out.println("Desligando...");
	}
	
	
}
