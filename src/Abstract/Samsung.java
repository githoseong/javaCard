package Abstract;

public class Samsung extends Phone {

	public Samsung(String owner) {
		super(owner);
	}

	public void bell() {
		System.out.println(owner+"의 벨소리는 삐리리링");
	
	}
	public void design() {
		System.out.println(owner+"의 디자인은 슬림");
	};
}
