package com.example.myapplication;

import android.content.Context;

public class LoginPrestener {
    Ilogin ilogin;
    Context context;

    public LoginPrestener(Ilogin ilogin, Context context) {
        this.ilogin = ilogin;
        this.context = context;
    }
    public void DangNhap(String user,String pass) {
        if (user.equals("user") && pass.equals("user")) {
            ilogin.ThanhCong();
        } else {
            ilogin.ThatBai("Tài Khoản hoặc Mật Khẩu không đúng");
        }
    }
}
