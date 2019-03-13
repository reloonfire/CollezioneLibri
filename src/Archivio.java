import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import exceptions.NoBookFoundException;

public class Archivio {

	private Set<Romanzo> archivio = new HashSet<>();
	
	public boolean addRomanzo(Romanzo r) {
		return archivio.add(r);
	}
	
	public boolean removeRomanzo(Romanzo r) {
		return archivio.remove(r);
	}
	
	public Romanzo getRomanzoByTitle(String title) throws NoBookFoundException {
		for(Iterator<Romanzo> i = archivio.iterator();i.hasNext();) {
			Romanzo r = i.next();
			if (r.getTitolo().equals(title)) return r;
		}
		throw new NoBookFoundException();
	}
	
	public List<Romanzo> getRomanziByAuthor(String author) throws NoBookFoundException {
		List<Romanzo> l = new ArrayList<>();
		for(Iterator<Romanzo> i = archivio.iterator();i.hasNext();) {
			Romanzo r = i.next();
			if (r.getAutore().equals(author)) l.add(r);
		}
		if (l.isEmpty()) throw new NoBookFoundException();
		return l;
	}
	
	public List<Romanzo> getRomanziAfterDate(LocalDate date) throws NoBookFoundException {
		List<Romanzo> l = new ArrayList<>();
		for(Iterator<Romanzo> i = archivio.iterator();i.hasNext();) {
			Romanzo r = i.next();
			if (r.getAnnoDiPubblicazione().isAfter(date)) l.add(r);
		}
		if (l.isEmpty()) throw new NoBookFoundException();
		return l;
	}
	
	public List<Romanzo> getRomanziBeforeDate(LocalDate date) throws NoBookFoundException {
		List<Romanzo> l = new ArrayList<>();
		for(Iterator<Romanzo> i = archivio.iterator();i.hasNext();) {
			Romanzo r = i.next();
			if (r.getAnnoDiPubblicazione().isBefore(date)) l.add(r);
		}
		if (l.isEmpty()) throw new NoBookFoundException();
		return l;
	}
	
	public List<Romanzo> getRomanzoByFilter(String title, String... filter) throws NoBookFoundException {
		List<Romanzo> l = new ArrayList<>();
		// Usare lambda
		return null;
	}
	
}
