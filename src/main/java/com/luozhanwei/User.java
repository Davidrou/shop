package com.luozhanwei;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by luxiaolin on 17/7/8.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String telNum;

    private User(){

    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public void setId(Integer id) {
        this.id = id;

    }




}
