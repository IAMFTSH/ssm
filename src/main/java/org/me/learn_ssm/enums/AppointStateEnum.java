package org.me.learn_ssm.enums;

public enum AppointStateEnum {
    /*这些相当于常量*/
    SUCCESS(1, "预约成功"),
    NO_NUMBER(0, "库存不足"),
    REPEAT_APPOINT(-1, "重复预约"),
    INNER_ERROR(-2, "系统异常");

    private int state;

    private String stateInfo;

    /*构造方法  只能private*/
    private AppointStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static AppointStateEnum stateOf(int index) {
        /*遍历AppointStateEnum中的值，*/
        for (AppointStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

}
