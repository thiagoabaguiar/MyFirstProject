public class MyFirstClass {

    public static void main(String[] args) {

        final String COUNTRY = "Brazil";
        Integer anoFabricacao = 2022;
        Double idade = 10.5;
        String myName = "thiago";
        System.out.print(idade);

        // String primeiroNome = "Thiago";
        // String segundoNome = "Aguiar";
        // String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        // System.out.print(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
       
        return primeiroNome.concat(" ").concat(segundoNome);

    }

}