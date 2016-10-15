package id.sch.smktelkom_mlg.tugas01.xiirpl2009.formpendaftarankomunitas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText etNama = (EditText) findViewById(R.id.editTextNama);
        EditText etIden = (EditText) findViewById(R.id.editTextIdentitas);
        EditText etTL   = (EditText) findViewById(R.id.editTextTL);
        EditText etAlamat = (EditText) findViewById(R.id.editTextAlamat);
        EditText etMail = (EditText) findViewById(R.id.editTextMail);
        Spinner spKerja = (Spinner) findViewById(R.id.spinnerKerja);
        RadioButton rbLaki = (RadioButton) findViewById(R.id.radioButtonLaki);
        RadioButton rbPer = (RadioButton) findViewById(R.id.radioButtonPer);

    }
}
