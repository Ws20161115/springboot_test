package com.example.springboot_test.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2018/12/25 10:03
 * @Version 1.0
 **/
public class User implements Serializable{

    private static final long serialVersionUID = -1107735483175220842L;
    /**主键*/
    private java.lang.String id;
    /**创建人名称*/
    private java.lang.String createName;
    /**创建人登录名称*/
    private java.lang.String createBy;
    /**创建日期*/
    private java.util.Date createDate;
    /**更新人名称*/
    private java.lang.String updateName;
    /**更新人登录名称*/
    private java.lang.String updateBy;
    /**更新日期*/
    private java.util.Date updateDate;
    /**所属部门*/
    private java.lang.String sysOrgCode;
    /**所属公司*/
    private java.lang.String sysCompanyCode;
    /**流程状态*/
    private java.lang.String bpmStatus;
    /**用户昵称微信*/
    private java.lang.String realname;
    /**账号*/
    private java.lang.String username;
    /**手机号*/
    private java.lang.String phone;
    /**性别*/
    private java.lang.String sex;
    /**常住地*/
    private java.lang.String address;
    /**常住地编号*/
    private java.lang.String addresscode;
    /**生日*/
    private java.util.Date birth;
    /**个性签名*/
    private java.lang.String details;
    /**头像*/
    private java.lang.String usernameurl;
    /**用户cid*/
    private java.lang.String cid;
    /**微信qq标识*/
    private java.lang.String openid;
    /**用户账号金额*/
    private java.lang.String price;
    /**账号状态*/
    private java.lang.String accountStatus;
    /**微信唯一标识*/
    private java.lang.String unionid;
    /** 用户是否是会员*/
    private String isMember;
    /** 会员注册时间*/
    private Date memberStart;
    /** 会员到期时间*/
    private Date memberEnd;
    /** 推荐人数*/
    private Integer totalNumber;
    /** 预留字段1*/
    private String ext1;
    /** 预留字段2*/
    private String ext2;
    private String ext3;
    private String ext4;
    private String ext5;
    //支付宝账号
    private String alipayAccount;
    //用户名
    private String alipayName;
    //是否是新用户
    private String isNew;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getSysOrgCode() {
        return sysOrgCode;
    }

    public void setSysOrgCode(String sysOrgCode) {
        this.sysOrgCode = sysOrgCode;
    }

    public String getSysCompanyCode() {
        return sysCompanyCode;
    }

    public void setSysCompanyCode(String sysCompanyCode) {
        this.sysCompanyCode = sysCompanyCode;
    }

    public String getBpmStatus() {
        return bpmStatus;
    }

    public void setBpmStatus(String bpmStatus) {
        this.bpmStatus = bpmStatus;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddresscode() {
        return addresscode;
    }

    public void setAddresscode(String addresscode) {
        this.addresscode = addresscode;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getUsernameurl() {
        return usernameurl;
    }

    public void setUsernameurl(String usernameurl) {
        this.usernameurl = usernameurl;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getIsMember() {
        return isMember;
    }

    public void setIsMember(String isMember) {
        this.isMember = isMember;
    }

    public Date getMemberStart() {
        return memberStart;
    }

    public void setMemberStart(Date memberStart) {
        this.memberStart = memberStart;
    }

    public Date getMemberEnd() {
        return memberEnd;
    }

    public void setMemberEnd(Date memberEnd) {
        this.memberEnd = memberEnd;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5;
    }

    public String getAlipayAccount() {
        return alipayAccount;
    }

    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

    public String getAlipayName() {
        return alipayName;
    }

    public void setAlipayName(String alipayName) {
        this.alipayName = alipayName;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", createName='" + createName + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createDate=" + createDate +
                ", updateName='" + updateName + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", updateDate=" + updateDate +
                ", sysOrgCode='" + sysOrgCode + '\'' +
                ", sysCompanyCode='" + sysCompanyCode + '\'' +
                ", bpmStatus='" + bpmStatus + '\'' +
                ", realname='" + realname + '\'' +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", addresscode='" + addresscode + '\'' +
                ", birth=" + birth +
                ", details='" + details + '\'' +
                ", usernameurl='" + usernameurl + '\'' +
                ", cid='" + cid + '\'' +
                ", openid='" + openid + '\'' +
                ", price='" + price + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                ", unionid='" + unionid + '\'' +
                ", isMember='" + isMember + '\'' +
                ", memberStart=" + memberStart +
                ", memberEnd=" + memberEnd +
                ", totalNumber=" + totalNumber +
                ", ext1='" + ext1 + '\'' +
                ", ext2='" + ext2 + '\'' +
                ", ext3='" + ext3 + '\'' +
                ", ext4='" + ext4 + '\'' +
                ", ext5='" + ext5 + '\'' +
                ", alipayAccount='" + alipayAccount + '\'' +
                ", alipayName='" + alipayName + '\'' +
                ", isNew='" + isNew + '\'' +
                '}';
    }
}
