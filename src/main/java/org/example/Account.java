package org.example;

public class Account {
    private String login;
    private String password;
    private int account_type;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAccount_type() {
        return account_type;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccount_type(int account_type) {
        this.account_type = account_type;
    }
}
