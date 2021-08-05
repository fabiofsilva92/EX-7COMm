public class Main {

    public static void main(String[] args) {
        menosPerformatico();
        maisPerformatico();
    }

    public static void maisPerformatico(){
        int valorDivisivel = 20; // iniciado em 20 pois é o delimitador do teste

        long inicio = System.currentTimeMillis();

        while(true){ //ignorado a divisão por 1 pois todos números são divisiveis por 1.
            if((valorDivisivel%2==0) &&(valorDivisivel%3==0) &&(valorDivisivel%4==0) &&
                    (valorDivisivel%5==0) &&(valorDivisivel%6==0) &&(valorDivisivel%7==0) &&
                    (valorDivisivel%8==0) &&(valorDivisivel%9==0) &&(valorDivisivel%10==0) &&
                    (valorDivisivel%11==0) &&(valorDivisivel%12==0) &&(valorDivisivel%13==0) &&
                    (valorDivisivel%14==0) &&(valorDivisivel%15==0) &&(valorDivisivel%16==0) &&
                    (valorDivisivel%17==0) &&(valorDivisivel%18==0) &&(valorDivisivel%19==0) &&
                    (valorDivisivel%20==0)){
                System.out.println("Valor divisivel de 1 a 20 com resto zero: "+valorDivisivel); //R:232792560
                break;
            }
            valorDivisivel++;
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo para execução: "+ (fim-inicio)+" milisegundos");

        Integer num = 5555;

        System.out.println(num.hashCode(1));
    }

    public static void menosPerformatico(){
        long inicio = System.currentTimeMillis();
        int contador = 20;
        int limitador = 0;
        boolean verificador = true;

        while(verificador){
            for(int i = 1; i<=20; i++){

                if(contador % i == 0){
                    limitador++;
                    if(limitador == 20){
                        System.out.println("Valor divisivel de 1 a 20 com resto zero: "+contador); //R:232792560
                        verificador = false;
                    }
                }else {
                    i = 21;
                }
            }
            if(verificador) {
                contador++;
                limitador = 0;
            }
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo para execução: " + (fim-inicio));

    }
}
