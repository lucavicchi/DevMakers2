package Mod1_LogicaProgramacao;

public class Class2Ex5 {

    public static void main(String[] args){

        double divida = 10000.0;
        double aplicacao = 1500.0;
        int mes = 0;

        while(divida > aplicacao){
            divida = divida + (divida * 0.025);
            aplicacao = aplicacao + (aplicacao * 0.04);
            mes++;
        }
        System.out.println("A quantidade de meses necessários é: " + mes);
        System.out.println("Ou, aproximadamente, " + mes / 12 + " anos");
    }
}
