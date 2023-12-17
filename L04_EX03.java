import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int n, mult=1, i=0;
    do{
      i++;
      System.out.println("Digite o número "+i+":");
      n = leia.nextInt();
      mult = mult*n;
    }while(n!=1);
    System.out.println("O produto de todos os números será "+mult);
  }
}