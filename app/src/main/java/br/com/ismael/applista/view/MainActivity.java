package br.com.ismael.applista.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import br.com.ismael.applista.R;
import br.com.ismael.applista.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Ismael");
        pessoa.setSobrenome("Pedro");
        pessoa.setCursoDesejado("Android");
        pessoa.setContato("(83) 9819179-77)");

        Log.i("POOAndroid", pessoa.toString());
        System.out.println(pessoa.toString());
    }
}