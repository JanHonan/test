
public class Student implements Comparable{
	String number;//编号
	String name;//名字

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(!(o instanceof Student ))
			throw new RuntimeException("不是学生对象");
		Student s = (Student) o;
		if(s.getNumber().compareTo(this.getNumber()) > 0)
			return 1;
		else if(s.getNumber().compareTo(this.getNumber()) < 0)
			return -1;
		return 0;
	}
}
