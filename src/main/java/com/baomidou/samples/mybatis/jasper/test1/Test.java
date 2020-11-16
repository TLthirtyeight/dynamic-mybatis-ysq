package com.baomidou.samples.mybatis.jasper.test1;

import org.apache.jasper.JspC;

/**
 * @Author: ysq
 * @Description: Jasper test
 * @Date: 2020/11/17 0:08
 */

public class Test {
    public static String jspcTest() {
        String error = "";
        try {
            JspC jspC = new JspC();
            // 第一种方式
            String[] arg0 = {"-uriroot", "F:/apache-tomcat-6.0.43/webapps/ROOT", "-d", "F://test", "index.jsp"};
            jspC.setArgs(arg0);

            // 第二种方式
            jspC.setUriroot("F:/apache-tomcat-6.0.43/webapps/ROOT");
            jspC.setJspFiles("index.jsp");

            jspC.setCompile(true);
            jspC.execute();
        } catch (Exception exception) {
            error = exception.toString();
        }
        return error;
    }

    public static void main(String[] args) {
        System.out.println(jspcTest());
    }
}
