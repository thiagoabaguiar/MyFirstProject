public class MyFirstClass {

    public static void main(String[] args) {

        // final String COUNTRY = "Brazil";
        // Integer anoFabricacao = 2022;
        // Double idade = 10.5;
        // String myName = "thiago";
        // System.out.print(idade);

        // String primeiroNome = "Thiago";
        // String segundoNome = "Aguiar";
        // String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        // System.out.print(nomeCompleto);
        
        // String concatenacao = "1"+1+("4"+(1+2));
        // System.out.println(concatenacao);

        // Double salario = 10.5;
        // salario++;
        // System.out.println(salario);

        String numero1 = "3";
        String numero2 = "4";

        boolean resultado = numero1.equals(numero2);

        System.out.println(resultado);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
       
        return primeiroNome.concat(" ").concat(segundoNome);

    }

}