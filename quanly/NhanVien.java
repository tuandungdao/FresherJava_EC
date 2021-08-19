package quanly;

public class NhanVien extends CanBo {
	private String job;
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public NhanVien(String name, int age, String gender, String address, String job) {
		super(name, age, gender, address);
		this.job = job;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Job: " + job);
	}
}
