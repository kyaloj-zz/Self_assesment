package com.fragments.justus.mpishi2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.view.Window;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import static com.fragments.justus.mpishi2.R.layout.login;


public class Fblogin extends ActionBarActivity {

    private CallbackManager callbackManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.login);




        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fblogin, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.login, container, false);
            return rootView;
        }

//        @Override
//        public View onCreateView(
//                LayoutInflater inflater,
//                ViewGroup container,
//                Bundle savedInstanceState) {
//            View view = inflater.inflate(login, container, false);
//
//            LoginButton loginButton = (LoginButton) view.findViewById(R.id.login_button);
//            loginButton.setReadPermissions("user_friends");
//             CallbackManager callbackManager= CallbackManager.Factory.create();
//            // If using in a fragment
//            loginButton.setFragment(this);
//            // Other app specific specialization
//
//            // Callback registration
//            loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
//                @Override
//                public void onSuccess(LoginResult loginResult) {
//                    Intent goWorks1 = new Intent(getActivity(),howitworks.class);
//                    startActivity(goWorks1);
//                }
//
//                @Override
//                public void onCancel() {
//                    // App code
//                }
//
//                @Override
//                public void onError(FacebookException exception) {
//                    // App code
//                }
//            });
//            return view;
//        }
    }
}
