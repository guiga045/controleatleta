package controleatleta;

import java.util.ArrayList;

public class controleCorredor {
	private ArrayList<Corredor> listaCorredor;
	
	public controleCorredor(){
		this.listaCorredor = new ArrayList<Corredor>();
	}
	
	public ArrayList<Corredor> getListaCorredores(){
		return this.listaCorredor;
	}
	
	public void adicionarCorredor(Corredor novoCorredor){
		this.listaCorredor.add(novoCorredor);
	}
	
	public void removerCorredor(Corredor Corredor){
		this.listaCorredor.remove(Corredor);
	}
	
	public Corredor pesquisarUmCorredor(String nome){
		for(Corredor Corredor: listaCorredor){
			if (Corredor.getNome().equalsIgnoreCase(nome)) return Corredor;
	    }
	    return null;
	}
}