package work.rizvan.com.loginmvp.login;

import work.rizvan.com.loginmvp.model.UserModel;
import work.rizvan.com.loginmvp.mvpbase.BasePresenter;
import work.rizvan.com.loginmvp.mvpbase.MvpView;

public interface LoginContract
{

    public interface View
    {
        void showSuccessLogin(UserModel model);
    }


    public interface Presenter
    {
        void doLogin(String username, String password);
    }
}
