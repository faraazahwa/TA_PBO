package AplikasiJavaBerbasisOOP;

import java.util.Scanner;

public abstract class Log_in {

    private String username;
    private int password;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return this.password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public abstract void tampil();

}