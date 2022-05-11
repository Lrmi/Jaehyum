package menuView3;

import java.util.List;
import java.util.Scanner;

public class Orderbar extends Menu {
	Scanner sc = new Scanner(System.in);
	int key; // 선택
	int no; // 메뉴 번호
	int amount; // 수량
	int calculation; // 계산
	double Point = 0;

	public void member() {// 맴버
		Point p = new Point();
		for (CoffeemenuDTO n : list) {
			System.out.println(n.toString());
		}

		do {
			do {
				// 종료or구매
				System.out.println("0.종료 1.구매");
				key = sc.nextInt();
				if (key < 0 || key > 1) {
					System.out.println("다시 입력해 주세요");
				}
			} while (key < 0 || key > 1);
			if (key == 1) {
				// 메뉴선택
				System.out.print("메뉴 선택 :");
				no = sc.nextInt();
//				if (no == 0 || no > 16) { // 테스트
				if (no == 0 || no > list.size()) {
					System.out.println("없는 메뉴 입니다.");
					break;
				}
				System.out.print("수량 :");
				amount = sc.nextInt();
			}
			if (key == 0) {
				break;
			}
			// 추가주문
			System.out.println("0.종료 1.추가주문");
			key = sc.nextInt();
			if (key == 1) {
				member();
			}
//			calculation += list.get(no).getAmount() * amount;
			break;
		} while (key != 0);
		// 계산선택
		System.out.println("1.카드 2.현금");
		calculation = sc.nextInt();
		// 카드계산
		if (calculation == 1) {
			System.out.println("계산되었습니다");
		}
		// 현금계산
		else if (calculation == 2) {
			System.out.print("입금 :");
			calculation = sc.nextInt();
			calculation = amount * no;
		}
		Point = p.Point(calculation);
	}
}