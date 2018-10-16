package com.ctc.proxy;

public class APP {

//    public static void main(String[] args) {
//        Login login = new AdminLoginProxy();
//        login.login();
//    }

//    JDKProxy
//    public static void main(String[] args) {
//        Login login = new AdminLogin();
//        JDKProxy jdkProxy = new JDKProxy(login);
//        Login proxy = (Login) jdkProxy.getProxy();
//        proxy.login();
//    }

    //    CGLIBProxy
    public static void main(String[] args) {
        AdminLogin adminLogin = new AdminLogin();
        CGLIBProxy cglibProxy = new CGLIBProxy();
        AdminLogin loginProxy = (AdminLogin) cglibProxy.getInstance(adminLogin);
        loginProxy.login();
    }
}

