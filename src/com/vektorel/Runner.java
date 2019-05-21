package com.vektorel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
			DosyaIslemleri ds = new DosyaIslemleri();	
			
			List<String> liste = new ArrayList<String>();
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < 5; i++) {
				System.out.println("Yazı giriniz..: ");
				String yazi = sc.nextLine();
				liste.add(yazi);
			}
			ds.yaz("D:\\fileIO.txt", true, liste);
			
			for (String item : ds.oku("D:\\fileIO.txt")) {
				System.out.println(item);
			}
			
		
			
	}

}
