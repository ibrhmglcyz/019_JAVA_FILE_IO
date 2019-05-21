package com.vektorel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DosyaIslemleri {

	public void oku() {
		
	File fl = new File("d:\\fileIO.txt");
	Scanner sc ;
		try {
			 sc = new Scanner(fl);
			while(sc.hasNext()) {
				String s = sc.nextLine();
				System.out.println(s);
						
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void oku_yaz(String dosya_yolu) {
		
		File fl = new File(dosya_yolu);
		Scanner sc ;
			try {
				 sc = new Scanner(fl);
				while(sc.hasNext()) {
					String s = sc.nextLine();
					System.out.println(s);
							
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public List<String> oku(String dosya_yolu){
		
		File fl = new File(dosya_yolu);
		List<String> result =  new ArrayList<String>();
		Scanner sc ;
			try {
				 sc = new Scanner(fl);
				while(sc.hasNext()) {
					String s = sc.nextLine();
					result.add(s);
							
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return result;	
	}
	
	public void yaz(String dosya_yolu,boolean wr,String yazi) {
		
		File fl = new File(dosya_yolu);
		
		try {
			BufferedWriter bf = 
					new BufferedWriter(new FileWriter(fl, wr));
						bf.write(yazi);
						bf.newLine();
						bf.flush();
						bf.close();
						System.out.println("İşlmem Tmm");
						
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public void yaz(String dosya_yolu,boolean wr,List<String> yaziListesi) {
		
		File fl = new File(dosya_yolu);
		
		try {
			BufferedWriter bf = 
					new BufferedWriter(new FileWriter(fl, wr));
						
						for(String item: yaziListesi) {
						bf.write(item);
						bf.newLine();
						}
						bf.flush();
						bf.close();
						System.out.println("İşlmem Tmm");
						
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	

}
