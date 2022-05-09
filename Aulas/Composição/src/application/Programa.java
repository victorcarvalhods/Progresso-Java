package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.*;
import entities.enums.*;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Trabalhador trabalhador;
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//variáveis auxiliares do obj trabalhador:
		String nome;
		NivelEspecializacao lvl;
		Departamento departamento;
		Double salarioBase;
		
		//variáveis do(s) contratos:
		Double valorPorHora;
		Integer horasATrabalhar;
		String data = null;
		
		System.out.println("Insira o nome do departamento: ");
		departamento = new Departamento(sc.next());
		System.out.println("Dados do funcionário: ");
		System.out.println("Nome: ");
		nome = sc.next();
		System.out.println("Level: ");
		String aux = sc.next();
		lvl = NivelEspecializacao.valueOf(aux);
		System.out.println("Salário base: ");
		salarioBase = sc.nextDouble();
		
		trabalhador = new Trabalhador(nome, lvl, salarioBase, departamento);
		
		System.out.println("Quantos contratos para esse funcionário?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do contrato " + (i) + ":");
			System.out.println("Data: ");
			Date c_data = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			valorPorHora = sc.nextDouble();
			System.out.println("Duração: ");
			horasATrabalhar = sc.nextInt();
			ContratoPorHora contrato = new ContratoPorHora(c_data, valorPorHora, horasATrabalhar);
			trabalhador.adicionarContrato(contrato);
		}
		
		System.out.println("Mes e ano para calcular salário: ");
		String mesAno = sc.next();
		int month = Integer.parseInt(mesAno.substring(0,2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("A receber: " + mesAno + ":" + String.format("%.2f", trabalhador.aReceber(ano, month)));
		
	
	}

}
