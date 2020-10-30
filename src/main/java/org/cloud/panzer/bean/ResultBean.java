package org.cloud.panzer.bean;

public class ResultBean<T> {
    private int code;
    private T datas;

    public ResultBean() {
    }

    public ResultBean(int code, T datas) {
        this.code = code;
        this.datas = datas;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getDatas() {
        return datas;
    }

    public void setDatas(T datas) {
        this.datas = datas;
    }
}
