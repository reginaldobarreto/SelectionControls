package br.com.barrsoft.selectioncontrols;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.switchControl)
    SwitchCompat switchCompat;
    @BindView(R.id.checkBoxControl)
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),R.string.checkOn,Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),R.string.checkOff,Toast.LENGTH_LONG).show();
                }
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),R.string.checkOn,Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),R.string.checkOff,Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
