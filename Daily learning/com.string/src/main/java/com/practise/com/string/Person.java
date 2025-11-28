package com.practise.com.string;

public class Person {
	
	private String name;
	private Integer id;
	private Integer age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Integer id, Integer age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void checkEligibility() throws AgeNotSufficientException{
		if(this.age >= 18) {
			System.out.println("Eligible");
		}else {
			throw new AgeNotSufficientException("The person is not eligible");
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

}
