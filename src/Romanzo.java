import java.time.LocalDate;

public abstract class Romanzo {

	private String titolo, autore, editore;
	private LocalDate annoDiPubblicazione;

	public Romanzo(String titolo, String autore, String editore, LocalDate annoDiPubblicazione) {
		this.titolo = titolo;
		this.autore = autore;
		this.editore = editore;
		this.annoDiPubblicazione = annoDiPubblicazione;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getAutore() {
		return autore;
	}

	public String getEditore() {
		return editore;
	}

	public LocalDate getAnnoDiPubblicazione() {
		return annoDiPubblicazione;
	}

	
	
}
