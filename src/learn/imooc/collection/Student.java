package learn.imooc.collection;

import java.util.HashSet;
import java.util.Set;

public class Student {

	public String id;
	public String name;
	public Set<Course> courses;
	
	public Student(String id,String name){
		this.id = id;
		this.name = name;
		this.courses = new HashSet<Course>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
