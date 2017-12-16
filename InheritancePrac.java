class Parent{
	public int i = 10;
}

class Child extends Parent{
	public int a;
	public int b;
	public Child(int a, int b){
		this.a = a;
		this.b = b;
	}
}

class InheritancePrac{
	public static void main(String[] args){
		Parent p = new Child(10, 20);
		System.out.println(p.a + ", "+ p.b);
	}
}