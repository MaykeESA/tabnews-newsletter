package br.com.email.tabnews.model;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	private String nome;
	private String email;
	private LocalDateTime dataCriacao;

	public User(){

	}

	public User(String nome, String email) {
		this.nome = nome;
		this.email = email;
		this.dataCriacao = LocalDateTime.now();
	}
}
