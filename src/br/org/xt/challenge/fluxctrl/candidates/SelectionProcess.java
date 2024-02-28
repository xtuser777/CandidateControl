package br.org.xt.challenge.fluxctrl.candidates;

public class SelectionProcess {

	public static void main(String[] args) {
		candidateAnalysis(1900.0);
		candidateAnalysis(2200.0);
		candidateAnalysis(2000.0);
	}
	
	static void candidateAnalysis(double pretendSalary) {
		double baseSalary = 2000.0;
		
		if (baseSalary > pretendSalary) {
			System.out.println("Ligar para o candidato");
		} else if (baseSalary == pretendSalary) {
			System.out.println("Ligar para o candidato para contra proposta");
		} else {
			System.out.println("Aguardando o resultado dos demais");
		}
	}
}
