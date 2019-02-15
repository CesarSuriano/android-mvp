package com.example.root.hellomvp.presenter;


import com.example.root.hellomvp.model.User;

public class MainActivityPresenter {
    private User user;
    private View view;

    public MainActivityPresenter(View view){
        this.view = view;
        this.user = new User();
    }

    public void updateNome(String nome){
        this.user.setNome(nome);
        this.view.updateUserInfoTextView(user.toString());
    }

    public void updateEmail(String email){
        this.user.setEmail(email);
        this.view.updateUserInfoTextView(user.toString());
    }

    public interface View{

        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();

    }
}
