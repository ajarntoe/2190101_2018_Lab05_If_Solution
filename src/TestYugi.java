
public class TestYugi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YugiOhCard a = new YugiOhCard("Blue-eyes", 8, 3000, 2500);
		YugiOhCard b = new YugiOhCard("Blue-eyes", 8, 3000, 2500);
		YugiOhCard c = new YugiOhCard("Blue-eyess", 8, 3000, 2500);
		YugiOhCard d = new YugiOhCard("Blue-eyes", 7, 3000, 2500);
		YugiOhCard e = new YugiOhCard("Blue-eyes", 8, 2000, 2500);
		YugiOhCard f = new YugiOhCard("Blue-eyes", 8, 3000, 3000);
		YugiOhCard g = new YugiOhCard("Blue-eyes", 8, 3000, 3000);
		
		System.out.println("a and b are equal?: " + (a.equals(b)));
		System.out.println("a and c are equal?: " + (a.equals(c)));
		System.out.println("a and d are equal?: " + (a.equals(d)));
		System.out.println("a and e are equal?: " + (a.equals(e)));
		System.out.println("a and f are equal?: " + (a.equals(f)));
		System.out.println("f and g are equal?: " + (f.equals(g)));
		a=b;
		System.out.println("a and b are equal after assignment?: " + (a.equals(b)));
		
		
	}

}
