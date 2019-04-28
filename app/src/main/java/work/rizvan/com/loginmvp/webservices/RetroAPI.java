package work.rizvan.com.loginmvp.webservices;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import work.rizvan.com.loginmvp.model.UserModel;


public interface RetroAPI {


    @FormUrlEncoded
    @POST("get_check_login")
    Call<UserModel> login(@Field("username") String username,
                               @Field("password") String password,
                               @Field("type") String type);



}