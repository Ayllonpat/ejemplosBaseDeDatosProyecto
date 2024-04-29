package com.salesianostriana.dam.serviciobase.service.base;

import java.util.List;
import java.util.Optional;

public interface BaseService<T, ID> {
	
	//t es la clase, e id el tipo de dato
	
	List<T> findAll();
	
	Optional<T> findById(ID id);
	
	T save(T t);
	
	T edit(T t);
	
	void delete(T t);
	
	void deleteById(ID id);
	

}
