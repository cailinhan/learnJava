package learn.imooc.collection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseList cl = new CourseList();
		Course course = new Course("2001","大学物理");
		Course course2 = new Course("2001","大学物理");
		cl.courseAdd(new Course("1001","数据结构"));
		cl.courseAdd(new Course("1002","C语言程序设计"));
		cl.courseAdd(course);
		cl.CourseExits(course2);
//		
//		cl.courseAdd(course);
//		cl.courseShow();
//		cl.courseModift(cl.courseGetById("1002"), new Course("1002","C语言高级程序设计"));
//		cl.courseShow();
//		cl.courseRemove(cl.courseGetById("1002"));
//		cl.courseShow();
	}

}
