package com.example.postocidade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ViewHolder mViewHolder = new ViewHolder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.mViewHolder.edit_real = this.findViewById(R.id.edit_real);
        this.mViewHolder.text_gasolina = this.findViewById(R.id.text_gasolina);
        this.mViewHolder.text_alcool = this.findViewById(R.id.text_alcool);
        this.mViewHolder.button_calcular = this.findViewById(R.id.button_calcular);

        // limpa os valores iniciais
        this.clearValues();


        // adicionando o evento de click no elemento
        this.mViewHolder.button_calcular.setOnClickListener(this);
    }

    private void clearValues() {
        this.mViewHolder.text_gasolina.setText("");
        this.mViewHolder.text_alcool.setText("");
    }

    @Override
    public void onClick(View view){
        if(view.getId()== R.id.button_calcular){

            String value = this.mViewHolder.edit_real.getText().toString();

            if("".equals(value)) {
                Toast.makeText(this, "informe um valor!", Toast.LENGTH_LONG).show();
            }else{
                Double real = Double.valueOf(value);

                this.mViewHolder.text_gasolina.setText(String.format("%.2f", real * 5.60));
                this.mViewHolder.text_alcool.setText(String.format("%.2f", real * 4.50));
            }

        }
    }

    private static class ViewHolder {

        private EditText edit_real;
        private TextView text_gasolina;
        private TextView text_alcool;
        private Button button_calcular;


    }

}