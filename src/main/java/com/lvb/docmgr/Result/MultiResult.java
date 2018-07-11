package com.lvb.docmgr.Result;

public class MultiResult<T>{
    public String message;
    public T data;

    public MultiResult() {

    }

    public MultiResult(String message, T data) {
        this.message = message;
        this.data = data;
    }
}
