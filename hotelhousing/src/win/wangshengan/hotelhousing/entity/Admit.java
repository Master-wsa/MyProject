package win.wangshengan.hotelhousing.entity;

/**
 * ����Աʵ����
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
	 * ��ù���Աid
	 * @return the admitId
	 */
	public int getAdmitId() {
		return admitId;
	}

	/**
	 * ���ù���ԱID
	 * @param admitId the admitId to set
	 */
	public void setAdmitId(int admitId) {
		this.admitId = admitId;
	}

	/**
	 * ��ù���Ա����
	 * @return the adpsw
	 */
	public String getAdpsw() {
		return adpsw;
	}

	/**
	 * ���ù���Ա����
	 * @param adpsw the adpsw to set
	 */
	public void setAdpsw(String adpsw) {
		this.adpsw = adpsw;
	}
	
	
}
