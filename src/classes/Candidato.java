package classes;


public class Candidato {

	private int ID;
	private String nome;
	private String partido;
	private boolean fLimpa;
	
	
	public Candidato(int id,String nome, String partido, boolean fLimpa, int ID) {
		this.ID = ID;
		this.nome = nome;
		this.partido = partido;
		this.fLimpa = fLimpa;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public boolean isfLimpa() {
		return fLimpa;
    }		
	public void setfLimpa(boolean fLimpa) {
		this.fLimpa = fLimpa;
	}

	
}
