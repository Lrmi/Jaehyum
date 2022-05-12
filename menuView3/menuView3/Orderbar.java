package menuView3;

import java.util.List;
import java.util.Scanner;

public class Orderbar extends Menu {
	Scanner sc = new Scanner(System.in);
	int key; // 길
	int no; // 메뉴 번호
	int amount; // 수량
	int cash; // 현금
	int calculation; // 계산

	double Point = 0;

	public void member() {// 맴버
		Point p = new Point();
		for (CoffeemenuDTO n : list) {
			System.out.println(n.toString());
		}

		do { // 구매 or 나가기 버튼

			System.out.println("0.나가기 1.구매");
			key = sc.nextInt();
			if (key < 0 || key > 1) {
				System.out.println("다시 입력해 주세요");
			}
		} while (key < 0 || key > 1);
		// 완전탈출 만들기.
		// 메뉴선택
		System.out.print("메뉴 선택 :");
		no = sc.nextInt();
		if (no == 0 || no > 16) { // 테스트
//		if (no == list.size() || no > list.size()) {
			System.out.println("없는 메뉴 입니다.");
		}
		System.out.print("수량 :");
		amount = sc.nextInt();
//			}
		// 추가주문
		System.out.println("0.종료 1.추가주문");
		key = sc.nextInt();
		if (key == 1) {
			member();
//			calculation+=list.get(no).getAmount()*amount;
		}
		// 테스트
		System.out.println("총 금액 :" + no * amount);
//			calculation += list.get(no).getAmount() * amount;
		// 계산선택
		System.out.println("1.카드 2.현금");
		calculation = sc.nextInt();
		// 카드계산
		if (calculation == 1) {
			System.out.println("계산되었습니다");
		}
		// 현금계산
		else if (calculation == 2) {
			System.out.print("금액 :");
			cash = sc.nextInt();
			// 테스트
			System.out.println("거스름돈 : " + (cash - calculation));
		}
		Point = p.Point(calculation);
	}
}