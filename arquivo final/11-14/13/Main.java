/******************************************************************************
Questão 13

*******************************************************************************/

interface Veiculo {
    void acelerar();
    void frear();
}

class Carro implements Veiculo {
    private int velocidade;

    public Carro() {
        this.velocidade = 0;
    }

    @Override
    public void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        if (velocidade >= 10) {
            velocidade -= 10;
        } else {
            velocidade = 0;
        }
        System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
    }
    
}


public class Main
{
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.frear();
        meuCarro.frear(); 
    }
}
