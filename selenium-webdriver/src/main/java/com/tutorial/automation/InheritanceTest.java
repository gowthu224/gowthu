package com.tutorial.automation;

public class InheritanceTest {

		   String designation = "Teacher";
		   String collegeName = "Beginnersbook";
		   void does(){
			System.out.println("Teaching_parent");
		   }
		}

		class PhysicsTeacher extends InheritanceTest{
		   String mainSubject = "Physics";
		   void does()
		   {
			   System.out.println("Teaching_child");
		   }
		   void child()
		   {
			   System.out.println("child class method");
		   }
		   public static void main(String args[]){
			PhysicsTeacher obj = new PhysicsTeacher();
			System.out.println(obj.collegeName);
			System.out.println(obj.designation);
			System.out.println(obj.mainSubject);
			obj.does();
			InheritanceTest i=new PhysicsTeacher();
			System.out.println(i.designation);
			System.out.println(i.collegeName);
			i.does();
			//i.child();
		   }
		}


