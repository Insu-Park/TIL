package web.vo;

public class SongVO {
	
	private String title;
	private int attcode;
	private String imgfilename;
	private double rate;
	private int count;
	
	
	public SongVO(String title) {
		super();
		this.title = title;
	}
	
	public SongVO(String title, int attcode) {
		super();
		this.title = title;
		this.attcode = attcode;
	}
	
	public SongVO(String title, int attcode, double rate) {
		super();
		this.title = title;
		this.attcode = attcode;
		this.rate = rate;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAttcode() {
		return attcode;
	}
	public void setAttcode(int attcode) {
		this.attcode = attcode;
	}
	public String getImgfilename() {
		return imgfilename;
	}
	public void setImgfilename(String imgfilename) {
		this.imgfilename = imgfilename;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
