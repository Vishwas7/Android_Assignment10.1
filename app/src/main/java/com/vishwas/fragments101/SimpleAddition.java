package com.vishwas.fragments101;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SimpleAddition extends Fragment {

    //declaration of variables
    EditText edtNum;
    Button click;
    TextView txtView;

    /**
     * implementing the onCreateView() to provide a layout for a fragment..
     * @param inflater
     * @param container- is important in order for the system to apply layout
     *                   parameters to the root view of the inflated layout, specified
     *                   by the parent view in which it's going.
     * @param savedInstanceState-parameter is a Bundle that provides data
     *                          about the previous instance of the fragment
     * @return- View this is the root of fragment's layout.
     */
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main, container, false);
        edtNum = (EditText) view.findViewById(R.id.fragmentEditText);

        click = (Button) view.findViewById(R.id.fragmentButton);
        txtView = (TextView) view.findViewById(R.id.textV);
        /**
         * this methods creates setOnClickListener() event..
         */
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // in here getting String for edtNum
                String enter=edtNum.getText().toString();
                //setting the text
                txtView.setText(enter);
                Toast.makeText(getActivity(),"Swing In Text",Toast.LENGTH_SHORT).show();
            }
        });
        // returning View this is the root of fragment's layout.
        return view;

    }

}


