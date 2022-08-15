package Herança;

public class Professor extends Pessoa{
	//Atributos;
	private String especialidade;
	private int salario;
	
	//Métodos personalizados;
	public void receberAum(int aumento) {
		this.salario += aumento;
		
	}
	//Métodos especiais;
	public String getEspecialidade() {
		return this.especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public int getSalario() {
		return this.salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}
