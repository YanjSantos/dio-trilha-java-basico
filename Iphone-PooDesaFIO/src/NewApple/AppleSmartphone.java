package NewApple;

import AparelhoTelefonico.Celular;
import NavegadorInternet.Navegador;
import ReprodutorMusical.TocadorDeMidia;

public class AppleSmartphone implements Celular, Navegador, TocadorDeMidia   {


	public void ligar() {
		System.out.println("Ligando com Iphone");
	}

	public void atender() {
		System.out.println("Atendendo ligação com Iphone");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz do Iphone");
	}

	public void exibirPagina() {
		System.out.println("Exibindo nova página no navegador Opera");
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova página ao navegador Opera");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página do navegador Opera");
	}

	public void tocar() {
		System.out.println("Tocar faixa de música");
	}

	public void pausar() {
		System.out.println("Pausar faixa de música");
	}

	public void selecionarMusica() {
		System.out.println("Selecionar faixa de música");
	}

}
