public class Calculadora {

    public static void main(String[] args) {

        if(args.length !=3){
            System.out.println("Por favor ingresar una operación (suma,resta,multi,div) y dos enteros");
            System.exit(-1);
        }

        String opc = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double r = 0.0;

        switch (opc) {
            case "suma":
                r = a + b;
                break;
            case "resta":
                r = a - b;
                break;
            case "multi":
                r = a * b;
                break;
            case "div":
                if(b == 0){
                    System.err.println("No se puede dividir por zero!");
                    System.exit(-1);
                }
                r = (double) a / b;
                break;
            default:
                r = a + b;
        }

        System.out.println("Resultado = " + r);

    }
}