package work.rizvan.com.loginmvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public  class UserModel {

    @Expose
    @SerializedName("data")
    private Data data;

    @Expose
    @SerializedName("code")
    private String code;

    @Expose
    @SerializedName("status")
    private String status;


    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
