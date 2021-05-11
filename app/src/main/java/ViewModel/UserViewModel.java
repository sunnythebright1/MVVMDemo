package ViewModel;

import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

import Model.User;

public class UserViewModel extends BaseObservable {
    private User user;

    @Bindable //to bind directly with view
    public  String message = null;

    public String getToast(){
        return message;
    }

    private void setToast(String message){
        this.message = message;
        notifyPropertyChanged(BR.message); //way to interact with the view
    }
    

    public void setEmail(String email){
        user.setEmail(email);
        notifyPropertyChanged(BR.email); //will be reflected realtime
    }

    @Bindable
    public String getEmail(){
        return user.getEmail(); //xml will call this method to update view
    }

    public void setPassword(String password){
        user.setPassword(password);
        notifyPropertyChanged(BR.password);
    }

    @Bindable
    public String getPassword(){
        return user.getPassword();
    }

    public void loginBtnTapped(){ //this method is called via the view model
        if(user.isDataValid()){  // password and email should contain test in them
            setToast("Welcome");
        }
        else {
            setToast("Incorrect Credentials");
        }
    }

    public UserViewModel () {
        user = new User("","");
    }

}
