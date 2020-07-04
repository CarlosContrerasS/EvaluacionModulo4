package awl.modulo4.model;

public class Accidentabilidad {
	
	private float Accidentabilidad;
	
	public Accidentabilidad() {
		
		
	}

	public Accidentabilidad(float accidentabilidad) {
		super();
		this.Accidentabilidad = accidentabilidad;
	}

	public float getAccidentabilidad() {
		return Accidentabilidad;
	}

	public void setAccidentabilidad(float accidentabilidad) {
		Accidentabilidad = accidentabilidad;
	}

	@Override
	public String toString() {
		return "Accidentabilidad [Accidentabilidad=" + Accidentabilidad + ", getAccidentabilidad()="
				+ getAccidentabilidad() + "]";
	}

	
	
		
}
	