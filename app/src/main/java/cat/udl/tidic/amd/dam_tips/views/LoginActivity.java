package cat.udl.tidic.amd.dam_tips.views;

import android.os.Bundle;
import android.widget.TextView;

import cat.udl.tidic.amd.dam_tips.R;

public class LoginActivity extends CustomActivty {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    protected void initView(){
        TextView _link_signup = findViewById(R.id.link_signup);
        _link_signup.setOnClickListener(v -> goTo(SignUpActivity.class));
    }
}
