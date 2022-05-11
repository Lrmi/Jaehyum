package menuView3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import menuView3.CoffeemenuDTO;;

public class Orderbar extends Menu{
	Scanner sc = new Scanner(System.in);
	int menu  = 0;//메뉴
	int quantity = 0;// 수량
	int calculation;// 계산
	int card;// 카드
	int cash;// 현금
	double point = 0; //포인트
	public void member () {//맴버
		//다시.
		for(CoffeemenuDTO n: list) {
			System.out.println(n.toString());
		}
		int key; //선택or종료
		Point m = new Point();
		do {
			//다시묻게끔바꾸기 string int
			System.out.println("1:선택 2:종료 ");
			key = sc.nextInt();
			if(key <= 0 || key >= 3) {
				System.out.println("다시입력해주세요");
			}
		}while(key <= 0 || key >= 3) ;
			
				do {
					switch (key) {
					//추가선택 필요
					case 1:System.out.print("메뉴 선택 :");
					menu = sc.nextInt();
					
					
//					if(menu <= 0 || menu >=16) {//지정다시 사이즈로.
						System.out.println("없는 메뉴 입니다.");
						break;
					}
						
					System.out.print("수량 :");
					quantity = sc.nextInt();
					break;
//					System.out.println("종료");
//					break;
//					빠져나올거 만들기.
//				}while(menu <= 0 || menu >= 16); //지정다시 사이즈로
		
//				calculation += list.get(menu).getAmount() * quantity  ; 반복문안에넣기
//		System.out.println("총금액: " + quantity *menu );
				//카드 계산
			System.out.println("1.카드  2.현금"); //선택
			card = sc.nextInt();
			
		if(card == 1) {
				System.out.println("계산되었습니다");
				point = m.Point(calculation);
				//현금계산
		}else if(card >0){
			System.out.println("입금액");
			cash = sc.nextInt();
//			calculation //입금액있게
			System.out.println("계산되었습니다.");
			point = m.Point(calculation);
		}
				}
	}
			
		
	public void guest() {// 게스트
		for(CoffeemenuDTO n: list) {
			System.out.println(n.toString());
		}
		int key; //선택or종료
		Point m = new Point();
		do {
			
			System.out.println("1:선택 2:종료 ");
			key = sc.nextInt();
			if(key <= 0 || key >= 3) {
				System.out.println("다시입력해주세요");
			}
		}while(key <= 0 || key >= 3) ;
			
			do {
				do {
					
				switch (key) {
				case 1:System.out.print("메뉴 선택 :");
				menu = sc.nextInt();
				if(menu <= 0 || menu >=16) {
					System.out.println("없는 메뉴 입니다.");
					break;
				}
				System.out.print("수량 :");
				quantity = sc.nextInt();
				break;
				
				}if(key == 2) {
					System.out.println("종료");
					break;
				}
				}while(menu <= 0 || menu >= 16);
//		System.out.println("총금액: " + quantity *menu );
				calculation += list.get(menu).getAmount() * quantity  ;
		//카드 계산
		
			System.out.println("1.카드  2.현금"); //선택
			card = sc.nextInt();
			
		if(card <= 1) {
				System.out.println("계산되었습니다");
				point = m.Point(card);
				//현금계산
		}else if(card >0){
			System.out.println("입금액");
			cash = sc.nextInt();
			System.out.println("거스름돈:" +  (cash -(quantity * menu)));
			System.out.println("계산되었습니다.");
			point = m.Point(calculation);
		}else if (calculation < -1) {
			System.out.println("금액이 부족합니다.");
		}
			}while(key == 2); //종료
}
}