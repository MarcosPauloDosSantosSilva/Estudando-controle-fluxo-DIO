public class SistemaMedida {

    public static void main(String[] args) {

        String singra = "G";

        switch (singra) {
            case "P": {
                System.out.println("Pqueno");
                break;
            }

            case "M": {
                System.out.println("Medio");
                break;
            }

            case "G": {
                System.out.println("Grande");
                break;
            }

            default:
                System.out.println("Tamanho indefinido");

        }

    }

}
