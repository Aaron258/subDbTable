package com.sub.dt.dbRouting.bean;

import java.util.List;

/**
 * Created by wangshupeng1 on 2017/3/9.
 */
public class RouterSet {

    /**
     * �����ַ���
     */
    public final static int RULE_TYPE_STR = 3;


    public final static int ROUTER_TYPE_DB = 0;

    public final static int ROUTER_TYPE_TABLE = 1;

    public final static int ROUTER_TYPE_DBANDTABLE = 2;

    /**
     * ���ݿ����߼�KEY,������ԴMAP�����е�keyһ��
     */
    private List<String> dbKeyArray;

    /**
     * ���ݿ�����
     */
    private int dbNumber;
    /**
     * ���ݱ�����
     */
    private int tableNumber;
    /**
     * ���ݱ�index��ʽ
     */
    private String tableIndexStyle;
    /**
     * Id��ʼ
     */
    private String routeFieldStart;
    /**
     * Id����
     */
    private String routeFieldEnd;
    /**
     * ��������
     */
    private int ruleType;
    /**
     * ·����������
     */
    private int routeType;


    public static int getRULE_TYPE_STR() {
        return RULE_TYPE_STR;
    }

    public static int getROUTER_TYPE_DB() {
        return ROUTER_TYPE_DB;
    }

    public static int getROUTER_TYPE_TABLE() {
        return ROUTER_TYPE_TABLE;
    }

    public static int getROUTER_TYPE_DBANDTABLE() {
        return ROUTER_TYPE_DBANDTABLE;
    }

    public List<String> getDbKeyArray() {
        return dbKeyArray;
    }

    public void setDbKeyArray(List<String> dbKeyArray) {
        this.dbKeyArray = dbKeyArray;
    }

    public int getDbNumber() {
        return dbNumber;
    }

    public void setDbNumber(int dbNumber) {
        this.dbNumber = dbNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getTableIndexStyle() {
        return tableIndexStyle;
    }

    public void setTableIndexStyle(String tableIndexStyle) {
        this.tableIndexStyle = tableIndexStyle;
    }

    public String getRouteFieldStart() {
        return routeFieldStart;
    }

    public void setRouteFieldStart(String routeFieldStart) {
        this.routeFieldStart = routeFieldStart;
    }

    public String getRouteFieldEnd() {
        return routeFieldEnd;
    }

    public void setRouteFieldEnd(String routeFieldEnd) {
        this.routeFieldEnd = routeFieldEnd;
    }

    public int getRuleType() {
        return ruleType;
    }

    public void setRuleType(int ruleType) {
        this.ruleType = ruleType;
    }

    public int getRouteType() {
        return routeType;
    }

    public void setRouteType(int routeType) {
        this.routeType = routeType;
    }
}
