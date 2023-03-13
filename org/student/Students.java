package org.student;

public class Students {
	public void getStudentinfo(int id)
	{
		System.out.println("Student id"+id);
	}
	public void getStudentinfo(int id,String name)
	{
		System.out.println("Student id:"+id);
		System.out.println("Student Name"+name);
	}
	public void getStudentinfo(long phonenumber,String email)
	{
		System.out.println("Student Phonenumber"+phonenumber);
		System.out.println("Student Email"+email);

}
	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentinfo(27);
		obj.getStudentinfo(27, "Padma");
		obj.getStudentinfo(9840178394l, "padma.endless87@gmail.com");
		
	}
}