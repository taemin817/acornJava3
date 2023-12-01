package annotation.prc;

public class Ex {
	@Count(count = 2)
	private int apple;

	public Ex(int apple) {
		super();
		this.apple = apple;
	}

	@Override
	public String toString() {
		return "Ex [apple=" + apple + "]";
	}
	
}
