public class Banco_projeto {
    private double saldoBanco;

    public Banco_projeto(){
        this.saldoBanco=0;
    }

    public double saldo(){
        return saldoBanco;
    }
    public int deposito(double valor){
        if(valor<=0){
            return 0;
        }
        else{
            saldoBanco+=valor;
            return 1;
        }
    }

}
