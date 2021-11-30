package com.juaracoding.main;

public class MainApp {
	public static void main(String args[]) {
		BidangRuang bidang1 = new BidangRuang();
		bidang1.setNama("Lingkaran");
//		
//		BidangRuang bidang2 = new BidangRuang();
//		bidang2.setNama("Segitiga");
		
//		System.out.println("Bidang 1 nama ->" + bidang1.getNama());
//		System.out.println("Bidang 1 nama ->" + bidang1.hitungLuas());
//		System.out.println("Bidang 2 nama ->" + bidang2.getNama());
//		System.out.println("Bidang 2 nama ->" + bidang2.hitungVolume());
		
		Segitiga segitiga = new Segitiga();
		segitiga.setNama("Segitiga");
		segitiga.gambarRuang();
		
		Kotak kotak = new Kotak();
		kotak.setNama("KOtak");
		kotak.gambarRuang();
		
		
		//MainanBalok mainan = new MainanBalok();
		
		//mainan.add(kotak);
		
	}
}
