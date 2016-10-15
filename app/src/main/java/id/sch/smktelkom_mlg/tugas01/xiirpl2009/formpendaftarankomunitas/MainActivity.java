package id.sch.smktelkom_mlg.tugas01.xiirpl2009.formpendaftarankomunitas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton rbLaki,rbPer;
    EditText etNama,etAlamat;
    Spinner spKerja;
    Button btOK;
    TextView tvHasil;
    CheckBox cbMedsos,cbTeman,cbMedmas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.editTextNama);
        etAlamat = (EditText) findViewById(R.id.editTextAlamat);
        spKerja = (Spinner) findViewById(R.id.spinnerKerja);
        rbLaki = (RadioButton) findViewById(R.id.radioButtonLaki);
        rbPer = (RadioButton) findViewById(R.id.radioButtonPer);
        btOK = (Button) findViewById(R.id.buttonDaftar);
        tvHasil = (TextView) findViewById(R.id.hasil);
        cbMedsos = (CheckBox) findViewById(R.id.checkBoxSosmed);
        cbTeman = (CheckBox) findViewById(R.id.checkBoxTeman);
        cbMedmas = (CheckBox) findViewById(R.id.checkBoxMedia);

        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gender = null;

                if(rbLaki.isChecked()){
                    gender = rbLaki.getText().toString();
                }
                else if (rbPer.isChecked()){
                    gender = rbPer.getText().toString();
                }

                String info = "";
                if(cbMedsos.isChecked()) info += cbMedsos.getText().toString() +"\n";
                if(cbTeman.isChecked()) info += cbTeman.getText().toString() +"\n";
                if(cbMedmas.isChecked()) info += cbMedmas.getText().toString() +"\n";
                tvHasil.setText("Selamat Anda Telah Terdaftar!\n\n " +
                        "Berikut data diri anda:\n" +
                        "Nama              :   " + etNama.getText() +"\n" +
                        "Gender            :   " + gender +"\n" +
                        "Alamat            :   " + etAlamat.getText()+"\n" +
                        "Pekerjaan         :   " + spKerja.getSelectedItem().toString() +"\n" +
                        "Mengenal CISC dari: \n" + info );
            }
        });
    }
}
