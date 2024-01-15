
public class St_info {
	
	String ID;
	String Name;
	String Add;
	String Dept;
	String course;
	
	St_info(String id, String name, String add, String dept, String c){
		ID = id;
		Name = name;
		Add = add;
		Dept = dept;
		course = c;
		
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
