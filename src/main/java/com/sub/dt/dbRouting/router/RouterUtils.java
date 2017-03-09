package com.sub.dt.dbRouting.router;

import com.sub.dt.dbRouting.security.Base64Binrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RouterUtils {

    private static final Logger log	= LoggerFactory.getLogger(RouterUtils.class);
    /**
     * Ĭ�ϱ���
     */
    private final static String encode = "utf-8";
    /**
     * �����Դ��
     */
    private final static int resourceMax = 10000;

    /**
     * ��ȡhashCode
     *
     * @param routeValue
     * @return
     */
    public static int getHashCodeBase64(String routeValue) {
        int hashCode = 0;
        try {
            String pinBase64 = Base64Binrary.encodeBase64Binrary(routeValue.getBytes(encode));
            hashCode = Math.abs(pinBase64.hashCode());
        } catch (Exception e) {
            log.error("hashCode ʧ��", e);
        }
        return hashCode;
    }

    /**
     * ��ȡ��Դ��
     *
     * @param routeValue
     * @return
     */
    public static int getResourceCode(String routeValue) {
        int hashCode = RouterUtils.getHashCodeBase64(routeValue);
        int resourceCode = hashCode % resourceMax;
        return resourceCode;
    }


    public static void main(String args[]) {
        String payid = "140331160123935469773";

        String resource = payid.substring(payid.length() - 4);

        int routeFieldInt = Integer.valueOf(resource);
        int mode = 6 * 200;
        int dbIndex = routeFieldInt % mode / 200;
        int tbIndex = routeFieldInt % 200;

        System.out.println(dbIndex+"-->"+tbIndex);
    }
}
