package exercicioVetores;

public class EstudantePensao {
	String name;
	String email;
	
	public EstudantePensao() {
	}
	public EstudantePensao(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Estudante [name=" + name + ", email=" + email + "]";
	}
	
	
	
}
