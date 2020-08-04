package cn.ekgc.mystical.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>快递信息表</b>
 * @author Administrator
 *
 */
public class Express implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;                        // 主键
	private String no;                      // 编号
	private String sendName;                // 寄件人姓名
	private String sendCellphone;           // 寄件人手机号码
	private String sendAddress;             // 寄件人联系地址
	private String receiveName;             // 收件人姓名
	private String receiveCellphone;        // 收件人手机号码
	private String receiveAddress;          // 收件人地址
	private Date sendDate;                  // 寄件时间
	private Date beginTransportDate;        // 开始运输时间
	private Date endTransportDate;          // 结束运输时间
	private Date deliveryDate;              // 配送时间
	private Date receiveDate;               // 收货时间
	private Integer status;                 // 快件状态：0-已揽件，1-开始运输，2-运输到达，3-快件配送，4-已收件
	private Date createTime;                // 创建时间
	private Date updateTime;                // 修改时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getSendName() {
		return sendName;
	}

	public void setSendName(String sendName) {
		this.sendName = sendName;
	}

	public String getSendCellphone() {
		return sendCellphone;
	}

	public void setSendCellphone(String sendCellphone) {
		this.sendCellphone = sendCellphone;
	}

	public String getSendAddress() {
		return sendAddress;
	}

	public void setSendAddress(String sendAddress) {
		this.sendAddress = sendAddress;
	}

	public String getReceiveName() {
		return receiveName;
	}

	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}

	public String getReceiveCellphone() {
		return receiveCellphone;
	}

	public void setReceiveCellphone(String receiveCellphone) {
		this.receiveCellphone = receiveCellphone;
	}

	public String getReceiveAddress() {
		return receiveAddress;
	}

	public void setReceiveAddress(String receiveAddress) {
		this.receiveAddress = receiveAddress;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public Date getBeginTransportDate() {
		return beginTransportDate;
	}

	public void setBeginTransportDate(Date beginTransportDate) {
		this.beginTransportDate = beginTransportDate;
	}

	public Date getEndTransportDate() {
		return endTransportDate;
	}

	public void setEndTransportDate(Date endTransportDate) {
		this.endTransportDate = endTransportDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Date getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
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
