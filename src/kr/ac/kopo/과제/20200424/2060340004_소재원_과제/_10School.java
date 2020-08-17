package exam0424.etc;

public interface _10School {
	
	void print();
			
	class Student implements _10School{
		
		private String name;
		private int age;
		private int id;
		
		public Student(String name, int age, int id) {
			this.name = name;
			this.age = age;
			this.id = id;
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
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		@Override
		public void print() {
			System.out.println("이    름 : " + name + "   나    이 : " + age + "   학      번 : " + id);
		}

		
		
		
	}
	
	class Teacher implements _10School{
		
		private String name;
		private int age;
		private String subject;
		
		public Teacher(String name, int age, String subject) {
			this.name = name;
			this.age = age;
			this.subject = subject;
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
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}

		@Override
		public void print() {
			System.out.println("이    름 : " + name + "   나    이 : " + age + "   담당과목 : " + subject);
		}
		
		
	}
	
	class Employee implements _10School {
		
		private String name;
		private int age;
		private String dept;
		
		public Employee(String name, int age, String dept) {
			this.name = name;
			this.age = age;
			this.dept = dept;
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
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}

		@Override
		public void print() {
			System.out.println("이    름 : " + name + "   나    이 : " + age + "   부      서 : " + dept);
		}
		
	}
	
	public static void main(String[] args) {
		
		_10School stu = new Student("홍길동", 20, 200201);
		_10School sir = new Teacher("이순신", 30, "JAVA");
		_10School emp = new Employee("유관순", 40, "교무과");
		
		stu.print();
		sir.print();
		emp.print();
	}
}
