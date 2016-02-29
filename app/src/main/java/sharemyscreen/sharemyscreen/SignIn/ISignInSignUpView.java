package sharemyscreen.sharemyscreen.SignIn;

import android.support.design.widget.CoordinatorLayout;

import com.dd.processbutton.iml.ActionProcessButton;

/**
 * Created by cleme_000 on 27/02/2016.
 */
public interface ISignInSignUpView {
    String getUsername();
    String getPassword();

    void setErrorUsername(int resId);
    void setErrorPassword(int resId);

    void initializeInputLayout();

    void setProcessLoadingButton(int process);

    CoordinatorLayout getCoordinatorLayout();

    ActionProcessButton getActionProcessButton();

    void startRoomActivity();
}
