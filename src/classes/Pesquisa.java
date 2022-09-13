package classes;

import java.util.Date;

public class Pesquisa<priivate>  {

	private int id;
	private String intituto; 
	private Date data;
	private String local;
	private float mediaIdade;
	private String formato;
	
	public Pesquisa(String intituto, String local, Date data) {
		this.intituto = intituto;
		this.data = data;
		this.local = local;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIntituto() {
		return intituto;
	}

	public void setIntituto(String intituto) {
		this.intituto = intituto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public float getMediaIdade() {
		return mediaIdade;
	}

	public void setMediaIdade(float mediaIdade) {
		this.mediaIdade = mediaIdade;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	
	
}	
