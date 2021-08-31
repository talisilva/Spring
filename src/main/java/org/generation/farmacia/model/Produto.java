package org.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table (name = "db_produto")
public class Produto {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private long id;
@NotNull
@Size(max = 100, message = "O atributo precisa especificar o nome")
private String nome; 
@NotNull
@Size(max = 10000, message = "O atributo precisa especificar o nome")
private String descricao;

@NotNull(message = "Preço obrigatório")
private double preco;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}


}
