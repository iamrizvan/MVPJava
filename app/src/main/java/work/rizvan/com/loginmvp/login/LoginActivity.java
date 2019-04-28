package work.rizvan.com.loginmvp.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import work.rizvan.com.loginmvp.R;
import work.rizvan.com.loginmvp.model.UserModel;
import work.rizvan.com.loginmvp.register.RegisterActivity;

public class LoginActivity extends AppCompatActivity  implements LoginContract.View, View.OnClickListener{

    private EditText editUser;
    private EditText editPass;
    private Button   btnLogin;
    private Button btnClear;
    private ProgressBar progressBar;

    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //find view
        editUser = (EditText) this.findViewById(R.id.et_login_username);
        editPass = (EditText) this.findViewById(R.id.et_login_password);
        btnLogin = (Button) this.findViewById(R.id.btn_login_login);
        btnClear = (Button) this.findViewById(R.id.btn_login_register);

        //set listener
        btnLogin.setOnClickListener(this);
        btnClear.setOnClickListener(this);

        loginPresenter = new LoginPresenter(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btn_login_register:
            {
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
            break;
            case R.id.btn_login_login:
            {
                loginPresenter.doLogin(editUser.getText().toString(),editPass.getText().toString());
            }
            break;
        }
    }

    @Override
    public void showSuccessLogin(UserModel userModel) {
        String name = userModel.getClass().getName();
        Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();

    }
}
