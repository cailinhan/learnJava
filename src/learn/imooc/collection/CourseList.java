package learn.imooc.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseList {

	protected List<Course> courseList;
	
	public CourseList(){
		this.courseList = new ArrayList<Course>();
	}
	
	public void courseAdd(Course course){
		this.courseList.add(course);
		//System.out.println("添加课程 课程号:" + course.getId() + " 课程名:" + course.getName());
	}
	
	public void courseShow(){
		System.out.println("课程列表");
		System.out.println("课程号\t课程名");
		
		Iterator<Course> it = courseList.iterator();
		while(it.hasNext()){
			Course course = it.next();
			System.out.println(course.getId() + "\t" + course.getName());
		}
		/*
		for(Course course : courseList){
			System.out.println(course.getId() + "\t" + course.getName());
		}
		*/
	}
	
	public int courseGetById(String id){
		for(int i=0; i<courseList.toArray().length; i++){
			Course c = courseList.get(i);
			if(c.id.equals(id)){
				return i;
			}
		}
		return -1;
	}
	
	public void courseModift(int index,Course course){
		courseList.set(index, course);
	}
	
	public void courseRemove(int index){
		courseList.remove(index);
	}
	
	/**
	 * 判断是否存在
	 * 
	 * @param course
	 */
	public void CourseExits(Course course){
		System.out.println(courseList.contains(course));
	}
}