package com.qrhealthcare;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Abhi on 24-06-2017.
 */

public class Tab3Profile extends Fragment {
   // FloatingActionButton AddEvent;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3_profile, container, false);


/**        AddEvent = (FloatingActionButton) view.findViewById(R.id.addevents);
        AddEvent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getActivity(), "FAB Button Clicked", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(Tab2Events.this.getContext(), EditProfileActivity.class);
                //startActivity(intent);


            }
        });  **/
        return view;
    }
}

