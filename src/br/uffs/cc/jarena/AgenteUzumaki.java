//Alunas: Bianca Gabriela Fritsch
//        Eweline Elen Torjan
package br.uffs.cc.jarena;

public class AgenteUzumaki extends Agente {

    public AgenteUzumaki(Integer x, Integer y, Integer energia) {
        super(x, y, energia);
        setDirecao(geraDirecaoAleatoria());
    }

    public void pensa() {
        /*if (podeDividir() && getEnergia() >= 800) {
            divide();
        }
        */
        //decidimos tirar a parte em que se dividem, pois não perdiam muita energia
        if (!podeMoverPara(getDirecao()) || (isParado())){
            setDirecao(geraDirecaoAleatoria());
        }

        // seção de comandos para os agentes andarem mais no meio da tela
        if (this.getX() == 0 && this.getY() == 0) {
            setDirecao(DIREITA);
        }
        else if (this.getX() == 80 && this.getY() == 0) {
            setDirecao(BAIXO);
        }

        else if (this.getX() == 80 && this.getY() == 480) {
            setDirecao(DIREITA);
        }
        else if (this.getId() < 22 && this.getX() == 600) {
            setDirecao(CIMA);
        }
        else if (this.getId() < 22 && this.getX() == 600 && getY() == 120) {
            setDirecao(ESQUERDA);
        }

        else if (this.getId() > 22 && this.getX() == 120) {
            setDirecao(CIMA);
        }
        else if (this.getId() > 22 && this.getX() == 120 && getY() == 260) {
            setDirecao(DIREITA);
        }
        else if (this.getId() > 22 && this.getX() == 470 && getY() == 260) {
            setDirecao(BAIXO);
        }

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
            System.out.println("Agente inimigo: " + getId() + "está tomando dano. Yeey");
        } 
        else {
            setDirecao(geraDirecaoAleatoria());
            System.out.println("Agente: " + getId() + "está tomando pipoco então vai fugir");
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

    public void ganhouCombate() {
        enviaMensagem("Ganhemo");
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