// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 27.0;

       if(valorSolicitado < saldo){
        saldo = saldo - valorSolicitado;
        

        System.out.println("Seu saldo é " + saldo);
        
       }else
        System.err.println("Seu saldo é insuficiente!");
    }
}