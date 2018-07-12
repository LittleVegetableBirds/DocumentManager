package com.lvb.docmgr.Model;

import lombok.Data;

@Data
public class Recommendation {
    private int id;
    private int uid;
    private int rid;
    private int status;
    private String reason;

    public Recommendation() {

    }

    public Recommendation(int uid, int rid, String reason) {
        this.uid = uid;
        this.rid = rid;
        this.reason = reason;
    }

}
/*
    CREATE TABLE `recommendation`(
        `id` int(20) NOT NULL AUTO_INCREMENT,
        `uid` int(11) NOT NULL,
        `rid` int(11) NOT NULL,
        `status` int(2) NOT NULL DEFAULT '0',
        `reason` text NOT NULL,
        PRIMARY KEY (`id`)
        );
*/