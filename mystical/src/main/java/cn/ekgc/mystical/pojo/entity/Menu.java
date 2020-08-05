package cn.ekgc.mystical.pojo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <b>菜单信息表</b>
 * @author asus
 * @version 1.0.0 2020-08-04
 * @since 1.0.0
 *
 * */

public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;
	private  Long id;            //菜单主键
	private Menu parent;        //上级菜单
	private String name;        //菜单名称
	private  String url;        //链接地址
	private  String icon;       //菜单图标
	private List<Menu> childrenMenus;  //下拉菜单列表
	private  List<Role> roleList ;    //该菜单所分配的角色列表
	private Date createTime;   //创建时间
	private Date updateTime;   //修改时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Menu getParent() {
		return parent;
	}

	public void setParent(Menu parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<Menu> getChildrenMenus() {
		return childrenMenus;
	}

	public void setChildrenMenus(List<Menu> childrenMenus) {
		this.childrenMenus = childrenMenus;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
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
