package com.mskz.model.room;

import java.io.Serializable;
import java.util.Date;

/**
 * title: RoomInfo
 * projectName mskz
 * description: 房间信息
 * author biqi@raycloud.com
 * date 2019-05-26 13:46
 ***/
public class RoomInfo implements Serializable {
    /**
     * 人数
     */
    private int population;
    /**
     * 房间号
     */
    private String roomId;
    /**
     * 房间名
     */
    private String roomname;
    /**
     * 房间类型名
     */
    private String roomType;
    /**
     *
     */
    private int roomtypeid;
    /**
     * 宾客姓名
     */
    private String guestName;
    /**
     * 标志（空和住和预和停）
     */
    private int flag;
    /**
     * 是否为脏房
     */
    private int isdrity;
    /**
     * 房间单价（默认为一天的单价）
     */
    private double price;
    /**
     * 已住时长
     */
    private float liveTime;
    /**
     * 预住时长
     */
    private int advanceTime;
    /**
     * 消费金额
     */
    private double expendMoney;
    /**
     * 宾客已付款和押金之和
     */
    private double payAndDeposite;
    /**
     * 所属楼栋
     */
    private String loudong;
    /**
     * 所属单元
     */
    private String unit;
    /**
     * 所属楼层
     */
    private String floor;
    /**
     * 是否欠费
     */
    private int isArrearage;
    /**
     * 备注
     */
    private String note;
    /**
     * 入住信息编号（后来添加）
     */
    private String checkinfoid;
    /**
     * 押金总额（后来添加）
     */
    private double depositeMoney;
    /**
     * 入住时间（后来添加）
     */
    private Date checkindate;
    /**
     * 预离时间（后来添加）
     */
    private Date advanceLeaveDate;
    /**
     * 计费类型（后来添加）
     */
    private int billtype=3;
    /**
     * 计费名称（后来添加）
     */
    private String billname="全天房";
    /**
     * 长租计费方案名称 （后来添加）
     */
    private String faname;
    /**
     * 周期（后来添加）
     */
    private int period;
    /**
     * 长租单价（后来添加）
     */
    private double czprice;
    /**
     * 追加方式（0 自动追加，1自定义追加）（后来添加）
     */
    private int zhuijiaway;
    /**
     * 证件类型名字
     */
    private String zjname;
    /**
     * 证件编号
     */
    private String zjnumber;
    /**
     * 促销方案名字
     */
    private String cxName;
    /**
     * 促销折扣
     */
    private double cxDiscount;
    /**
     * 宾客类型
     *
     */
    private String guestType;
    /**
     * 宾客电话
     */
    private String guestphone;
    /**
     * 客房电话
     * @return
     */
    private String roomPhone;
    /**
     * 宾客公司名称
     */
    private String companyName;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomtypeid() {
        return roomtypeid;
    }

    public void setRoomtypeid(int roomtypeid) {
        this.roomtypeid = roomtypeid;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getIsdrity() {
        return isdrity;
    }

    public void setIsdrity(int isdrity) {
        this.isdrity = isdrity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(float liveTime) {
        this.liveTime = liveTime;
    }

    public int getAdvanceTime() {
        return advanceTime;
    }

    public void setAdvanceTime(int advanceTime) {
        this.advanceTime = advanceTime;
    }

    public double getExpendMoney() {
        return expendMoney;
    }

    public void setExpendMoney(double expendMoney) {
        this.expendMoney = expendMoney;
    }

    public double getPayAndDeposite() {
        return payAndDeposite;
    }

    public void setPayAndDeposite(double payAndDeposite) {
        this.payAndDeposite = payAndDeposite;
    }

    public String getLoudong() {
        return loudong;
    }

    public void setLoudong(String loudong) {
        this.loudong = loudong;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public int getIsArrearage() {
        return isArrearage;
    }

    public void setIsArrearage(int isArrearage) {
        this.isArrearage = isArrearage;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCheckinfoid() {
        return checkinfoid;
    }

    public void setCheckinfoid(String checkinfoid) {
        this.checkinfoid = checkinfoid;
    }

    public double getDepositeMoney() {
        return depositeMoney;
    }

    public void setDepositeMoney(double depositeMoney) {
        this.depositeMoney = depositeMoney;
    }

    public Date getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(Date checkindate) {
        this.checkindate = checkindate;
    }

    public Date getAdvanceLeaveDate() {
        return advanceLeaveDate;
    }

    public void setAdvanceLeaveDate(Date advanceLeaveDate) {
        this.advanceLeaveDate = advanceLeaveDate;
    }

    public int getBilltype() {
        return billtype;
    }

    public void setBilltype(int billtype) {
        this.billtype = billtype;
    }

    public String getBillname() {
        return billname;
    }

    public void setBillname(String billname) {
        this.billname = billname;
    }

    public String getFaname() {
        return faname;
    }

    public void setFaname(String faname) {
        this.faname = faname;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getCzprice() {
        return czprice;
    }

    public void setCzprice(double czprice) {
        this.czprice = czprice;
    }

    public int getZhuijiaway() {
        return zhuijiaway;
    }

    public void setZhuijiaway(int zhuijiaway) {
        this.zhuijiaway = zhuijiaway;
    }

    public String getZjname() {
        return zjname;
    }

    public void setZjname(String zjname) {
        this.zjname = zjname;
    }

    public String getZjnumber() {
        return zjnumber;
    }

    public void setZjnumber(String zjnumber) {
        this.zjnumber = zjnumber;
    }

    public String getCxName() {
        return cxName;
    }

    public void setCxName(String cxName) {
        this.cxName = cxName;
    }

    public double getCxDiscount() {
        return cxDiscount;
    }

    public void setCxDiscount(double cxDiscount) {
        this.cxDiscount = cxDiscount;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getGuestphone() {
        return guestphone;
    }

    public void setGuestphone(String guestphone) {
        this.guestphone = guestphone;
    }

    public String getRoomPhone() {
        return roomPhone;
    }

    public void setRoomPhone(String roomPhone) {
        this.roomPhone = roomPhone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
