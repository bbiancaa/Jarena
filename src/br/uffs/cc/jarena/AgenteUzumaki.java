//Aluna: Bianca Gabriela Fritsch
package br.uffs.cc.jarena;

public class AgenteUzumaki extends Agente{
  public AgenteUzumaki(Integer x, Integer y, Integer energia) {
		super(x, y, energia);
	}
	
	public void pensa() {
		if(!podeMoverPara(getDirecao())) {
			setDirecao(geraDirecaoAleatoria());
		}
	}
	
	public void recebeuEnergia() {
	}
	
	public void tomouDano(int energiaRestanteInimigo) {
	}
	
	public void ganhouCombate() {
	}
	
	public void recebeuMensagem(String msg) {
	}	
	
	public String getEquipe() {
		return "Bianca";
	}
}
