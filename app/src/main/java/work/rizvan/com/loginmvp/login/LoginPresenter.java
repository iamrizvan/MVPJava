package work.rizvan.com.loginmvp.login;

import android.content.Context;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import work.rizvan.com.loginmvp.model.UserModel;
import work.rizvan.com.loginmvp.webservices.RetroConfig;

public class LoginPresenter implements LoginContract.Presenter, LoginContract.View{

    Context context;
    UserModel model;

    public LoginPresenter(Context context) {
        this.context = context;
    }

    @Override
    public void doLogin(final String username, String password) {

        Call<UserModel> call = RetroConfig.retrofit().login(username,password,"2");
        call.enqueue(new Callback<UserModel>() {
            @Override
            public void onResponse(Call<UserModel> call, Response<UserModel> response) {

                if (response.isSuccessful())
                {
                    model = response.body();
                     Toast.makeText(context,response.body().getData().getName(),Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {
                Toast.makeText(context,t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public void showSuccessLogin(UserModel model) {

    }
}
