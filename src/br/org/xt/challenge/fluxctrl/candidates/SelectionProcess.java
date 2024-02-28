package br.org.xt.challenge.fluxctrl.candidates;

import java.util.concurrent.ThreadLocalRandom;

public class SelectionProcess {

	public static void main(String[] args) {
		candidateAnalysis(1900.0);
		candidateAnalysis(2200.0);
		candidateAnalysis(2000.0);
	}

	static void candidatesSelection() {
		String[] candidates = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

		int selectedCandidates = 0;
		int currentCandidates = 0;

		double baseSalary = 2000.0;

		while (selectedCandidates < 5 && currentCandidates < candidates.length) {
			String candidate = candidates[currentCandidates];
			double pretendSalary = predendValue();

			System.out.println("O candidato " + candidate + "solicitou o seguinte salário " + pretendSalary);

			if (baseSalary >= pretendSalary) {
				System.out.println("O candidato " + candidate + " foi selecionado para a vaga");
				selectedCandidates++;
			}
			currentCandidates++;
		}
	}

	static double predendValue() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
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
