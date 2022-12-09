package assignment3;

class Box<T>{
	T x;
	Box(T x){
		this.x = x;
	}
	void setx(T x) {
		this.x = x;
	}
	T getx() {
		return x;
	}
}
public class A3Q4 {
	
	public static void main(String[] args) {
		Box<String> str1 = new Box <String>("Abhi");
		Box<String> a = str1;
		Box<String> b = str1;
		b.setx("Jeet");
		System.out.println(a.getx() + " " + b.getx());
		Box<Integer> int1 = new Box <Integer>(15);
		Box<Integer> c = int1;
		Box<Integer> d = int1;
		d.setx(20);
		System.out.println(c.getx() + " " + d.getx());
		Box<Object> obj1 = new Box <Object>("Hello");
		Box<Object> e = obj1;
		Box<Object> f = obj1;
		f.setx(20.20);
		System.out.println(e.getx() + " " + f.getx());
	}
}
