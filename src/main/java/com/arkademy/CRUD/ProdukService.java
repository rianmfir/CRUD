package com.arkademy.CRUD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProdukService {

	@Autowired
	private ProdukRepository produkRepository;
	
	public List<Produk> listAll() {
		return produkRepository.findAll();
	}
	
	public void save(Produk produk) {
		produkRepository.save(produk);
	}
	
	public Produk get(long id) {
		return produkRepository.findById(id).get();
	}
	
	public void delete(long id) {
		produkRepository.deleteById(id);
	}
}

