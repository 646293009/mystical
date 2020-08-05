package cn.ekgc.mystical.util.enums;

/**
 * <b>系统状态枚举信息</b>
 * @author asus
 * @version 1.0.0 2020-08-04
 * @since 1.0.0
 *
 * */
public enum  StatusEnum {
	ENABLE_STATUS(1,"启用"),
	DISABLE_STATUS(0,"禁用")
		;
	private Integer code;  //状态码
	private String remark;  //说明
	private StatusEnum(Integer code ,String remark){
		this.code=code;
		this.remark=remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
