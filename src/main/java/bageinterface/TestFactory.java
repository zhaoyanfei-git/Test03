package bageinterface;

import org.testng.annotations.Factory;

public class TestFactory {
    @Factory
    public Object[] factoryMethod() {
        return new Object[]{
                new DeleteUserByid(), new DeleteUserBywant(), new InsertUser(),
                new SelectUserByidJson(), new SelectUserBywantJson(),
                new SelectUserByid(), new SelectUserBywant(),new UpdateUser()};
    }
}
