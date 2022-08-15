package Herança;

import java.util.Scanner;

public class HerancaH {

	public static void main(String[] args) {
		//Programa Principal;
		Scanner scanner = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Bruno");
		p1.setIdade(22);
		p1.setSexo('M');
		
		p2.setNome("João");
		p2.setIdade(33);
		p2.setSexo('M');
		p2.setMatricula(202221);
		p2.setCurso("ADS");
		p2.setTurno("Noturno");
		
		p3.setNome("Luiz");
		p3.setIdade(44);
		p3.setSexo('M');
		p3.setEspecialidade("Liguagem Python");
		p3.setSalario(3000);
		
		p4.setNome("Paula");
		p4.setIdade(23);
		p4.setSexo('F');
		p4.setSetor("Secretária");
		p4.setTrabalhando(true);
		
		System.out.println("=============================");
		System.out.println("[1]- Dados do Aluno. ");
		System.out.println("[2]- Dados do Professor. ");
		System.out.println("[3]- Dados do Funcionário. ");
		System.out.printf("R= ");
		int resposta = scanner.nextInt();
		
		switch(resposta) {
		case 1:
			p2.detalhes();
			System.out.println(" Curso: "+ p2.getCurso() + ", Período: "+p2.getTurno());
			System.out.println(" Número da Matricula: "+ p2.getMatricula());
			System.out.println("--------------------------------------");
			break;
		case 2:
			p3.detalhes();
			System.out.println(" Especialidade: "+ p3.getEspecialidade()+ "\n Salário Atual: "+ p3.getSalario());
			System.out.println("--------------------------------------");
			break;
		
		case 3: 
			p4.detalhes();
			System.out.println(" Setor: "+ p4.getSetor()+ ", Trabalhando: "+ p4.isTrabalhando());
			System.out.println("--------------------------------------");
			break;
		}
		scanner.close();	
	}

}
