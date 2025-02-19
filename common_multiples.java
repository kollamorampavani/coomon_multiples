package loops;
import java.util.*;
public class common_multiples {
	public static void checkcommon(int a,int b,int n) {
		for(int i=1;i<=n;i++) {
		   if(i%a==0 && i%b==0) {
				System.out.println(i);
			}
				
				
			}
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a,b,n");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int n=scan.nextInt();
		checkcommon(a,b,n);
	}
}
