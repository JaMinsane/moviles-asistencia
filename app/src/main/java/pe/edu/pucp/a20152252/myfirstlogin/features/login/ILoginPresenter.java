package pe.edu.pucp.a20152252.myfirstlogin.features.login;

import pe.edu.pucp.a20152252.myfirstlogin.features.base.IPresenter;

public interface ILoginPresenter extends IPresenter {
    boolean verifyLoginData(String username, String password);

    void loginRest(String username, String password);

    void loginOffline(String username, String password);
}
