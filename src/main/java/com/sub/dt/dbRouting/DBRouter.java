package com.sub.dt.dbRouting;

/**
 * @Description DB路由接口  DB路由器接口，通过调用该接口来自动判断数据位于哪个服务器
 * @Autohr supers【weChat:13031016567】
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
