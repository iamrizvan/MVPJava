package work.rizvan.com.loginmvp.webservices;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroConfig {

    public static RetroAPI retrofit() {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://sehajob.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        RetroAPI api = retrofit.create(RetroAPI.class);
        return api;
    }

}