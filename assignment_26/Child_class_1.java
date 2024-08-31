package assignment_26;

public class Child_class_1 extends Parent_Class_1{

	public static void main(String[] args) {
		Child_class_1 cclass=new Child_class_1();
		System.out.println("main method");
		cclass.grandparent_method1();
		cclass.parent_method1();
	}

}
