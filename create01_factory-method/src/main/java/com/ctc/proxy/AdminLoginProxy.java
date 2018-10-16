package com.ctc.proxy;

public class AdminLoginProxy implements Login {

    private AdminLogin adminLogin;

    public AdminLoginProxy(){
        this.adminLogin = new AdminLogin();
    }

    @Override
    public void login() {
        System.out.println("write log IP.");
        adminLogin.login();
        System.out.println("write log User.");
    }
}

