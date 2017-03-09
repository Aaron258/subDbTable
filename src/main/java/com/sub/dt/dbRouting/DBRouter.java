package com.sub.dt.dbRouting;

/**
 * DB路由器接口
 * @ClassName: DBRouter 
 * @Description: DB路由器接口，通过调用该接口来自动判断数据位于哪个服务器
 * @author lvjun 
 * @date 2012-3-13 下午01:19:47
 */
public interface DBRouter {
	/**
	 * 进行路由
	 * @param fieldId
	 * @return
	 * @throws
	 */
    public String doRoute(String fieldId);


    public String doRouteByResource(String resourceCode);
}
