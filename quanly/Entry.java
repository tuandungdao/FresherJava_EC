package quanly;

import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		ManageCB manageCB = new ManageCB();

		while (true) {
			System.out.println("QLCB: ");
			System.out.println("Enter 1: To insert CanBo");
			System.out.println("Enter 2: To search name: ");
			System.out.println("Enter 3: To display information");
			System.out.println("Enter 4: To exit");
			String line = scanner.nextLine();

			switch (line) {
			case "1": {
				System.out.println("Enter a: CongNhan");
				System.out.println("Enter b: KySu");
				System.out.println("Enter c: NhanVien");
				String type = scanner.nextLine();
				switch (type) {
				case "a": {
					System.out.print("Enter name: ");
					String name = scanner.nextLine();
					System.out.print("Enter age: ");
					int age = scanner.nextInt();
					System.out.print("Enter gender: ");
					scanner.nextLine();
					String gender = scanner.nextLine();
					System.out.print("Enter address: ");
					String address = scanner.nextLine();
					System.out.print("Enter level: ");
					int level = scanner.nextInt();
					CanBo cn = new CongNhan(name, age, gender, address, level);
					manageCB.addCanBo(cn);
					System.out.println(cn.toString());
					break;
				}
				case "b": {
					System.out.print("Enter name: ");
					String name = scanner.nextLine();
					System.out.print("Enter age:");
					int age = scanner.nextInt();
					System.out.print("Enter gender: ");
					scanner.nextLine();
					String gender = scanner.nextLine();
					System.out.print("Enter address: ");
					String address = scanner.nextLine();
					System.out.print("Enter major: ");
					String major = scanner.nextLine();
					CanBo ks = new KySu(name, age, gender, address, major);
					manageCB.addCanBo(ks);
					ks.display();
					break;
				}
				case "c": {
					System.out.print("Enter name: ");
					String name = scanner.nextLine();
					System.out.print("Enter age:");
					int age = scanner.nextInt();
					System.out.print("Enter gender: ");
					scanner.nextLine();
					String gender = scanner.nextLine();
					System.out.print("Enter address: ");
					String address = scanner.nextLine();
					System.out.print("Enter job: ");
					String job = scanner.nextLine();
					CanBo nv = new NhanVien(name, age, gender, address, job);
					manageCB.addCanBo(nv);
					nv.display();
					break;
				}
				default:
					System.out.println("Invalid");
					break;
				}
				break;
			}

			case "2": {
				System.out.print("Enter name to search: ");
				String name = scanner.nextLine();
				manageCB.searchName(name).forEach(cb -> {
					cb.display();
				});
				break;
			}

			case "3": {
				manageCB.displayInfor();
				break;
			}

			case "4": {
				return;
			}
			
			default:
				System.out.println("Invalid");
				continue;
			}

		}
	}

}
