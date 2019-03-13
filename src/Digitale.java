import java.time.LocalDate;

public class Digitale extends Romanzo {

	enum Formati {
		EPUB, MOBI, PDF, AWF
	}

	enum SupportiMemorizzazione {
		CD_ROM, STORAGE
	}

	private Formati formato;
	private int dimensione;
	private SupportiMemorizzazione supportoDiMemorizzazione;

	public Digitale(String titolo, String autore, String editore, LocalDate annoDiPubblicazione, Formati formato,
			int dimensione, SupportiMemorizzazione supportoDiMemorizzazione) {
		super(titolo, autore, editore, annoDiPubblicazione);
		this.formato = formato;
		this.dimensione = dimensione;
		this.supportoDiMemorizzazione = supportoDiMemorizzazione;
	}

	public Formati getFormato() {
		return formato;
	}

	public int getDimensione() {
		return dimensione;
	}

	public SupportiMemorizzazione getSupportoDiMemorizzazione() {
		return supportoDiMemorizzazione;
	}
	
	

}
