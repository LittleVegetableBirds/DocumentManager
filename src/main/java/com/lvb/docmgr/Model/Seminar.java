package com.lvb.docmgr.Model;

import lombok.Data;

@Data
public class Seminar {
    private int seminarid;
    private String name;
}
/*
create table seminar(
    `seminarid` int not null auto_increment,
    `name` text not null,
    primary key(`seminarid`)
);


 */