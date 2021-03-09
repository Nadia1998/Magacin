package artikal;

import java.util.Date;

public class KucnaHemija extends Artikal {
	
	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		if(rokTrajanja==null) 
			throw new RuntimeException("Datum ne moze biti null vrednost!");
		this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return "Kucna hemija: "+super.toString()+" [rokTrajanja=" + rokTrajanja + "]";
	}
	
	
	
	

}
