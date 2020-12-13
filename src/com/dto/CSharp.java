package com.dto;

import java.io.Serializable;
import java.util.Date;

//BEAN = pojo+constroctrı+implements(Serileştirme)+toString
public class CSharp implements Serializable {
	private static final long serialVersionUID = 5182406421769087435L; // benzesiz bir ID
	// Nesne değişkenleri
	private int id;
	private String kitapAdi;
	private double fiyati;
	private String yazarAdi;
	private Date kurulusTarihi;

	// Constructor =Yapıcı metotları
	// parametresiz construcor = ctrl+Space
	public CSharp() {
	}

	// parametreli constructor
	// Ctrl+Shift+S ==> Generate Constructor Using Fields
	public CSharp(int id, String kitapAdi, double fiyati, String yazarAdi, Date kurulusTarihi) {
		super();
		this.id = id;
		this.kitapAdi = kitapAdi;
		this.fiyati = fiyati;
		this.yazarAdi = yazarAdi;
		this.kurulusTarihi = kurulusTarihi;
	}

	// getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public double getFiyati() {
		return fiyati;
	}

	public void setFiyati(double fiyati) {
		this.fiyati = fiyati;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public Date getKurulusTarihi() {
		return kurulusTarihi;
	}

	public void setKurulusTarihi(Date kurulusTarihi) {
		this.kurulusTarihi = kurulusTarihi;
	}

	@Override
	public String toString() {
		return "CSharp [id=" + id + ", kitapAdi=" + kitapAdi + ", fiyati=" + fiyati + ", yazarAdi=" + yazarAdi
				+ ", kurulusTarihi=" + kurulusTarihi + "]";
	}

}
