package com.lvb.docmgr.Model;

import lombok.Data;

@Data
public class Proposal {
    private int pid;
    private String name;//提案名字
    private String content;//提案内容
    private int author;//提案作者
    private long timeline;//发布时间
    private long deadline;//截至时间
    private int status;//状态（新建状态为0；专委会推荐后状态为1；行业分会备案后状态为2；研究会立案状态为3
    private int support;//附议数
    private int reject;//反对数

    public Proposal() {
}
    public Proposal(int author, String name, String content) {
        this.author = author;
        this.name = name;
        this.content = content;
        this.timeline = System.currentTimeMillis() / 1000;//获取系统当前时间
        this.deadline = this.timeline + 604800;//获取系统当前时间之后七天
    }
}
