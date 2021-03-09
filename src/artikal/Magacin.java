package artikal;

import java.util.LinkedList;

import interfaceMagacin.InterfaceMagacin;

public class Magacin implements InterfaceMagacin {

	public LinkedList<Artikal> artikli = new LinkedList<>();

	@Override
	public void dodajArtikal(Artikal artikal) {

		if (artikal != null && !artikli.contains(artikal)) {
			artikli.add(artikal);

		}
		if (artikal != null) {
			for (Artikal a : artikli) {
				if (a.equals(artikal))
					a.setKolicina(a.getKolicina() + artikal.getKolicina());
			}
		}

	}

	@Override
	public void izbaciArtikal(Artikal artikal) {

		if (artikal != null && artikli.contains(artikal)) {
			artikli.remove(artikal);
			for (Artikal ar : artikli) {
				if (ar.equals(artikal)) {
					ar.setKolicina(ar.getKolicina() - artikal.getKolicina());
				}
			}

		}
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {

		for (Artikal artikal : artikli) {
			if (artikal.getSifra() == sifra) {
				return artikal;
			}

		}
		return null;
	}
}
