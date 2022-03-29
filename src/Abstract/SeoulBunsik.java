package Abstract;

public class SeoulBunsik extends Bonsa{

	public SeoulBunsik() {
		super(5000, 5000, 5000, 4000, 0);
	}
	
	public void kimchi () {
		System.out.println("김치찌개 : "+kimchi+"원");
	}
	public void budae () {
		System.out.println("부대찌개 : "+budae+"원");
	}
	public void bibim () {
		System.out.println("비빔밥 : "+bibim+"원");
	}
	public void sundae () {
		System.out.println("순대국밥 : "+sundae+"원");
	}
	public void rices () {
		System.out.println("공기밥 : "+rice+"원");
	}
}
