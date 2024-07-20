package Lambdas;

import java.io.File;
import java.io.FileFilter;

public class FiltroFicheros {
	public static void main(String[] args) {
		//Lambda
		File[] fuentes =  new File("C:\\Users\\Usuario\\Desktop\\Programacion\\CURSO1\\PRORGAMACION\\JAVA").listFiles((f) -> f.getName().endsWith("java"));
		
		for (int i = 0; i < fuentes.length; i++) {
			System.out.println(fuentes[i]);
		}
	}

}
