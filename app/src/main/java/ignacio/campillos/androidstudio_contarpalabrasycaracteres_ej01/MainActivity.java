package ignacio.campillos.androidstudio_contarpalabrasycaracteres_ej01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static EditText etextTextoContar;
    static Button buttonContarPalabrasMain;
    static Button buttonContarLetrasMain;

    static int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeInterface();

        buttonContarPalabrasMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] palabras = etextTextoContar.getText().toString().split("\\s+");
                Toast.makeText(MainActivity.this, palabras[0] + " " + palabras[1], Toast.LENGTH_SHORT).show();
                for (String s:palabras) {
                    count++;
                }
                Intent intent = new Intent(MainActivity.this,ContarActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("COUNT",count);
                bundle.putString("TYPE","palabras");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        buttonContarLetrasMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = etextTextoContar.length();

                Intent intent = new Intent(MainActivity.this, ContarActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("COUNT",count);
                bundle.putString("TYPE","letras");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

    private void initializeInterface() {
        etextTextoContar = findViewById(R.id.etextTextoContar);
        buttonContarLetrasMain = findViewById(R.id.buttonContarLetrasMain);
        buttonContarPalabrasMain = findViewById(R.id.buttonContarPalabrasMain);
    }
}