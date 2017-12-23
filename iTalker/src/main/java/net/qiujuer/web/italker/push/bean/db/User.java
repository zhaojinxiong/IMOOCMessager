package net.qiujuer.web.italker.push.bean.db;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 用户的Model,对应数据库
 * Created by Administrator on 2017/12/20.
 */
@Entity
@Table(name = "TB_USER")
public class User {

    //这是一个主键
    @Id
    @PrimaryKeyJoinColumn
    // 主键生成存储的类型
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name ="uuid", strategy = "uuid2")
    // 不允许更改，不允许为null
    @Column(updatable = false,nullable = false)
    private String id;



}
