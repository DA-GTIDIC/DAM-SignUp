package cat.udl.tidic.amd.dam_tips.services;

import cat.udl.tidic.amd.dam_tips.models.Account;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;



public interface AccountServiceI {

    @POST("/users/register")
    Call<ResponseBody> register(@Body Account account);

}
