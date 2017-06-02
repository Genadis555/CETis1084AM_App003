package mx.edu.cetis108.cetis1084am_app003;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    EditText EtxNum1, EtxNum2;
    Button btnAceptar;
    TextView TVtext1, TVnum2, TVnum1, TVresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EtxNum1=(EditText)findViewById(R.id.EtxtNum1);
        EtxNum2=(EditText)findViewById(R.id.EtxtNum2);
        btnAceptar=(Button)findViewById(R.id.btnAceptar);
        TVtext1=(TextView)findViewById(R.id.TVtex1);
        TVnum1=(TextView)findViewById(R.id.TVnum1);
        TVnum2=(TextView)findViewById(R.id.TVnum2);
        TVresult=(TextView)findViewById(R.id.TVresult);
    }
    public void Aceptar(View v)
    {
        int n1=Integer.parseInt(EtxNum1.getText().toString());
        int n2=Integer.parseInt(EtxNum2.getText().toString());
        if (n1>n2)
        {
            int resultado=n1-n2;
            TVresult.setText(String.valueOf(resultado));
            TVtext1.setText(n1+" es mayor que "+n2);
        }
        if (n1<n2)
        {
            int resultado=n1+n2;
            TVresult.setText(String.valueOf(resultado));
            TVtext1.setText(n2+" es mayor que "+n1);
        }
        if (n1==n2)
        {
            TVresult.setText("Es igual");
            TVtext1.setText("       ");
        }
    }
}
