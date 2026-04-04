import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super(); // calls the constructor without arguments of the parent class: Object
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class JavaSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        // sort the ArrayList by cgpa, name or id in descending order for cgpa 
		// and ascending order for name and id using 
		// Comparator.comparingDouble and Comparator.thenComparing 
        Comparator<Student> byGradeNameId = Comparator
            .comparingDouble(Student::getCgpa).reversed()
            .thenComparing(Student::getFname)
            .thenComparingInt(Student::getId);
        
        Collections.sort(studentList, byGradeNameId);
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



