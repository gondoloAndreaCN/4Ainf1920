package it.itis.cuneo.backend;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Playlist {
	//possono essere il contenuto del tag che l'attributo
	private String nome;
	private String brano1;
	private String brano2;

	public Playlist(String nome, String brano1, String brano2) {
		super();
		this.nome = nome;
		this.brano1 = brano1;
		this.brano2 = brano2;
	}
	public String getNome() {
		return nome;
	}
	@XmlAttribute
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBrano1() {
		return brano1;
	}
	@XmlElement
	public void setBrano1(String brano1) {
		this.brano1 = brano1;
	}
	public String getBrano2() {
		return brano2;
	}
	@XmlElement
	public void setBrano2(String brano2) {
		this.brano2 = brano2;
	}
	@Override
	public String toString() {
		return "Playlist [nome=" + nome + ", brano1=" + brano1 + ", brano2=" + brano2 + "]";
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		String result = 1;
		result = prime * result + brano1;
		result = prime * result + brano2;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Playlist other = (Playlist) obj;
		if (brano1 != other.brano1)
			return false;
		if (brano2 != other.brano2)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String toXml() {
		return  "\t<playlist nome=\""+ nome + "\">" +
				"\n\t\t<cordx>" + brano1 + "</cordx>\n" +
				"\t\t<cordy>" + brano2 + "</cordy>\n"+
				"\t</punto>\n";
	}



}
