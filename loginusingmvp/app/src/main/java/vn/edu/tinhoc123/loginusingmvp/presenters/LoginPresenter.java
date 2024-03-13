package vn.edu.tinhoc123.loginusingmvp.presenters;

import vn.edu.tinhoc123.loginusingmvp.views.LoginView;

public class LoginPresenter {
    LoginView loginView;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
    }

    public void login(String username, String password) {
        if (username.equalsIgnoreCase("thomc") && password.equalsIgnoreCase("123")) {
            loginView.loginSuccessful();
            loginView.goHome();
        } else {
            loginView.loginFail();
        }
    }
}
