package menuView3;

import java.util.List;
import java.util.Scanner;

public class Orderbar extends Menu {
	Scanner sc = new Scanner(System.in);
	int key; // ����
	int no; // �޴� ��ȣ
	int amount; // ����
	int calculation; // ���
	double Point = 0;

	public void member() {// �ɹ�
		Point p = new Point();
		for (CoffeemenuDTO n : list) {
			System.out.println(n.toString());
		}

		do {
			do {
				// ����or����
				System.out.println("0.���� 1.����");
				key = sc.nextInt();
				if (key < 0 || key > 1) {
					System.out.println("�ٽ� �Է��� �ּ���");
				}
			} while (key < 0 || key > 1);
			if (key == 1) {
				// �޴�����
				System.out.print("�޴� ���� :");
				no = sc.nextInt();
//				if (no == 0 || no > 16) { // �׽�Ʈ
				if (no == 0 || no > list.size()) {
					System.out.println("���� �޴� �Դϴ�.");
					break;
				}
				System.out.print("���� :");
				amount = sc.nextInt();
			}
			if (key == 0) {
				break;
			}
			// �߰��ֹ�
			System.out.println("0.���� 1.�߰��ֹ�");
			key = sc.nextInt();
			if (key == 1) {
				member();
			}
//			calculation += list.get(no).getAmount() * amount;
			break;
		} while (key != 0);
		// ��꼱��
		System.out.println("1.ī�� 2.����");
		calculation = sc.nextInt();
		// ī����
		if (calculation == 1) {
			System.out.println("���Ǿ����ϴ�");
		}
		// ���ݰ��
		else if (calculation == 2) {
			System.out.print("�Ա� :");
			calculation = sc.nextInt();
			calculation = amount * no;
		}
		Point = p.Point(calculation);
	}
}