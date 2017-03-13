package com.girl.domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by hlwen on 2017/3/13.
 */
@Entity
public class Girl {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull(message = "金额必传")
    private Integer money;

    @NotBlank(message = "这个字段必传")
    private String cupSize;

    @Min(value = 18,message = "未成年少女禁止入内")
    private Integer age;


    public Girl() {

    }

    public Integer getId() {
        return id;
    }
    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }
}
