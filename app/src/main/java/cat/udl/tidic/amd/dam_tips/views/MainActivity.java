package cat.udl.tidic.amd.dam_tips.views;
import android.os.Bundle;
import cat.udl.tidic.amd.dam_tips.R;


public class MainActivity extends CustomActivty {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
            goTo(LoginActivity.class);
    }
}
