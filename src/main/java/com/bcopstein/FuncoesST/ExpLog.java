package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Math;

public class ExpLog {
	List<Double> list = new ArrayList<Double>();
	Util util = new Util();		
	public Iterator<Double> getTermos(){
		// TODO:
		throw new UnsupportedOperationException();
	}
	
	public double exp(double x) {
		for(int n = 0; n < 10e-6; n++){
			double termo = Math.pow(x,n)/util.fatorial(n);
			list.add(termo);
		}
		return util.somatorio(0,list.size()-1,list);
		
	}

	public double log(double x) {
		if (Math.abs(x) < 1) throw new UnsupportedOperationException();		
		for (int n = 0; n < 10e-6; n++){
			double termo =  Math.pow(-1,n) / Math.pow(n+1,Math.pow(x,n+1));
			list.add(termo);
		}
		return util.somatorio(0,list.size()-1,list);

	}
}
