package travelspot;

public class PlaceDTO {
	private int contentId;
	private Integer contentTypeId; //관광타입 id
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

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public PlaceDTO() {}//기본생성자
	
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

	public PlaceDTO(int contentId, String title, int areaCode, String image1, String address, double mapx, double mapy, String contents, String homepage) {
		this.contentId = contentId;
		this.title = title;
		this.areaCode = areaCode;
		this.image1 = image1;
		this.address = address;
		this.mapx = mapx;
		this.mapy = mapy;
		this.contents = contents;
		this.homepage = homepage;
	};

	public PlaceDTO(int contentId, String title, int areaCode, String image1, String image2, String address,
			double mapx, double mapy, String contents, String theme, String writingtime, int likecnt, int viewcnt,
			String homepage) {
		this.contentId = contentId;
		this.title = title;
		this.areaCode = areaCode;
		this.image1 = image1;
		this.image2 = image2;
		this.address = address;
		this.mapx = mapx;
		this.mapy = mapy;
		this.contents = contents;
		this.theme = theme;
		this.writingtime = writingtime;
		this.likecnt = likecnt;
		this.viewcnt = viewcnt;
		this.homepage = homepage;
	}

	public PlaceDTO(int contentId, String title, int areaCode, String image1, String image2, String address,
			double mapx, double mapy, String contents,String theme, String writingtime, int likecnt, int viewcnt
			) { // 테마o
		super();
		this.contentId = contentId;
		this.title = title;
		this.areaCode = areaCode;
		this.image1 = image1;
		this.image2 = image2;
		this.address = address;
		this.mapx = mapx;
		this.mapy = mapy;
		this.contents = contents;
		this.writingtime = writingtime;
		this.likecnt = likecnt;
		this.viewcnt = viewcnt;
		this.theme = theme;
	}

	@Override
	public String toString() {
		return "PlaceDTO [contentId=" + contentId + ", contentTypeId=" + contentTypeId + ", title=" + title
				+ ", areaCode=" + areaCode + ", image1=" + image1 + ", image2=" + image2 + ", address=" + address
				+ ", mapx=" + mapx + ", mapy=" + mapy + ", contents=" + contents + ", theme=" + theme + ", writingtime="
				+ writingtime + ", likecnt=" + likecnt + ", viewcnt=" + viewcnt + ", homepage=" + homepage + "]";
	}

	public PlaceDTO(int contentId, String title, int areaCode, String image1, String image2, String address,
			double mapx, double mapy, String contents, String writingtime, int likecnt, int viewcnt) { // 테마x																												// x
		this.contentId = contentId;
		this.title = title;
		this.areaCode = areaCode;
		this.image1 = image1;
		this.image2 = image2;
		this.address = address;
		this.mapx = mapx;
		this.mapy = mapy;
		this.contents = contents;
		this.writingtime = writingtime;
		this.likecnt = likecnt;
		this.viewcnt = viewcnt;
	}

	//테마별 추천코스에서 장소Id, 장소명 추출용 dto

	public PlaceDTO(int contentId, String title, String theme, Integer contenttypeid) {
		this.contentId = contentId;
		this.title = title; 
		this.theme = theme;
		this.contentTypeId = contenttypeid; //추천코스 아이디인 25 넘어옴
		//this.image1 = image1;
	}; 
	
	public PlaceDTO(int contentId, String title, int areaCode, String image1,String image2, String address, double mapx, double mapy) { 
		this.contentId = contentId;
		this.title = title; 
		this.areaCode = areaCode; 
		this.image1 = image1; 
		this.image2 = image2; 
		this.address = address; 
		this.mapx = mapx;
		this.mapy = mapy;
	}

	public PlaceDTO(int contentId, String title, int areaCode, String image1, String address, double mapx, double mapy) {
		this.contentId = contentId;
		this.title = title;
		this.areaCode = areaCode;
		this.image1 = image1;
		this.address = address;
		this.mapx = mapx;
		this.mapy = mapy;
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

	public int getContentId() {
		return contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Integer getContentTypeId() {
		return contentTypeId;
	}

	public void setContentTypeId(Integer contentTypeId) {
		this.contentTypeId = contentTypeId;
	}

}
