package com.jelp.spoticar;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;


public class Configuration extends Application
{

    public void onCreate()
    {
        super.onCreate();
    }

    public static String OAuthToken()
    {
     String OAuthToken= "BQCYHFUW40SyvPckX78AtiMgrauVH_RhdQz1HVAHscUmre1AtYa2L4qTdYbBhJRReMYncP0UUZ-ztacU9jZhRrq7Qz1LdKHpVRRWbhOJvR_sBYhibEBUIVnHGnrcBNRjdBBnKrCV9YqJtVAetVozGU1KyXkkdTe7MXY8JPtMaClj9rO56kVoGMEHO_h8TVNZ36UR";
     return OAuthToken;
    }

}
