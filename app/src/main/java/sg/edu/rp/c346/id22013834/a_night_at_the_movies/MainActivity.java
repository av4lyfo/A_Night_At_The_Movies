package sg.edu.rp.c346.id22013834.a_night_at_the_movies;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etTitle, etGenre, etYear;
    private Spinner spinner;
    private Button buttonInsert;

    private DBHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new DBHelper(this);

        etTitle = findViewById(R.id.etTitle);
        etGenre = findViewById(R.id.etGenre);
        etYear = findViewById(R.id.etYear);
        spinner = findViewById(R.id.spinner);
        buttonInsert = findViewById(R.id.buttonInsert);

        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertMovie();
            }
        });
    }

    private void insertMovie() {
        String title = etTitle.getText().toString().trim();
        String genre = etGenre.getText().toString().trim();
        String year = etYear.getText().toString().trim();
        String rating = spinner.getSelectedItem().toString();

        // TODO: Insert movie data into the database using databaseHelper.

        Toast.makeText(this, "Movie inserted!", Toast.LENGTH_SHORT).show();
    }
}
