package cat.udl.tidic.amd.dam_tips.viewmodels;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import cat.udl.tidic.amd.dam_tips.models.Account;
import cat.udl.tidic.amd.dam_tips.repositories.AccountRepo;

public class SignUpViewModel extends ViewModel {

    private AccountRepo accountRepo;
    private final String TAG = "SignUpVM";
    public MutableLiveData<String> Username = new MutableLiveData<>();
    public MutableLiveData<String> Name = new MutableLiveData<>();
    public MutableLiveData<String> Surname = new MutableLiveData<>();
    public MutableLiveData<String> Email = new MutableLiveData<>();
    public MutableLiveData<String> Password = new MutableLiveData<>();

    public SignUpViewModel() {
        this.accountRepo = new AccountRepo();
    }


    public void onRegister(){
        Account account = new Account();
        account.setUsername(Username.getValue());
        account.setName(Name.getValue());
        account.setSurname(Surname.getValue());
        account.setPassword(Password.getValue());
        account.setEmail(Email.getValue());
        account.setGenere("M");
        Log.d(TAG,account.toString());
        this.accountRepo.registerAccount(account);
    }


}
