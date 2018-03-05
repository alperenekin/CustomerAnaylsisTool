package hw6.domain;
/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
public abstract class Customer {
	private int age;
	private char gender;
	private String name;
	private String type;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<18 || age>79) {
			throw new IllegalArgumentException("Invalid Age Parameter");
		}
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null || name.length()>20) {
			throw new IllegalArgumentException("Invalid Name Parameter! Name can not be null or longer than 20 char");
		}
		else
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		if(gender !='m' && gender!='f' && gender !='M' && gender!='F') {
			throw new IllegalArgumentException("Invalid Gender Parameter");
		}
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(int age) {
		if(age>=60) {
			type="Senior";
		}
		else if(age>30 && age<59) {
			type="Adult";
		}
		else if(age>18 && age<29) {
			type="Young";
		}
	}
	@Override
	public String toString() {
		return getType()+ " [super="+"Customer [age=" + getAge() + ", gender=" + getGender() + ", name=" + getName() + ", type=" + getType() + "]]";
	}
	
}

