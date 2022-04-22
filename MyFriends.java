package chapter16;
class UnivFriend{
	private String name;
	private String major;
	private String phone;
	
	public UnivFriend(String na, String ma, String ph) {
		name =na;
		major = ma;
		phone =ph;
	}
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + major);
		System.out.println("��ȭ : " + phone);
	}
}
class CompFrind{
	private String name;
	private String department;
	private String phone;
	
	public CompFrind(String na, String de, String ph) {
		name =na;
		department = de;
		phone = ph;
	}
	public void showInfo() {
		System.out.println("�̸�: " +name);
		System.out.println("�μ�: " +department);
		System.out.println("��ȭ: " +phone);
	}
}

public class MyFriends {
	public static void main(String[] args) {
		UnivFriend[] ufrns= new UnivFriend[5];
		int ucnt = 0;
		CompFrind[] cfrns = new CompFrind[5];
		int ccnt = 0;
		
		ufrns[ucnt++] = new UnivFriend("LEE","Computer","010-333--555");
		ufrns[ucnt++] = new UnivFriend("SEO","Electornics", "010-222-444");
		
		cfrns[ccnt++] = new CompFrind("YOON", "R&D1", "02-123-999");
		cfrns[ccnt++] = new CompFrind("PARK","R&D2","02-321-777");
		
		for(int i =0; i<ucnt; i++) {
			ufrns[i].showInfo();
			System.out.println();
		}
		for(int i = 0; i< ccnt; i++) {
			cfrns[i].showInfo();
			System.out.println();
		}
		}
}
