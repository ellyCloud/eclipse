package day2Homework1;

public class Main {
	public static void main (String [] args) {
		
		Course course1 = new Course (1240541, "Introduction to Programming Course", "Engin Demiroğ", 0);
		Course course2 = new Course (1235979, "C# + Angular Course", "Engin Demiroğ", 100);
		Course course3 = new Course (1332369, "Java+React Course", "Engin Demiroğ", 32);
		
		Course[] courses = {course1,course2,course3};
		
		System.out.println();
		System.out.println("Total number of courses in that page : " + courses.length);
		System.out.println();
		CourseManager courseManager = new CourseManager();
		courseManager.addToMyCourses(course3);
		System.out.println();
		courseManager.removeSelectedCourse(course1);
		
		
		System.out.println();
		System.out.println("                      COURSE LIST");
		System.out.println();
		
		
		System.out.println("----------------------First Course----------------------");
		System.out.println("Course ID: " + course1.id);
		System.out.println("Course Name: " + course1.courseName);
		System.out.println("Lecturer of the course: " + course1.courseLecturer);
		System.out.println("Percentage completion of the course: " + "%" + course1.percentageOfCompleion);
		System.out.println();
		
		System.out.println("----------------------Second Course----------------------");
		System.out.println("Course ID: " + course2.id);
		System.out.println("Course Name: " + course2.courseName);
		System.out.println("Lecturer of the course: " + course2.courseLecturer);
		System.out.println("Percentage completion of the course: " + "%" + course2.percentageOfCompleion);
		System.out.println();
		
		System.out.println("----------------------Third Course----------------------");
		System.out.println("Course ID: " + course3.id);
		System.out.println("Course Name: " + course3.courseName);
		System.out.println("Lecturer of the course: " + course3.courseLecturer);
		System.out.println("Percentage completion of the course: " + "%" + course3.percentageOfCompleion);
		System.out.println("---------------------------------------------------------");
		
		
		
		
		
	}

}
