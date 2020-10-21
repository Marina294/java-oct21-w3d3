package marina1020w3d2;


public class Driver {

	public static void printStudents(Student[] studArray) {
		for (int i = 0; i <studArray.length; i++) {
			System.out.println(studArray[i].getFirstName() + " " + studArray[i].getLastName());
		}
	}

	public static void main(String[] args) {
//		int[] inArray = new int[10];
		Student[] studentArray = new Student[10];
		
		studentArray[0] = new Student(null, "");
		studentArray[1] = new Student("Jane", "Dew");
		studentArray[2] = new Student("Albert", "Dao");
		
//		Student student1 = new Student(null, "");
//		Student student2 = new Student("Jane", "Dew");
//		Student student3 = new Student("Albert", "Dao");


		
//		System.out.println(student1.getFirstName() + " " + student1.getLastName());
//		System.out.println(student2.getFirstName() + " " + student2.getLastName());
//		System.out.println(student3.getFirstName() + " " + student3.getLastName());
		
		printStudents(studentArray);
		
		studentArray[0].setFirstName("John");
		studentArray[0].setLastName("Dew");
		
		
//		student1.setFirstName("John");
//		student1.setLasttName("Dew");

		System.out.println("\nPrinting the student after the update");
		printStudents(studentArray);
//		System.out.println(student1.getFirstName() + " " + student1.getLastName());
//		System.out.println(student2.getFirstName() + " " + student2.getLastName());
//		System.out.println(student3.getFirstName() + " " + student3.getLastName());

	}

//		if(student1.firstName != null || student1.lastName != null)
//		System.out.println(student1.firstName + " " + student1.lastName);
//		System.out.println(student2.firstName + " " + student2.lastName);
//		System.out.println(student3.firstName + " " + student3.lastName);
	
//	}
	
}
