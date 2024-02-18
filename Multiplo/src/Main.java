import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
Scanner sc =  new Scanner (System.in);

System.out.println("Informe dois números para saber se são multiplos: ");
int a = sc.nextInt();
int b = sc.nextInt();

if (a%b==0) {
	System.out.println("São multiplos");
}else if (b%a==0){
	System.out.println("São multiplos");
}else {
	System.out.println("Não são multiplos");

}
	}

}
