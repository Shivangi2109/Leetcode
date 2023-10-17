public class Student{
	
	int age;
	String name;
	String rollNo;
	String emailId;
	char gender;
	

	public Student(int age, String name , String rollNo,  String emailId, char gender)

	{
		this.age=age;
		this.name=name;
		this.emailId=emailId;
		this.rollNo=rollNo;
		this.gender=gender;

	}


	public static void main(String []args){
         
 	Student s1=new Student(21,"vaibhav","68","vaibhav@motu.com",'M');
	Student s2=new Student(22,"varun","67","varunbhai@terror.com",'M');
	System.out.println("Age is"+s1.age + "Name is "+s1.name);
	System.out.println("Age is"+s2.age + "Name is "+s2.name);



        }
}

