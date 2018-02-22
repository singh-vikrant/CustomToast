package com.example.vikrantsingh.customtoast;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShowToast("Toast generated SuccessFully");
            }
        }); }

       public void ShowToast(String message){
        View toastview=getLayoutInflater().inflate(R.layout.toast,(ViewGroup)findViewById(R.id.linear));
        TextView t1=toastview.findViewById(R.id.text1);
        t1.setText(message);

        Toast toast=new Toast(this);
        toast.setView(toastview);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.FILL_HORIZONTAL,0,0);
        toast.show();
       }


}
