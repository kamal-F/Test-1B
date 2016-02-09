
public class Test {

	private int k;
	
	public static void main(String[] args) {
		int i = 0;		

		while (i<10) {
			System.out.println("ok" + i);
			i++;
		}
		
		Test ObjT = new Test();
		ObjT.setK(100);
		System.out.println(ObjT.getK());

	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

}
