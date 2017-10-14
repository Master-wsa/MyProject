package win.wangshengan.hotelhousing.entity;

/**
 * 管理员实体类
 * @author AnJia
 *
 */
public class Admit {

	private int admitId;
	private String adpsw;
	
	public Admit() {
		super();
	}

	/**
	 * @param admitId
	 * @param adpsw
	 */
	public Admit(int admitId, String adpsw) {
		super();
		this.admitId = admitId;
		this.adpsw = adpsw;
	}

	/**
	 * 获得管理员id
	 * @return the admitId
	 */
	public int getAdmitId() {
		return admitId;
	}

	/**
	 * 设置管理员ID
	 * @param admitId the admitId to set
	 */
	public void setAdmitId(int admitId) {
		this.admitId = admitId;
	}

	/**
	 * 获得管理员密码
	 * @return the adpsw
	 */
	public String getAdpsw() {
		return adpsw;
	}

	/**
	 * 设置管理员密码
	 * @param adpsw the adpsw to set
	 */
	public void setAdpsw(String adpsw) {
		this.adpsw = adpsw;
	}
	
	
}
