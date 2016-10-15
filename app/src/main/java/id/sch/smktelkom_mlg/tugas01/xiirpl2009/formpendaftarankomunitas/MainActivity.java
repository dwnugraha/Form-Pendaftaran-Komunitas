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
    EditText etNama,etIden,etTL,etAlamat,etMail;
    Spinner spKerja;
    Button btOK;
    TextView tvHasil;
    CheckBox cbMedsos,cbTeman,cbMedmas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.editTextNama);
        etIden = (EditText) findViewById(R.id.editTextIdentitas);
        etTL   = (EditText) findViewById(R.id.editTextTL);
        etAlamat = (EditText) findViewById(R.id.editTextAlamat);
        etMail = (EditText) findViewById(R.id.editTextMail);
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

                String info = null;
                int startlen = info.length();
                if(cbMedsos.isChecked()) info = cbMedsos.getText().toString();
                if(cbTeman.isChecked()) info = cbTeman.getText().toString();
                if(cbMedmas.isChecked()) info = cbMedmas.getText().toString();
                if(info.length()==startlen) info = "Tidak ada pada pilihan";

                tvHasil.setText("Selamat Anda Telah Terdaftar!\n\n " +
                        "Berikut data diri anda:\n" +
                        "Nama           :   " + etNama.getText() +"\n" +
                        "No.Identitas   :   " + etIden.getText() + "\n" +
                        "Gender         :   " + gender +"\n" +
                        "Tanggal Lahir  :   " + etTL.getText() + "\n" +
                        "Alamat         :   " + etAlamat.getText()+"\n" +
                        "E-mail         :   " + etMail.getText()+"\n" +
                        "Pekerjaan      :   " + spKerja.getSelectedItem().toString() +"\n" +
                        "Mengenal CISC dari " + info +"\n" );
            }
        });
    }
}
