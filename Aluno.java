package Herança;

public class Aluno extends Pessoa{
	//Atributos;
	private int matricula;
	private String curso;
	private String turno;
	//Métodos personalizados;
	public void cancelarMatri() {
		System.out.println("A matricula será cancelada!");
		
	}
	//Métodos especiais;
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
}
