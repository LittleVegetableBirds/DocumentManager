package com.lvb.docmgr.Model;

import lombok.Data;

@Data
public class User {
    private int uid;
    private String username;
    private String password;

    private int role; //1 最大 2专委会 3 行业分会 4研究会
    private int status;//审核通过 0 未通过1
    private String name;
    private String sex;
    private String birthday;
    private String address;
    private String contact;
    private String referrer;

    private int industryid;
    private int committeeid;
    private int seminarid;

    public User() {
    }

    public User(String username, String password, int role, String name, String sex, String birthday, String address, String contact, String referrer, int industryid, int committeeid,int seminarid) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.contact = contact;
        this.referrer = referrer;
        this.industryid = industryid;
        this.committeeid = committeeid;
        this.seminarid=seminarid;
    }
}
