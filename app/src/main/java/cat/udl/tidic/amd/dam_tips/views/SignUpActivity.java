package cat.udl.tidic.amd.dam_tips.views;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import cat.udl.tidic.amd.dam_tips.R;
import cat.udl.tidic.amd.dam_tips.databinding.ActivitySignupBinding;
import cat.udl.tidic.amd.dam_tips.viewmodels.SignUpViewModel;

public class SignUpActivity extends CustomActivty {

    final String TAG = "SignUpActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initView();
    }


    private void initView() {
        SignUpViewModel signUpViewModel = new ViewModelProvider(this).get(SignUpViewModel.class);
        ActivitySignupBinding activitySignupBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_signup);
        activitySignupBinding.setLifecycleOwner(this);
        activitySignupBinding.setViewModel(signUpViewModel);
    }


}