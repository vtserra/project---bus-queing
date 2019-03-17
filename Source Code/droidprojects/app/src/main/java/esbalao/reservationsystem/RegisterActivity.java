package esbalao.reservationsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button button = (Button) findViewById(R.id.button_register);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(myIntent);
                Toast.makeText(RegisterActivity.this, "Registered Successfully!", Toast.LENGTH_SHORT).show();
            }
        });

        //user_id
        final EditText et1 = (EditText) findViewById(R.id.student_email);
        //user_name
        final EditText et11 = (EditText) findViewById(R.id.student_name);
        final EditText et22 = (EditText) findViewById(R.id.employee_name);
        //user_email
        final EditText et111 = (EditText) findViewById(R.id.student_email);
        final EditText et222 = (EditText) findViewById(R.id.employee_email);
        //user
        final EditText et1111 = (EditText) findViewById(R.id.student_password);
        final EditText et2222 = (EditText) findViewById(R.id.employee_password);
        //register button
        final Button reg = (Button) findViewById(R.id.button_register);

        //RADIO GROUP
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.usergroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.studentRadio){
                    et1.setVisibility(View.VISIBLE);
                    et11.setVisibility(View.VISIBLE);
                    et111.setVisibility(View.VISIBLE);
                    et1111.setVisibility(View.VISIBLE);
                    reg.setVisibility(View.VISIBLE);
                    et22.setVisibility(View.INVISIBLE);
                    et222.setVisibility(View.INVISIBLE);
                    et2222.setVisibility(View.INVISIBLE);
                } else {
                    et22.setVisibility(View.VISIBLE);
                    et222.setVisibility(View.VISIBLE);
                    et2222.setVisibility(View.VISIBLE);
                    reg.setVisibility(View.VISIBLE);
                    et1.setVisibility(View.INVISIBLE);
                    et11.setVisibility(View.INVISIBLE);
                    et111.setVisibility(View.INVISIBLE);
                    et1111.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
    }







