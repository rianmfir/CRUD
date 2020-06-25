package com.arkademy.CRUD;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produk {
	private Long id;
	private String nama_produk;
	private String keterangan;
	private Integer harga;
	private Integer jumlah;

	protected Produk() {
	}

	public Produk(Long id, String nama_produk, String keterangan, Integer harga, Integer jumlah) {
		super();
		this.id = id;
		this.nama_produk = nama_produk;
		this.keterangan = keterangan;
		this.harga = harga;
		this.jumlah = jumlah;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNama_produk() {
		return nama_produk;
	}

	public void setNama_produk(String nama_produk) {
		this.nama_produk = nama_produk;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public Integer getHarga() {
		return harga;
	}

	public void setHarga(Integer harga) {
		this.harga = harga;
	}

	public Integer getJumlah() {
		return jumlah;
	}

	public void setJumlah(Integer jumlah) {
		this.jumlah = jumlah;
	}

	
	
	

}
