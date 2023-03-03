package calculatrice.bll;

import java.util.List;

import calculatrice.bo.Calculatrice;

public class CalculatriceManagerImpl implements CalculatriceManager {

	private List<String> histo = null;
	
	@Override
	public int calcul(Calculatrice calculatrice) {
		int res = 0;
		
		int a = calculatrice.getA();
		int b = calculatrice.getB();
		String op = calculatrice.getOp();
		List<String> histo = calculatrice.getHisto();
		
		switch(op) {
			case "addition":
				res = a+b;
				histo.add(a +" + " + b+ " = " + res);
				historic(histo);
				break;
			case "soustraction":
				res = a-b;
				histo.add(a +" - " + b+ " = " + res);
				historic(histo);
				break;
			case "multiplication":
				res = a*b;
				histo.add(a +" * " + b+ " = " + res);
				break;
			case "division":
				res = a/b;
				histo.add(a +" / " + b+ " = " + res);
				break;
		}
		
		return res;
	}



	@Override
	public List<String> historic(List<String> histo) {
		// TODO Auto-generated method stub
		return histo;
	}

}
