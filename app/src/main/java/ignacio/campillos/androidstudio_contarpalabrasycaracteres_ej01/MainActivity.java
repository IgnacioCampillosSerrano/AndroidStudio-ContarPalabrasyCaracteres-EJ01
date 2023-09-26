package ignacio.campillos.androidstudio_contarpalabrasycaracteres_ej01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    static EditText etextTextoContar;
    static Button buttonContarPalabrasMain;
    static Button buttonContarLetrasMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeInterface();


    }

    private void initializeInterface() {
        etextTextoContar = findViewById(R.id.etextTextoContar);
        buttonContarLetrasMain = findViewById(R.id.buttonContarLetrasMain);
        buttonContarPalabrasMain = findViewById(R.id.buttonContarPalabrasMain);
    }
}