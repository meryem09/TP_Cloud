package org.meryem.web.servelet;
import java.io.Serializable;





@SuppressWarnings("serial")
@Entity(name="Marin")
@Table(name="Marin")

public class Marin implements Serializable {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id ;

	@Column(name="last_name", length=40)
	private String nom ;

	@Column(name="first_name", length=40)
	private String prenom ;

	@Column(name="age")
	private int age ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Marin [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", age=" + age + "]";
	}
}
