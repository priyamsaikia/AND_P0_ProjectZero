package apps.orchotech.com.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_popular_movies, btn_stock_hawk,
            btn_build_it_bigger, btn_make_material, btn_go_obiquitous, btn_capstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_popular_movies = (Button) findViewById(R.id.btn_one);
        btn_stock_hawk = (Button) findViewById(R.id.btn_two);
        btn_build_it_bigger = (Button) findViewById(R.id.btn_three);
        btn_make_material = (Button) findViewById(R.id.btn_four);
        btn_go_obiquitous = (Button) findViewById(R.id.btn_five);
        btn_capstone = (Button) findViewById(R.id.btn_six);

        btn_popular_movies.setOnClickListener(this);
        btn_stock_hawk.setOnClickListener(this);
        btn_build_it_bigger.setOnClickListener(this);
        btn_make_material.setOnClickListener(this);
        btn_go_obiquitous.setOnClickListener(this);
        btn_capstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String msg = "";
        if (v.getId() == R.id.btn_one)
            msg = "This button will launch my " + getText(R.string.app_one) + " app!";
        else if (v.getId() == R.id.btn_two)
            msg = "This button will launch my " + getText(R.string.app_two) + " app!";
        else if (v.getId() == R.id.btn_three)
            msg = "This button will launch my " + getText(R.string.app_three) + " app!";
        else if (v.getId() == R.id.btn_four)
            msg = "This button will launch my " + getText(R.string.app_four) + " app!";
        else if (v.getId() == R.id.btn_five)
            msg = "This button will launch my " + getText(R.string.app_five) + " app!";
        else if (v.getId() == R.id.btn_six)
            msg = "This button will launch my " + getText(R.string.app_six) + " app!";
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
