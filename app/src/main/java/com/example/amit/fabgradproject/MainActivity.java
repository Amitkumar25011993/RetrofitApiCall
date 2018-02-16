package com.example.amit.fabgradproject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.amit.fabgradproject.Adapter.UserAdapter;
import com.example.amit.fabgradproject.Interface.ResponseInterface;
import com.example.amit.fabgradproject.Model.User;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "http://www.fabgrad.com/";
    private static final String TAG = "MainActivity";
    SearchView searchView;

    private RecyclerView recyclerView;
    private UserAdapter mAdapter;
    List<User> UserDetails;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler1);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ResponseInterface service = retrofit.create(ResponseInterface.class);
        Call<User> call = service.getOutput("23");
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, retrofit2.Response<User> response) {

                if (response.isSuccessful()) {

                    User jsonResponse = (User) response.body();
                    UserDetails = (List<User>) jsonResponse;
                    mLayoutManager = new LinearLayoutManager(getApplicationContext());
                    recyclerView.setLayoutManager(mLayoutManager);
                    mAdapter = new UserAdapter(UserDetails, MainActivity.this);
                    recyclerView.setAdapter(mAdapter);
                    Log.d(TAG, "onResponse: " + UserDetails.toString());

                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {

            }
        });


    }
}
