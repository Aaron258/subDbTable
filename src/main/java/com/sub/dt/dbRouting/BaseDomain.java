package com.sub.dt.dbRouting;

import java.io.Serializable;

/**
 * Created by supers on 2017/3/9.
 */
public class BaseDomain  implements Serializable {

    private String userNum;

    private String tableIndex;

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public String getTableIndex() {
        this.tableIndex = DbContextHolder.getTableIndex();
        return tableIndex;
    }

    public void setTableIndex(String tableIndex) {
        this.tableIndex = tableIndex;
    }
}
