package collectionframework.listinterface;

public class Corona {
	int nOD;
	double size;
	public Corona(int nOD, double size) {
		this.nOD = nOD;
		this.size = size;
	}
	
	public String toString() {
		return "number of deaths = " + nOD + " Size = " +size;
	}
}
