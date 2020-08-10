package cn.ekgc.mystical.pojo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * <b>菜单信息表</b>
 * @author asus
 * @version 1.0.0 2020-08-04
 * @since 1.0.0
 *
 * */

public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;                        // 菜单主键
	private Menu parent;                    // 上级菜单
	private String name;                    // 菜单名称
	private String url;                     // 连接地址
	private String icon;                    // 菜单图标
	private List<Menu> childrenMenus;       // 下级菜单列表
	private List<Role> roleList;            // 该菜单所分配角色列表
	private Date createTime;                // 创建时间
	private Date updateTime;                // 修改时间

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

	@Override
	public boolean equals(Object o) {
		if (o == this){
			//此时两个对象的地址值相同，则两个对象相同
			return true;
		}

		if (o == null){
			return false;
		}

		if (o instanceof Menu){
			//将Object 强制类型转换为 Menu
			Menu menu=(Menu) o;
			//判断两个菜单的 id 是否相同
			if (menu.getId().equals(this.getId())){
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
