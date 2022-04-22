package entities;

public class Hotel {
	
	private Aluno[] quartos = new Aluno[10];
	
	public boolean ChecaQuarto(int numQuarto) {
		if (quartos[numQuarto] != null) {
			return false;
		}else {
			return true;
		}
	}
	
	public void AlocaQuarto(Aluno aluno) {
		int aux = aluno.getQuartoEscolhido();
		if (ChecaQuarto(aux)) {
			quartos[aux] = aluno;
			System.out.println("Reserva feita");
		}else {
			System.out.println("Quarto Ocupado");
			
		}
	}
	
	@Override
	public String toString() {
		String s = "";
		
		for (int i = 0; i < quartos.length; i++) {
			if (! ChecaQuarto(i)) {
				s += String.format("Quarto %d: Aluno: %s\n", i+1, quartos[i].getNome());
			}
			
		}
		
		return s;
	}

}
