package com.java;

public class Student implements Comparable<Student>{			//POJO ---> plain old java object = properties alogn with getter/setters
	private int studId;
	private String studName;
	private String studEmail;
	private String genderType;
	public Student(int studId, String studName, String studEmail, String genderType) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studEmail = studEmail;
		this.genderType = genderType;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "\n [studId=" + studId + ", studName=" + studName + ", studEmail=" + studEmail + ", genderType="
				+ genderType + "]";
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudEmail() {
		return studEmail;
	}
	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}
	public String getGenderType() {
		return genderType;
	}
	public void setGenderType(String genderType) {
		this.genderType = genderType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studEmail == null) ? 0 : studEmail.hashCode());
		result = prime * result + studId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studEmail == null) {
			if (other.studEmail != null)
				return false;
		} else if (!studEmail.equals(other.studEmail))
			return false;
		if (studId != other.studId)
			return false;
		return true;
	}
	
	
	@Override
	public int compareTo(Student o) {
		return -(this.getStudId() - o.getStudId());			// id asc sort
	}		// - (this.getStudId() - o.getStudId());

	//comparable --> Compareto(o1) --> this.property-o.property -----> int
	
	
	
}
