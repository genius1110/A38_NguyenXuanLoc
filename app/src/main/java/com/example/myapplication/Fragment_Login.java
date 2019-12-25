package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.myapplication.databinding.DangnhapBinding;

public class Fragment_Login extends Fragment implements Ilogin{
    DangnhapBinding binding;
    LoginPrestener prestener;
    public static Fragment_Login newInstance() {

        Bundle args = new Bundle();
        Fragment_Login fragment = new Fragment_Login();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater,R.layout.dangnhap,container,false);
        prestener = new LoginPrestener(this,getContext());
        binding.btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tk=binding.iduser.getText().toString();
                String mk=binding.idpass.getText().toString();
                prestener.DangNhap(tk,mk);
            }
        });
        return binding.getRoot();
    }

    @Override
    public void ThanhCong() {
        Toast.makeText(getContext(),"Đăng Nhập Thành Công",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void ThatBai(String mes) {
        Toast.makeText(getContext(),mes,Toast.LENGTH_SHORT).show();
    }
}
