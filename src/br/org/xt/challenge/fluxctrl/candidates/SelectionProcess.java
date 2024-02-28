package br.org.xt.challenge.fluxctrl.candidates;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionProcess {

	public static void main(String[] args) {
		String[] candidates = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};

		for (String candidate : candidates) {
			makeContact(candidate);
		}
	}

	static void makeContact(String candidate) {
		int tries = 1; 
		boolean continueTrying = true;
		boolean receive = false;

		do {
			receive = receive();
			continueTrying = !receive;

			if (continueTrying) {
				tries++;
			} else {
				System.out.println("Contato realizado.");
			}
		} while (continueTrying && tries < 3);

		if (receive) {
			System.out.println("Conseguimos contato com " + candidate + " na " + tries + " tentativa");
		} else {
			System.out.println("Não conseguimos contato com o candidato " + candidate);
		}
	}

	static boolean receive() {
		return new Random().nextInt(3) == 1;
	}

	static void printSelected() {
		String[] candidates = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};

		System.out.println("Imprimindo candidatos a partir do indice do elemento.");

		for (int i = 0; i < candidates.length; i++) {
			System.out.println("Indice " + i + " Candidato " + candidates[i]);
		}

		System.out.println("Forma abreviada de iteração");

		for (String candidate : candidates) {
			System.out.println("Candidato selecionado: " + candidate);
		}
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
