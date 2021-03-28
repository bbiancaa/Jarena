//Alunas: Bianca Gabriela Fritsch
//        Eweline
package br.uffs.cc.jarena;

public class AgenteUzumaki extends Agente{
	int count = 0;
	Boolean chegouDestino = false;
	Boolean parar = false;
	int grupo = this.getId() % 5;

  public AgenteUzumaki(Integer x, Integer y, Integer energia) {
		super(x, y, energia);
		
	}
	
	public void pensa() {
		//System.out.println("ID: " + this.getId() + "grupo: " + this.grupo);
		//System.out.println("PosX: " + this.getX() + "PosY: " + this.getY());
		
		/*
		this.count++;
		if(count % 5 == 0){
			this.parar = false;
		}
		if(parar){
			setDirecao(this.NENHUMA_DIRECAO);
			return;
		}
		*/


		// seção de comandos para os agentes andarem mais no meio da tela
		if(this.getX() == 0 && this.getY() == 0){
            setDirecao(DIREITA);
        }
        if(this.getX() == 80 && this.getY() == 0){
            setDirecao(BAIXO);
        }

        if(this.getX() == 80 && this.getY() == 480){
            setDirecao(DIREITA);
        }
        if(this.getId() < 22 && this.getX() == 600){
            setDirecao(CIMA);
        }
        if(this.getId() < 22 && this.getX() == 600 && getY() == 120){
            setDirecao(ESQUERDA);
        }

        if(this.getId() > 22 && this.getX() == 120){
            setDirecao(CIMA);
        }
        if(this.getId() > 22 && this.getX() == 120 && getY() == 260 ){
            setDirecao(DIREITA);
        }
        if(this.getId() > 22 && this.getX() == 470 && getY() == 260){
            setDirecao(BAIXO);
        }
        
        
        
        
        /*
        if(this.getId() > 20 && this.getY() == 300 ){
            setDirecao(DIREITA);
        }
        if(this.getId() < 20 && this.getY() == 200 ){
            setDirecao(DIREITA);
        }

        // id até 14 depois de ter ido até y = 200
        if(this.getId() < 14 && this.getX() == 570 ){
            setDirecao(BAIXO);
        }
        // id até 14 depois de ter ido até y = 200 e x até 570 e desceu
        if(this.getId() < 14 && this.getY() == 600 ){
            setDirecao(ESQUERDA);
        }

        // id de 14 até 20 depois de ter ido até y = 200
        if(this.getId() > 14 && this.getId() <20 && this.getX() == 330 ){
            setDirecao(BAIXO);
        }
        // id de 14 até 20 depois de ter ido até y = 200 e x até 330 e desceu
        if(this.getId() > 14 && this.getId() <20 && this.getY() == 430 ){
            setDirecao(ESQUERDA);
        }

        // id de 20 até 28 depois de ter ido até y = 300
        if(this.getId() > 20 && this.getId() < 28 && this.getX() == 200 ){
            setDirecao(CIMA);
        }
        // id de 20 até 28 depois de ter ido até y = 300 x = 200 e subiu
        if(this.getId() > 20 && this.getId() < 28 && this.getY() == 470){
            setDirecao(DIREITA);
        }

        // id até 28 depois de ter ido até y = 400
        if(this.getId() > 28 && this.getX()  == 660 ){
            setDirecao(CIMA);
        }
        // id até 28 depois de ter ido até y = 400 e x = 600 e subiu
        if(this.getId() > 28 && this.getY()  == 540 ){
            setDirecao(CIMA);
        }
        */


        
        

        /*if(this.isParado()){
            setDirecao(DIREITA);
        }*/

        /*if(this.getX() == 50 ){
            setDirecao(BAIXO);
        }
        if(this.getY() == 50){
            setDirecao(DIREITA);
        }
        if(this.getX() == 0 && this.getY() == 0){
            setDirecao(ESQUERDA);
        }
        if(this.getId() > 26 && this.getX() == 200 ){
            setDirecao(BAIXO);
        }
        if(this.getId() < 26 && this.getX() == 300 && getY() == 400){
            setDirecao(CIMA);
        }
        */
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
		return "Equipe Bianca & Eweline";
	}
}
