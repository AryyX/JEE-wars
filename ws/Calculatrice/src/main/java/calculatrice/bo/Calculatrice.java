package calculatrice.bo;

import java.util.ArrayList;
import java.util.List;

public class Calculatrice {
	private int a;
	private int b;
	private String op;
	private List<String> histo = new ArrayList<String>();
	
	public Calculatrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calculatrice(int a, int b, String op/*, int res*/) {
		super();
		this.a = a;
		this.b = b;
		this.op = op;
		//this.res = res;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public List<String> getHisto() {
		return histo;
	}
	public void setHisto(List<String> histo) {
		this.histo = histo;
	}
	

}
