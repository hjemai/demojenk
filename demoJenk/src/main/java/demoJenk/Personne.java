package demoJenk;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	
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
		if(nom != null)
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
		else
			return "no name";
	}
	
	
	

}
