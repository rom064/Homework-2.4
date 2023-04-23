package pro.sky.java.course2.exceptions.exception.service;

public class AccessServiceImpl implements AccessService{
    private Integer login;
    private Integer password;
    private Integer confirmPassword;
    public AccessServiceImpl(Integer login, Integer password, Integer confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

@Override
    public Integer getLogin() {
        return login;
    }

    @Override
    public Integer getPassword() {
        return password;
    }
@Override
    public Integer getConfirmPassword() {
        return confirmPassword;
    }
}
