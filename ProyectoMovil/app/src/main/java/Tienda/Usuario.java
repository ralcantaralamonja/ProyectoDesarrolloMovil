package Tienda;

public class Usuario {

    private String useName = "";
    private String password = "";

    public Usuario(String useName, String password) {
        this.useName = useName;
        this.password = password;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
