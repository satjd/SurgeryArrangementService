package com.satjd.demo.dto;

public class ErrorInfo<T> {
    private Integer errcode;
    private T errmsg;

    public ErrorInfo(Integer errcode, T errmsg) {
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public T getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(T errmsg) {
        this.errmsg = errmsg;
    }
}
