package com.dearnikki.dearnikki;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by winag on 8 Apr 2017.
 */

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "https://dearnikki.000webhostapp.com/Register_dn.php";
    private Map<String, String> params;

    public RegisterRequest(String username, String password, String first_name, String last_name, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
        params.put("first_name", first_name);
        params.put("last_name", last_name);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
