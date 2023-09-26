package ignacio.campillos.androidstudio_contarpalabrasycaracteres_ej01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ContarActivity extends AppCompatActivity {

    static TextView textViewContar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar);

        initializeComponents();

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String type = bundle.getString("TYPE");
        int count = bundle.getInt("COUNT");

        if (type.equals("letras")){
            textViewContar.setText("LETTERS: " + count);
        }else if (type.equals("palabras")){
            textViewContar.setText("WORDS: " + count);
        } else{
            textViewContar.setText("ERROR COUNTING");
        }

    }

    private void initializeComponents() {
        textViewContar = findViewById(R.id.textViewContar);
    }
}