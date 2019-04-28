package work.rizvan.com.loginmvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @Expose
    @SerializedName("username")
    private String username;

    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("userid")
    private String userid;

    @Expose
    @SerializedName("is_logged_in")
    private boolean is_logged_in;

    @Expose
    @SerializedName("group_id")
    private String group_id;

    @Expose
    @SerializedName("is_admin")
    private String is_admin;

    @Expose
    @SerializedName("last_login")
    private String last_login;

    @Expose
    @SerializedName("user_type")
    private String user_type;

    @Expose
    @SerializedName("clients_id")
    private String clients_id;

    @Expose
    @SerializedName("company_id")
    private String company_id;

    @Expose
    @SerializedName("is_first")
    private String is_first;

    @Expose
    @SerializedName("profile_image")
    private String profile_image;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public boolean isIs_logged_in() {
        return is_logged_in;
    }

    public void setIs_logged_in(boolean is_logged_in) {
        this.is_logged_in = is_logged_in;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(String is_admin) {
        this.is_admin = is_admin;
    }

    public String getLast_login() {
        return last_login;
    }

    public void setLast_login(String last_login) {
        this.last_login = last_login;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getClients_id() {
        return clients_id;
    }

    public void setClients_id(String clients_id) {
        this.clients_id = clients_id;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getIs_first() {
        return is_first;
    }

    public void setIs_first(String is_first) {
        this.is_first = is_first;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }
}
