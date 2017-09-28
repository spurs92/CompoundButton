package com.spurs.compoundbuttonex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn;

    EditText editText1,editText2,editText3,editText4;

    ArrayList<String> datas=new ArrayList<>();
    ListView listView;
    ArrayAdapter adapter;

    RadioButton radioButton1,radioButton2,radioButton3,radioButton4,radioButton5;

    String r1="",r2="", r3="", r4="", r5="", r6="", r7="", r8="", r9="";

    CheckBox checkBox1,checkBox2,checkBox3,checkBox4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn_01);

        editText1=(EditText)findViewById(R.id.edit_01);
        editText2=(EditText) findViewById(R.id.editText2);
        editText3=(EditText) findViewById(R.id.editText3);
        editText4=(EditText) findViewById(R.id.editText4);

        listView=(ListView) findViewById(R.id.text_08);

        radioButton1=(RadioButton)findViewById(R.id.rbtn_01);
        radioButton2=(RadioButton)findViewById(R.id.rbtn_02);
        radioButton3=(RadioButton)findViewById(R.id.rbtn_03);
        radioButton4=(RadioButton)findViewById(R.id.rbtn_04);
        radioButton5=(RadioButton)findViewById(R.id.rbtn_05);

        checkBox1=(CheckBox)findViewById(R.id.checkbox_01);
        checkBox2=(CheckBox)findViewById(R.id.checkbox_02);
        checkBox3=(CheckBox)findViewById(R.id.checkbox_03);
        checkBox4=(CheckBox)findViewById(R.id.checkbox_04);

        adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,datas);

        listView.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText1.getText().toString();
                String s1=editText2.getText().toString();
                String s2=editText3.getText().toString();
                String s3=editText4.getText().toString();

                String s5=s +" "+r1+" "+r2+" "+r3+" "+r4+" "+r5+" "+s1+"-"+s2+"-"+s3+" "+r6+" "+r7+" "+r8+" "+r9;
                datas.add(s5);

                adapter.notifyDataSetChanged();
                listView.setSelection(datas.size()-1);
            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length()==3) editText3.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length()==4) editText4.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void onRadioButtonClicked(View v){
        boolean checked = ((RadioButton)v).isChecked();
        switch (v.getId()){
            case R.id.rbtn_01:
                if(checked) {
                    r1=radioButton1.getText().toString();
                }else r1="";
                break;
            case R.id.rbtn_02:
                if(checked) {
                    r2=radioButton2.getText().toString();
                }else r2="";
                break;
            case R.id.rbtn_03:
                if(checked) {
                    r3=radioButton3.getText().toString();
                }else r3="";
                break;
            case R.id.rbtn_04:
                if(checked) {
                    r4=radioButton4.getText().toString();
                }else r4="";
                break;
            case R.id.rbtn_05:
                if(checked) {
                    r5=radioButton5.getText().toString();
                }else r5="";
                break;
        }
    }

    public void onCheckBoxClicked(View v){
        boolean checked = ((CheckBox)v).isChecked();
        switch (v.getId()){
            case R.id.checkbox_01:
                if(checked) {
                    r6=checkBox1.getText().toString();
                }else r6="";
                break;
            case R.id.checkbox_02:
                if(checked) {
                    r7=checkBox2.getText().toString();
                }else r7="";
                break;
            case R.id.checkbox_03:
                if(checked) {
                    r8=checkBox3.getText().toString();
                }else r8="";
                break;
            case R.id.checkbox_04:
                if(checked) {
                    r9=checkBox4.getText().toString();
                }else r9="";
                break;
        }
    }

}
