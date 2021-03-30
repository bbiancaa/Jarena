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

        // seção de comandos para os agentes andarem mais no meio da tela
        if (this.getX() == 0 && (this.getY() == 0 || this.getY() == 660)) {
            setDirecao(DIREITA);
        }
        if (this.getX() == 860 && (this.getY() == 0 || this.getY() == 660)) {
            setDirecao(ESQUERDA);
        }
        

        if (this.getX() == 80 && this.getY() == 660) {
            setDirecao(CIMA);
        }
        if (this.getX() == 80 && this.getY() == 0) {
            setDirecao(BAIXO);
        }
        if (this.getX() == 780 && this.getY() == 660) {
            setDirecao(CIMA);
        }
        if (this.getX() == 780 && this.getY() == 0) {
            setDirecao(BAIXO);
        }

        
        // seção de comandos para o nascimento em x = 0
        if (this.getId() < 22 && this.getX() == 80 && this.getY() == 180) {
            setDirecao(DIREITA);
        }
        if (this.getId() < 22 && this.getX() == 440 && this.getY() == 180) {
            setDirecao(BAIXO);
        }
        if (this.getId() < 22 && this.getX() == 440 && this.getY() == 500) {
            setDirecao(ESQUERDA);
        }else if(this.getId() < 22 && this.getX() == 70 && this.getY() == 500){
            setDirecao(DIREITA);
        } 

        if (this.getId() > 22 && this.getX() == 80 && this.getY() == 480) {
            setDirecao(DIREITA);
        }

        if (this.getId() > 22 && this.getId() < 30 && this.getX() == 120) {
            setDirecao(CIMA);
        }
        if (this.getId() > 22 && this.getId() < 30 && this.getX() == 120 && getY() == 140) {
            setDirecao(DIREITA);
        }

        if (this.getId() > 30 && this.getX() == 360 && this.getY() == 480) {
            setDirecao(CIMA);
        }
        if (this.getId() > 30 && this.getX() == 360 && this.getY() == 100) {
            setDirecao(ESQUERDA);
        }

        // comandos para nascimento em x = 860
        if (this.getId() < 22 && this.getX() == 780 && this.getY() == 190) {
            setDirecao(ESQUERDA);
        }
        if (this.getId() < 22 && this.getX() == 340 && this.getY() == 190) {
            setDirecao(BAIXO);
        }
        if (this.getId() < 22 && this.getX() == 340 && this.getY() == 400) {
            setDirecao(DIREITA);
        }

        if (this.getId() > 22 && this.getX() == 780 && this.getY() == 480) {
            setDirecao(ESQUERDA);
        }

        if (this.getId() > 22 && this.getId() < 30 && this.getX() == 320) {
            setDirecao(CIMA);
        }
        if (this.getId() > 22 && this.getId() < 30 && this.getX() == 120 && getY() == 140) {
            setDirecao(DIREITA);
        }

        if (this.getId() > 30 && this.getX() == 360 && getY() == 480) {
            setDirecao(CIMA);
        }
        if (this.getId() > 30 && this.getX() == 360 && getY() == 100) {
            setDirecao(ESQUERDA);
        }


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
        if (getEnergia() > energiaRestanteInimigo) {
            para();
            System.out.println("Agente inimigo estah tomando dano. Yeey");
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

    public void ganhouCombate() {
        //enviaMensagem("Ganhemo daih");
        System.out.println(getX() + "," + getY() + " MATAMO! ");
        String px = Integer.toString(getX());
        String py = Integer.toString(getY());
        enviaMensagem(px + "," + py + ", Ganhemo daih!");
    }

    public void recebeuMensagem(String msg) {
        String[] Coordenadas = msg.split(",");
        int X = Integer.parseInt(Coordenadas[0]);
        int Y = Integer.parseInt(Coordenadas[1]);
        System.out.println("Sendo energizados aqui!!");
        movePara(X, Y);
    }

    public String getEquipe() {
        return "Equipe Bianca & Eweline";
    }
}
