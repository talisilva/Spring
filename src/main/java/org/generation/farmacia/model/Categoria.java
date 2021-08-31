package org.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table (name = "db_categoria")
public class Categoria {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private long id;

@Size(max = 100, message = "O atributo generico deve conter no mínimo 05 e no máximo 100 caracteres")
private String generico;

@Size(max = 100, message = "O atributo suplemento deve conter no mínimo 05 e no máximo 100 caracteres")
private String suplemento;

@Size(max = 100, message = "O atributo vitamina deve conter no mínimo 05 e no máximo 100 caracteres")
private String vitamina;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getGenerico() {
	return generico;
}

public void setGenerico(String generico) {
	this.generico = generico;
}

public String getSuplemento() {
	return suplemento;
}

public void setSuplemento(String suplemento) {
	this.suplemento = suplemento;
}

public String getVitamina() {
	return vitamina;
}

public void setVitamina(String vitamina) {
	this.vitamina = vitamina;
} 


}
