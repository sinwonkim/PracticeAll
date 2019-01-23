package vo;

public class TestVo {

	private String name;
	private String age;
	private String locate;
	
	public TestVo(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public void setLocate(String loage) {
		this.locate = loage;
	}
	
	public String  getLocate() {
		return locate;
	}
	
	@Override
	public String toString() {
		return "TestVo [name=" + name + ", age=" + age + "]";
	}
	
	
}
