//Alunas: Bianca Gabriela Fritsch
//        Eweline
package br.uffs.cc.jarena;

public class AgenteUzumaki extends Agente{
  public AgenteUzumaki(Integer x, Integer y, Integer energia) {
		super(x, y, energia);
		int count = 0;
		Boolean chegouDestino = false;
		Boolean parar = false;
		int grupo = this.getId() % 5;
	}
	
	public void pensa() {
		System.out.println("ID: " + this.getId() + "grupo: " + this.grupo);
		System.out.println("PosX: " + this.getX() + "PosY: " + this.getY());
		this.count++;
	}
	
	public void recebeuEnergia() {
	/*	System.out.println(getId() + " ESTOU NO COGUMELO x= " + getX() + " y = " + getY());
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
*/
	
	public String getEquipe() {
		return "Equipe Bianca & Eweline";
	}
}
