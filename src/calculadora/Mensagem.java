package calculadora;

public class Mensagem {

	public static void obterMensagem(int hora) {
		
		switch (hora) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			mensagemBomdia();
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			mensagemBoaTarde();
			break;
		case 21:
		case 22:
		case 23:
		case 00:
		case 01:
		case 02:
		case 03:
		case 04:
		
			mensagemBoaNoite();
			break;
		}
		
	}

	private static void mensagemBoaNoite() {
		System.out.println("Boa noite");
		
	}

	private static void mensagemBoaTarde() {
		System.out.println("Boa tarde");
		
	}

	private static void mensagemBomdia() {
		System.out.println("Bom dia");
		
	}
}
