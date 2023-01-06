package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pfe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	@ManyToOne
	@JoinColumn(name = "id_type")
	private TypePfe type;

	public Pfe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pfe(Integer id, String titre, TypePfe type) {
		super();
		this.id = id;
		this.titre = titre;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public TypePfe getType() {
		return type;
	}

	public void setType(TypePfe type) {
		this.type = type;
	}

}
