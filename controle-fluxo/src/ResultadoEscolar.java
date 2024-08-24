public class ResultadoEscolar {

    public static void main(String[] args) {

        int nota = 7;

        // if (nota >= 7)

        // System.out.println("Aprovando");

        // else if (nota >= 5 && nota < 7)

        // System.out.println("Prova de recuperação");

        // else
        // System.out.println("Reprovado");

        // codição ternaria;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperaçao" : "Reprovado";

        System.out.println("Voce esta: " + resultado);
    }

}
