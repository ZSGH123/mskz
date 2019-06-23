package com.mskz.model.user;

/**
 * title: user
 * projectName mskz
 * description: mskz的用户信息model
 * author biqi@raycloud.com
 * date 2019-06-23 13:05
 ***/
public class user {

    private String userid;
    private String password;
    private String usertype;
    private String employeeName;
    //联系电话（后添加）
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
}
