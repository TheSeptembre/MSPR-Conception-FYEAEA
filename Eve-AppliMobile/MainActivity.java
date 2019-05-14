package epsi.mspr.calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView showResult;

    EditText tx_remise_achat_net;
    EditText tx_remise_achat_brut;
    Button btn_tx_remise;

    EditText coef_multi_vente_net;
    EditText coef_multi_achat_net;
    Button btn_coef_multi;

    EditText achat_net_achat_brut;
    EditText achat_net_tx_remise;
    Button btn_achat_net;

    EditText vente_net_achat_net;
    EditText vente_net_coef_multi;
    Button btn_vente_net;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showResult = (TextView) findViewById(R.id.result_text_view);

        btn_tx_remise = (Button)findViewById(R.id.go_tx_remise);
        tx_remise_achat_net   = (EditText)findViewById(R.id.tx_remise_achat_net);
        tx_remise_achat_brut   = (EditText)findViewById(R.id.tx_remise_achat_brut);

        btn_tx_remise.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Log.v("EditText", tx_remise_achat_brut.getText().toString());

                        Number calculus = (1- Double.parseDouble(tx_remise_achat_net.getText().toString()) / Double.parseDouble(tx_remise_achat_brut.getText().toString()))*100;
                        String.format("%.2f", calculus);
                        showResult.setText(calculus.toString());
                    }
                });
    }
}