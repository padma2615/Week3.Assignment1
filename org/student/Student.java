package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("studentname");
	}
	public void DepartmentName()
	{
		System.out.println("Departmentname");
	}
	public void studenId()
	{
		System.out.println("studenId");
	}
	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.collegeName();
		obj.DepartmentName();
		obj.studentName();
		obj.studenId();
		obj.course();
	}

}
