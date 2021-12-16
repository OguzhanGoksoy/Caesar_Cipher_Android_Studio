package com.example.metinifrelemeprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText Yazılanyazı;
    EditText sifre;
    EditText kaydırmasaı;
    String txtF1;
   Button bt,btcz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) (findViewById(R.id.button));
        btcz = (Button) (findViewById(R.id.button2));
        Yazılanyazı = (EditText) findViewById(R.id.etSecretKey);
        kaydırmasaı = (EditText) findViewById(R.id.etSecretKey2);
        sifre = (EditText) findViewById(R.id.etSecretKey3);

        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str = BuildConfig.FLAVOR;
                String alfabe = "abcçdefgğhıijklmnoöprsştuüvyzwqx0123456789 ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZWQX";
                String cipher = str;
                String str2 = str;
                String sifreli = str;
                try {
                    MainActivity.this.txtF1 = MainActivity.this.Yazılanyazı.getText().toString();
                    int kss = Integer.valueOf(String.valueOf(MainActivity.this.kaydırmasaı.getText())).intValue();
                    int ks=0;


                    int sayac=0;
                    for (int i=0;i<txtF1.length();i++) {

                        sayac++;
                    }
                    for (int i=1;i<61;i++) {

                        for (int j=1;j<99;j++) {
                            ks = kss * j+i*j-i+22+sayac;
                        }

                    }

                    for (int i = ks; i < ks + 75; i++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(cipher);
                        sb.append(alfabe.charAt(i % 75));
                        cipher = sb.toString();
                    }
                    String metin = MainActivity.this.txtF1;
                    int uzunluk = metin.length();
                    for (int j = 0; j < uzunluk; j++) {
                        for (int j2 = 0; j2 < 75; j2++) {
                            if (metin.charAt(j) == alfabe.charAt(j2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(sifreli);
                                sb2.append(alfabe.charAt((j2 + ks) % 75));
                                sifreli = sb2.toString();
                            }
                        }
                    }
                    MainActivity.this.sifre.setText(sifreli.toString());
                    MainActivity.this.Yazılanyazı.setText(str);
                    MainActivity.this.kaydırmasaı.setText(str);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Lütfen Sayı ve Kelime Giriniz", Toast.LENGTH_LONG).show();

                }
            }
        });
        btcz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str = BuildConfig.FLAVOR;
                String alfabe = "XQWZYVÜUTŞSRPÖONMLKJİIHĞGFEDÇCBA 9876543210xqwzyvüutşsrpöonmlkjiıhğgfedçcba";
                String cipher = str;
                String str2 = str;
                String sifreli = str;
                try {
                    MainActivity.this.txtF1 = MainActivity.this.Yazılanyazı.getText().toString();
                    int kss = Integer.valueOf(String.valueOf(MainActivity.this.kaydırmasaı.getText())).intValue();
                    int ks=0;

                    int sayac=0;
                    for (int i=0;i<txtF1.length();i++) {

                        sayac++;
                    }
                    for (int i=1;i<61;i++) {

                        for (int j=1;j<99;j++) {
                            ks = kss * j+i*j-i+22+sayac;
                        }

                    }

                    for (int i = ks; i < ks + 75; i++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(cipher);
                        sb.append(alfabe.charAt(i % 75));
                        cipher = sb.toString();
                    }
                    String metin = MainActivity.this.txtF1;
                    int uzunluk = metin.length();
                    for (int j = 0; j < uzunluk; j++) {
                        for (int j2 = 0; j2 < 75; j2++) {
                            if (metin.charAt(j) == alfabe.charAt(j2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(sifreli);
                                sb2.append(alfabe.charAt((j2 + ks) % 75));
                                sifreli = sb2.toString();
                            }
                        }
                    }
                    MainActivity.this.sifre.setText(sifreli.toString());
                    MainActivity.this.Yazılanyazı.setText(str);
                    MainActivity.this.kaydırmasaı.setText(str);

                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Lütfen Sayı ve Kelime Giriniz", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
