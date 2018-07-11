package com.lvb.docmgr.Model;

import lombok.Data;

@Data
public class Committee{
    private int committeeid;
    private String name;
}
/*
create table committee(
    `committeeid` int not null auto_increment,
    `name` text not null,
    primary key(`committeeid`)
);
 */
//auto-increment 自增长