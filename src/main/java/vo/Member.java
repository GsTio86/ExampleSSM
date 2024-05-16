package vo;

public class Member {
	private Integer id;
	private String name;
	private String username;
	private String password;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String name, String username, String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return String.format("ID:%d\t名稱:%s\t帳號:%s\t密碼:%s", this.id, this.name, this.username, this.password);
	}
	
}