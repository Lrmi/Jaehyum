package menuView3;

public class CoffeemenuDTO {
	private String menu; //메뉴
	private int amount; //가격
	private int kcal; //칼로리
	private int no = 0; //번호
	
	public int getNo() {
		return no ;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	@Override
	public String toString() {
		return "메뉴["+no +"." +menu +", 칼로리=" +kcal +",가격="+amount+"]";
	}
}
	
	

	