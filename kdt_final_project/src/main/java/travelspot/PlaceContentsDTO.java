package travelspot;

public class PlaceContentsDTO {
	private int contentId;
	private int contentTypeId; //관광타입 id
	private String title;
	private int areaCode;
	private String image1;
	private String image2;
	private String address;
	private double mapx;
	private double mapy;
	private String contents;
	private String theme;
	private String writingtime;
	private int likecnt;
	private int viewcnt;
	private String homepage;
	ContentsDTO contentsdto; //PlaceDTO contentId = PlaceContentsDTO id
	
	public int getContentId() {
		return contentId;
	}
	public void setContentId(int contentId) {
		this.contentId = contentId;
	}
	public int getContentTypeId() {
		return contentTypeId;
	}
	public void setContentTypeId(int contentTypeId) {
		this.contentTypeId = contentTypeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getMapx() {
		return mapx;
	}
	public void setMapx(double mapx) {
		this.mapx = mapx;
	}
	public double getMapy() {
		return mapy;
	}
	public void setMapy(double mapy) {
		this.mapy = mapy;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getWritingtime() {
		return writingtime;
	}
	public void setWritingtime(String writingtime) {
		this.writingtime = writingtime;
	}
	public int getLikecnt() {
		return likecnt;
	}
	public void setLikecnt(int likecnt) {
		this.likecnt = likecnt;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public ContentsDTO getContentsdto() {
		return contentsdto;
	}
	public void setContentsdto(ContentsDTO contentsdto) {
		this.contentsdto = contentsdto;
	}
	
	
	
}