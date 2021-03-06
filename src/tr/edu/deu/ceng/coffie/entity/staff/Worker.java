package tr.edu.deu.ceng.coffie.entity.staff;

import java.math.BigDecimal;
import java.time.LocalDate;

import tr.edu.deu.ceng.coffie.entity.auth.Loginnable;

public  class Worker implements Loginnable {
	static enum WorkType{
		CASHIER,CLEANER,COOK,WAITER
	}
	
	private String name,surname,email,password,adress;
	private BigDecimal salary;
	private LocalDate birthDay;
	private WorkType workType;
	
	
	public Worker(String name, String surname, String email,String password, String adress, BigDecimal salary, LocalDate birthDay,
			WorkType workType) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.adress = adress;
		this.salary = salary;
		this.birthDay = birthDay;
		this.workType = workType;
		this.password = password;
	}
	public WorkType getWorkType() {
		return workType;
	}
	public void setWorkType(WorkType workType) {
		this.workType = workType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public BigDecimal getPayment() {
		return salary;
	}
	public void setPayment(BigDecimal payment) {
		this.salary = payment;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}
