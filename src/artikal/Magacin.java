package artikal;

import java.util.LinkedList;

import interfaceMagacin.InterfaceMagacin;

public class Magacin implements InterfaceMagacin {

	public LinkedList<Artikal> artikli = new LinkedList<>();

	@Override
	public void dodajArtikal(Artikal artikal) {

		artikli.add(artikal);

	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		if (artikal != null && artikli.contains(artikal)) {
			artikal.setKolicina(artikal.getKolicina() - 1);
			artikli.remove(artikal);

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
