//Alunas: Bianca Gabriela Fritsch
//        Eweline Elen Torjan
package br.uffs.cc.jarena;

public class AgenteUzumaki extends Agente {

    public AgenteUzumaki(Integer x, Integer y, Integer energia) {
        super(x, y, energia);
        setDirecao(geraDirecaoAleatoria());
    }

    

    public void pensa() {

        andaAleatorio();
        movimentoInicial();
        andaAleatorio();

    }

    public void recebeuEnergia() {
        para();
        System.out.println(getX() + "," + getY());
        String px = Integer.toString(getX());
        String py = Integer.toString(getY());
        enviaMensagem(px + "," + py);
    }

    public void tomouDano(int energiaRestanteInimigo) {
        if (this.getEnergia() > energiaRestanteInimigo) {
            //para();
            System.out.println("Agente inimigo estah tomando dano. Yeey");
            System.out.println("Minha energia " + getEnergia());
            if(this.getEnergia() <= 500){
                String px = Integer.toString(getX());
                String py = Integer.toString(getY());
                enviaMensagem(px + "," + py);
            }
        } else {
            setDirecao(geraDirecaoAleatoria());
            System.out.println("Agente: " + getId() + "estah tomando pipoco entao vai fugir");
        }
    }

    public void movePara(int x, int y) {
        if (getX() > x) {
            setDirecao(ESQUERDA);
        } 
        else if (getX() < x) {
            setDirecao(DIREITA);
        } 
        else if (getY() > y) {
            setDirecao(CIMA);
        } 
        else if (getY() < y) {
            setDirecao(BAIXO);
        }
    }

    public void andaAleatorio(){
        if ((!podeMoverPara(getDirecao())) || (isParado())) {
            setDirecao(geraDirecaoAleatoria());
        }
    }

    public void movimentoInicial(){
       // posição inicial primeiro comando
        if (this.getX() == 0 && this.getY() == 0) {
            setDirecao(BAIXO);
        }else if (this.getX() == 0 && this.getY() == (Constants.ALTURA_TELA * 0.95)) {
            setDirecao(CIMA);  
        }else if (this.getX() == (Constants.LARGURA_TELA * 0.95) && this.getY() == 0) {
            setDirecao(BAIXO);
        }else if (this.getX() == (Constants.LARGURA_TELA * 0.95) && this.getY() == (Constants.ALTURA_TELA * 0.95)) {
            setDirecao(CIMA);
        }
        
         // nascimento x = 0 e y = 0 ou 660
        if ((this.getX() >= 0 && this.getX() <= 50) && (this.getY() == (Constants.ALTURA_TELA * 0.25) || this.getY() == (Constants.ALTURA_TELA * 0.75))){
            setDirecao(DIREITA);
        }
        if(this.getX() == Constants.LARGURA_TELA * 0.25 ){
            setDirecao(geraDirecaoAleatoria());
        }

        // nascimento x = =-860 e y = 0 ou 660
        if ( this.getX() == (Constants.LARGURA_TELA * 0.95) && (this.getY() == Constants.ALTURA_TELA * 0.25 || this.getY() == Constants.ALTURA_TELA * 0.75)){
            setDirecao(ESQUERDA);    
        }
        if(this.getX() == Constants.LARGURA_TELA * 0.75 ){
            setDirecao(geraDirecaoAleatoria());
        }
    }
    

    public void ganhouCombate() {
        System.out.println(getX() + "," + getY() + " MATAMO! ");
        System.out.println("Minha Energia que ganhei: " + getEnergia() + ", id: " + getId());
        String px = Integer.toString(getX());
        String py = Integer.toString(getY());
        enviaMensagem(px + "," + py + ", Ganhemo daih!");
    }

    public void recebeuMensagem(String msg) {
        String[] Coordenadas = msg.split(",");
        int X = Integer.parseInt(Coordenadas[0]);
        int Y = Integer.parseInt(Coordenadas[1]);
        //System.out.println("ENERGIA OU MORTE!");
        movePara(X, Y);
    }

    public String getEquipe() {
        return "Equipe Bianca & Eweline";
    }
}
