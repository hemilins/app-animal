package br.ufsc.tic.appanimal;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

public class RegistrarActivity extends AppCompatActivity {

    private static final String MASK_TELEFONE = "(NN) N NNNN-NNNN";
    private static final String MASK_CNPJ = "NN.NNN.NNN/NNNN-NN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        TextInputEditText cnpjText = findViewById(R.id.cnpj);
        TextInputEditText razaoSocialText = findViewById(R.id.razao_social);
        TextInputEditText emailText = findViewById(R.id.email);
        TextInputEditText telefoneText = findViewById(R.id.telefone);
        TextInputEditText enderecoText = findViewById(R.id.endereco);

        // Máscara do telefone
        SimpleMaskFormatter smfTelefone = new SimpleMaskFormatter(MASK_TELEFONE);
        MaskTextWatcher mtwTelefone = new MaskTextWatcher(telefoneText , smfTelefone);
        telefoneText.addTextChangedListener(mtwTelefone);

        // Máscara do CNPJ
        SimpleMaskFormatter smf_Cnpj = new SimpleMaskFormatter(MASK_CNPJ);
        MaskTextWatcher mtwCnpj = new MaskTextWatcher(cnpjText , smf_Cnpj);
        cnpjText.addTextChangedListener(mtwCnpj);
    }
}
