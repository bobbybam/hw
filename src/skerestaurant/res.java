package skerestaurant;
import java.util.Scanner;
public class res {

		public static void main(String[] args) {
			System.out.println("---- Welcome to SKE restaurant ----");
			System.out.printf("1.) Pizza\t %5d Baht.%n", 250);
			int pizza = 0;
			System.out.printf("2.) Chickens\t %5d Baht.%n", 120);
			int chicken = 0;
			System.out.printf("3.) Coke\t %5d Baht.%n", 45);
			int coke = 0;
			System.out.println("4.) Total");
			System.out.println("5.) Exit");
			Scanner res = new Scanner(System.in);
			int price = 0;
			int ppiz = 0;
			int quapiz = 0;
			int pchic = 0;
			int quachic = 0;
			int pcoke = 0;
			int quacoke = 0;
			while (true) {
				System.out.print("\nEnter your choice: ");
				int num = res.nextInt();
				if (num == 1) {
					System.out.print("Enter your Quatity: ");
					quapiz = res.nextInt();
					ppiz += 250 * quapiz;
					pizza += ppiz;
				} else {
					if (num == 2) {
						System.out.print("Enter your Quatity: ");
						quachic = res.nextInt();
						pchic += 120 * quachic;
						chicken += pchic;
					} else {
						if (num == 3) {
							System.out.print("Enter your Quatity: ");
							quacoke = res.nextInt();
							pcoke += 45 * quacoke;
							coke += pcoke;
						} else {
							if (num == 4) {
								System.out.println("+----- Menu -----+-- Qty --+-- Price --+");
								if (quapiz > 0) {
									System.out.printf("|Pizza\t\t |   %5d |     %5d |\n",quapiz,ppiz );
								}
								if (quachic > 0) {
									System.out.printf("|Chickens\t |   %5d |     %5d |\n",quachic,pchic );
								}
								if (quacoke > 0) {
									System.out.printf("|Coke\t\t |   %5d |     %5d |\n",quacoke,pcoke );
								}
								price = ppiz + pchic + pcoke;
								System.out.println("+--------------------------+-----------+");
								System.out.printf("|Total\t\t\t   |     %5d |\n" ,price);
								System.out.println("+--------------------------+-----------+");
							} else {
								if (num == 5) {
									System.out.println("===THANK YOU===");
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
