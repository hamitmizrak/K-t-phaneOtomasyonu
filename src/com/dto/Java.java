package com.dto;

import java.util.Date;
//POJO

// pojo = access identifier'ı private olan ve sadece getter and setter olan
//Nesne değişkeni eğer static kullanmaış olsaydım. Bununu class değişkeni
public class Java {
//Nesne değişkeni
	private int id;
	private String kitapAdi; // camel Case
	private double fiyati;
	private String yazarAdi;
	private Date basimTarihi;

	// getter and setter
	// Shift+Alt+S ==> Generate Getter and Setter
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

	// validation yapmış oluyorum
	public void setFiyati(double fiyati) {
		if (fiyati < 0) {
			this.fiyati = (-1) * fiyati;
		}
		this.fiyati = -fiyati;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public Date getKurulusTarihi() {
		return basimTarihi;
	}

	public void setKurulusTarihi(Date kurulusTarihi) {
		this.basimTarihi = kurulusTarihi;
	}

	// toString
	@Override
	public String toString() {
		return "Java [id=" + id + ", kitapAdi=" + kitapAdi + ", fiyati=" + fiyati + ", yazarAdi=" + yazarAdi
				+ ", basimTarihi=" + basimTarihi + "]";
	}

}
