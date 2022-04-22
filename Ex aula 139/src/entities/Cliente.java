package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private final String nome;
	private String email;
	private Date dataAniversario;
	

	public Cliente(String nome, String email, Date dataAniversario) {
		super();
		this.nome = nome;
		this.email = email;
		this.dataAniversario = dataAniversario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDataAniversario() {
		return dataAniversario;
	}


	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}


	public String getNome() {
		return nome;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(" ");
		sb.append(String.format("(%s) - ", sdf.format(dataAniversario)));
		sb.append(email);
		
		return sb.toString();
	}
	
	
}
