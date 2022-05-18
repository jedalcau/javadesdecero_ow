public class Decicsion06 {
    public static void main(String[] args) {
        int mes =9;
        int numDias =0;

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                numDias =28;
                break;
            default:
                System.out.printf("Mes no valido");
                break;
        }
        System.out.printf("Número de dias = " + numDias);
    }
}
