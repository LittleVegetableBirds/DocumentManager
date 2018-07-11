package com.lvb.docmgr.Model;

import lombok.Data;

@Data
public class Industry {
    private int industryid;
    private String name;
}
/*
create table industry(
    `industryid` int not null auto_increment,
    `name` text not null,
    primary key(`industryid`)
);
 */