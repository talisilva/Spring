package org.generation.farmacia.controller;

import java.util.List;

import org.generation.farmacia.model.Categoria;
import org.generation.farmacia.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {
	
	
@Autowired
private CategoriaRepository categoriaRepository;

@GetMapping
public ResponseEntity<List<Categoria>>getAll(){
	return ResponseEntity.ok(categoriaRepository.findAll());
}
	
@GetMapping(" /{id}")
public ResponseEntity<Categoria> getById(@PathVariable long id) {
	return categoriaRepository.findById(id)
		.map(resp -> ResponseEntity.ok(resp))
		.orElse(ResponseEntity.notFound().build());	
}

@GetMapping ("/{generico}")
public ResponseEntity<List<Categoria>> getByGenerico(@PathVariable String generico){
	return ResponseEntity.ok(categoriaRepository.findAllByGenericoContainingIgnoreCase(generico));
}
@GetMapping ("/{suplemento}")
public ResponseEntity<List<Categoria>> getBySuplemento(@PathVariable String suplemento){
return ResponseEntity.ok(categoriaRepository.findAllBySuplementoContainingIgnoreCase(suplemento));
}
@GetMapping ("/{vitamina")
public ResponseEntity<List<Categoria>> getByVitamina(@PathVariable String vitamina){
	return ResponseEntity.ok(categoriaRepository.findAllByVitaminaContainingIgnoreCase(vitamina));
}
@PostMapping
public ResponseEntity<Categoria> postCategoria (@RequestBody Categoria categoria){
	return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria));
}

@PutMapping
public ResponseEntity<Categoria> putCategoria (@RequestBody Categoria categoria){
	return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.save(categoria));
}
@DeleteMapping("/{id}")
public void deleteCategoria(@PathVariable long id) {
	categoriaRepository.deleteById(id);
}
}
