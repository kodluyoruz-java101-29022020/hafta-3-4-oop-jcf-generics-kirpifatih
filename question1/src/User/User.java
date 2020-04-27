package User;

import java.util.Date;
import java.util.List;

import adress.adres;

public class User {

	    private String name;
	    private String surname;
	    private String email;
	    private String password;
	    private String job;
	    private Integer age;
	    private List<adres> Uadres;
	    private Date lastLoginDate;

	    public User() {
	    }

	    public User(String name, String surname, String email, String password, String job, Integer age, List<adres> Uadres, Date lastLoginDate) {
	        this.name = name;
	        this.surname = surname;
	        this.email = email;
	        this.password = password;
	        this.job = job;
	        this.age = age;
	        this.Uadres = Uadres;
	        this.lastLoginDate = lastLoginDate;
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
	    	this.surname=surname;
	    }
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getJob() {
	        return job;
	    }

	    public void setJob(String job) {
	        this.job = job;
	    }

	    public Integer getAge() {
	        return age;
	    }

	    public void setAge(Integer age) {
	        this.age = age;
	    }

	    public List<adres> getUadres() {
	        return Uadres;
	    }

	    public void setUadres(List<adres> Uadres) {
	        this.Uadres = Uadres;
	    }

	    public Date getLastLoginDate() {
	        return lastLoginDate;
	    }

	    public void setLastLoginToSystemDate(Date lastLoginDate) {
	        this.lastLoginDate = lastLoginDate;
	    }
	    
	    @Override
		public String toString() {
			return "User [name=" + name + ", surname=" + surname + ", email=" + email + ", job=" + job + ", age=" + age	+ ", adres=" + Uadres + ", lastLogin=" + lastLoginDate + "]";
		}

	    
}
