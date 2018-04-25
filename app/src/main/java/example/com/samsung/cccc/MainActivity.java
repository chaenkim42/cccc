package example.com.samsung.cccc;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements WordsFragment.OnWordSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);


        final EditText searchTextInput = findViewById(R.id.searchText);
        Button searchButton = findViewById(R.id.searchButton);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String searchString = searchTextInput.getText().toString();
                int index = Data.searchItem(searchString);
                ListView listView = findViewById(R.id.word_list);

                if(index >= 0){
                    listView.setSelection(index);
                }

            }
        });


        if(findViewById(R.id.fragment_container) != null){
            if(savedInstanceState != null){
                return;
            }

            WordsFragment wordsFragment = new WordsFragment();
            wordsFragment.setArguments(getIntent().getExtras());
            wordsFragment.setmCallback(this);

            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, wordsFragment).commit();


        }



    }

    @Override
    public void onWordSelected(int position){
        DefinitionFragment newFragment = new DefinitionFragment();
        Bundle args = new Bundle();
        args.putInt(DefinitionFragment.ARG_POSITION, position);
        newFragment.setArguments(args);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, newFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
