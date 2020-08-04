package cn.ekgc.mystical.pojo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *@author Administrator
 *@version 1.0.0 2020-08-05
 * @since 1.0.0
 */
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;                        // 主键
	private String name;                    // 角色名称
	private List<Menu> menuList;            // 角色拥有的菜单列表
	private Date createTime;                // 创建时间
	private Date updateTime;                // 修改时间

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

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
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
