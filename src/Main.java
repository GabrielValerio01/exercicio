public class Main {
    public static void main(String[] args){
        int fatorial = 10;
        int result = fatorial;

        for(int i = 1; i <= fatorial; i++){
            result = result * i;
        }

        System.out.println("!" + fatorial + " = " + result);
    }
}