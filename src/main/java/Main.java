public class Main {

    public static void main(String[] args) {

        int i;
//        int i; variables can't have the same name
        int I;
//        int 1a; variables can't start with numbers
//        int _1a; starting variables with "_" which is a bad coding practice
//        int $aq; using a "$" char, which is a bad coding practice

        i = 5;
        I = 10;

        final int j = 10;
//        j = 15; can't change a const variable value

        int quantidadeProduto = 50;
//        int QuantidadeProduto; bad coding practice first letter in uppercase
        final int NUMERO_TENTATIVAS = 5;
//        final int numeroTentativas = 5; constant bad practice, without "_" and uppercase in a constant
//        int NUMERO_TENTATIVAS = 25; a good use in constant variable, but not with a normal one
        int qtdProd = 10; // not wrong but can be better use of good practices

        System.out.println(i);
        System.out.println(I);
        System.out.println(j);
        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(qtdProd);

    }
}
