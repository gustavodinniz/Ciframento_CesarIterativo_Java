public class CiframentoCesar {

	public static String codigoCiframento(String mensagem) {

		char ascii;
		char a, b;
		int chave = 3;

		for (int i = 0; i < mensagem.length(); i++) {
			if (mensagem.charAt(i) >= 32 && mensagem.charAt(i) <= 254) {
				if ((int) (mensagem.charAt(i) + chave) > 254) {
					a = (char) (mensagem.charAt(i) + chave);
					b = (char) (a - 254);
					ascii = (char) (31 + b);
					MyIO.print(ascii);
				} else {
					ascii = (char) (mensagem.charAt(i) + chave);
					MyIO.print(ascii);
				}
			}

		}
		return mensagem;

	}

	public static void main(String[] args) {

		String codificar;
		String mensagem = MyIO.readLine();

		while (!(mensagem.equals("FIM"))) {

			codificar = codigoCiframento(mensagem);
			MyIO.println("");
			mensagem = MyIO.readLine();
		}

	}
}