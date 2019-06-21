package pe.edu.pucp.a20152252.myfirstlogin.features.login;

import pe.edu.pucp.a20152252.myfirstlogin.features.base.IView;

public interface ILoginView extends IView {
    void askForLoginOffline();

    void goToHomePage(String names, String email);

    void showErrorDialog(String message);
}
