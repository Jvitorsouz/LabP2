public class BicicletaDeMarcha extends Bicicleta{

    private int numMarchas;
    private int marchaAtual;

    public BicicletaDeMarcha(double velocidadeMaxima, String modelo, int numMarchas){
        super(velocidadeMaxima, modelo);
        this.numMarchas = numMarchas;
        marchaAtual = 1;
    }

    @Override
    public void acelera(){
        super.velocidadeAtual = (super.getVelocidadeAtual() + (marchaAtual/3.0) > super.getVelocidadeMaxima()) ? super.getVelocidadeMaxima() : super.getVelocidadeAtual() + (marchaAtual/3.0);
	}    

    @Override
    public void desacelera(){
        super.velocidadeAtual = (super.getVelocidadeAtual() - (marchaAtual/3.0) < 0) ? 0 : super.getVelocidadeAtual() - (marchaAtual/3.0);
    }

    @Override
    public String toString(){
        return super.toString() + " marchas: " + numMarchas;
    }
}