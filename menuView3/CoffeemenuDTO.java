package menuView3;

public class CoffeemenuDTO {
	private String no ; //��ȣ
	private String menu; //�޴�
	private int price; //����
	private int amount; // ����
	private int kcal; //Į�θ�
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
		return "�޴�["+no +"." +menu +", Į�θ�=" +kcal +",����="+amount+",���� ="+price+"]";
	}
}
	
	

	