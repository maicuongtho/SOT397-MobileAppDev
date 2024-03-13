package vn.edu.tinhoc123.loginusingmvp.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import vn.edu.tinhoc123.loginusingmvp.MainActivity;
import vn.edu.tinhoc123.loginusingmvp.R;
import vn.edu.tinhoc123.loginusingmvp.presenters.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements LoginView, View.OnClickListener {
    private EditText edtUsername;
    private EditText edtPassword;
    private Button btnLogin;
    LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginPresenter = new LoginPresenter(this);
        initView();
        initClick();
    }
    public void initView() {
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }

    public void initClick() {
        btnLogin.setOnClickListener(this);
    }
    @Override
    public void loginFail() {
        Toast.makeText(this, "Login Fail!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccessful() {
        Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void goHome() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnLogin) {
            String username = edtUsername.getText().toString();
            String password = edtPassword.getText().toString();
            loginPresenter.login(username, password);
        }
    }
}