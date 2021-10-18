package com.example.RentACar.model;

public class ChangeUserInfoRequestModel {
    private String username;
    private String password;
    private String new_password;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String image;

    public ChangeUserInfoRequestModel(String username, String password, String new_password, String first_name, String last_name,
                                      String phone_number, String image) {
        this.username = username;
        this.password = password;
        this.new_password = new_password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNew_password() {
        return new_password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getImage() {
        return image;
    }
}
