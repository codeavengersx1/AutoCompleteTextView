package in.itechvalley.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
{
    @BindView(R.id.simple_spinner)
    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * Attach ButterKnife to this Activity
        * */
        ButterKnife.bind(this);

        /*
        * Simple List for Spinner
        * */
        List<String> listContainingItems = new ArrayList<>();
        listContainingItems.add("Select your Designation");
        listContainingItems.add("Mr.");
        listContainingItems.add("Mrs.");
        listContainingItems.add("Miss");
        listContainingItems.add("Master");

        /*
        * Simple ArrayAdapter for Spinner
        * */
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(
            MainActivity.this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            listContainingItems);

        autoCompleteTextView.setAdapter(stringArrayAdapter);
    }
}
