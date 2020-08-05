package cn.ekgc.mystical.pojo.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <b>用户信息表</b>
 * @author asus
 * @version 1.0.0 2020-08-04
 * @since 1.0.0
 *
 * */
public class User  implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;        //主键
	private String name; //用户姓名
	private String cellphone; //手机号码
	private String password; //登录密码
	private Role role;        //角色用户信息
	private String idCard;    //身份证号码
	private String avatar;  //头像
	private Integer status;  //用户状态：0-禁用，1-启用
	private Date createTime;   //创建时间
	private Date updateTime;   //修改时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
