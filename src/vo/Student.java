/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author Administrator
 */
public class Student {
    private String no;
    private String name;
    private int age;
    private String birthday;
    
	public Student() {
		super();
	}
	public Student(String no, String name, int age, String birthday) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
	}

    
}
