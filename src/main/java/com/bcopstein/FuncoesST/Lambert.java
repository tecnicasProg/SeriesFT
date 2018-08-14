package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lambert {

	List<Double> lista;
	double limite;

	public Lambert(){
		lista = new ArrayList<>();
		limite = 10E-6;
	}

	public Iterator<Double> getTermos(){
		return lista.iterator();
	}

	public double W0(double x) {

		if( Math.abs(x) < Math.E)
			throw new IllegalArgumentException();

		List<Double> lista = new ArrayList<>();
		double last = 0;
		int n = 1;

		while(true){
			 last = (Math.pow(-n, n-1)/ Util.fatorial(n)) * Math.pow(x,n);
			 if(last < limite)
			 		break;
			 lista.add(last);
		}

		this.lista = lista;

		return Util.somatorio(0, lista.size(), lista);
	}
}
