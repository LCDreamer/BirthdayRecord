package entity;

public class UserInfo {
	Long id_phone_number;
	String name;
	String phone;
	String email;
	String nickname;
	String password;
	
	
	

	public Long getId_phone_number() {
		return id_phone_number;
	}
	public void setId_phone_number(Long id_phone_number) {
		this.id_phone_number = id_phone_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
