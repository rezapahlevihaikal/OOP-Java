package com.juaracoding.main;

public class Segitiga extends BidangRuang {
	@Override
	public void gambarRuang() {
		for(int i = 0; i < 0; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
		}
		System.out.println("");
	}
}
