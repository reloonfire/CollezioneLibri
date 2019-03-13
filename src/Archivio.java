import java.util.HashSet;
import java.util.Iterator;
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
}
