import java.time.LocalDate;

public class Cartaceo extends Romanzo {

	enum Copertine {
		RIGIDA, MOLLE
	}

	enum StatoConservazione {
		OTTIMO, BUONO, DISCRETO, ROVINATO, ILLEGGIBILE
	}

	private Copertine copertina;
	private StatoConservazione statoDiConservazione;
	private int numeroPagine;

	public Cartaceo(String titolo, String autore, String editore, LocalDate annoDiPubblicazione, Copertine copertina,
			StatoConservazione statoDiConservazione, int numeroPagine) {
		super(titolo, autore, editore, annoDiPubblicazione);
		this.copertina = copertina;
		this.statoDiConservazione = statoDiConservazione;
		this.numeroPagine = numeroPagine;
	}

	public Copertine getCopertina() {
		return copertina;
	}

	public StatoConservazione getStatoDiConservazione() {
		return statoDiConservazione;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}
	
	

}
