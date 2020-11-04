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
		if(!tomouDano()){
			setDirecao(geraDirecaoAleatoria());
		}
	}
	
	public void recebeuEnergia() {
		System.out.println(getId() + " ESTOU NO COGUMELO x= " + getX() + " y = " + getY());
		enviaMensagem("ganhandoVida");
	}
	
	public void tomouDano(int energiaRestanteInimigo) {
		System.out.println(getId() + " estou tomando dano aqui, x= " + getX() + " y = " + getY() + ", ini = " + energiaRestanteInimigo);
		enviaMensagem("tomandoDano");

	}

	
	public void ganhouCombate() {
	}
	
	public void recebeuMensagem(String msg) {
		if(msg.equals("tomandoDano")){
			setDirecao(getDirecao());

		}
		if(msg.equals("ganhandoVida")){
			setDirecao(getDirecao());
		}
	}		
	
	public String getEquipe() {
		return "EquipeKakashi";
	}
}
