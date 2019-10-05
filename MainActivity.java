package com.example.feedbackform;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {


    private AutoCompleteTextView  phno;
      private AutoCompleteTextView  email;
      private AutoCompleteTextView write;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner=findViewById(R.id.spinnername);

        phno= this.<AutoCompleteTextView>findViewById(R.id.phno);
        email=this.<AutoCompleteTextView>findViewById(R.id.email);
        write=this.<AutoCompleteTextView>findViewById(R.id.write);


        ArrayAdapter<CharSequence>adapter= ArrayAdapter.createFromResource(this,R.array.reasons,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        //setting the display on click content












    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text=parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();





    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    /**this button will be invoked when  a button is clicked and button's onclick method is  btnshowsaved
     *
     * @param view
     */
    public void btnshowsaved(View view) {
//get the details of user enterd.
        final String phnumber = phno.getText().toString();
        final String emailid = email.getText().toString();
        final String writeup = write.getText().toString();



        Toast.makeText(this,"phnumber: "+phno,Toast.LENGTH_SHORT).show();
Toast.makeText(this,"emailid:"+email,Toast.LENGTH_SHORT).show();
Toast.makeText(this,"writeup:"+write,Toast.LENGTH_SHORT).show();

    }
}
