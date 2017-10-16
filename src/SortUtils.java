
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortUtils {
	public static void main(String[] args){
		 Set<Student> treeset = new TreeSet<>();
		 System.out.print("Before sort:");
		 for(int i=0; i < 20; i++){
			 Student student = new Student();
			 student.setNumber((int)(Math.random()*9000+1000)+"");
			 System.out.print(student.getNumber()+" ");
			 treeset.add(student);
		 }
		 System.out.println("");
		 System.out.print("After sort:");
		 Iterator<Student> iterator = treeset.iterator();
		 while(iterator.hasNext()){
			 System.out.print(iterator.next().getNumber()+" ");
		 }
	}
		
}
