package com.example.shree.myapplication5;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by comp on 05-03-2018.
 */

public class HomeFragment extends Fragment {
    GridView gridView;
    String[] values = {
            "Health", "Education", "Employment", "Safety","Welfare","Finance","Labour","Justice","Family"
    };
    int[] images = {
            R.drawable.health,
            R.drawable.edu,
            R.drawable.emp,
            R.drawable.safety,
            R.drawable.wellfare,
            R.drawable.finance,
            R.drawable.labor,
            R.drawable.justice,
            R.drawable.family


    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_home,container,false);
        gridView = (GridView) v.findViewById(R.id.gridview);
      //  GridAdapter gridAdapter = new GridAdapter(this,values,images);
        //gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent i;

                if (position == 0) {
                    i=new Intent(getActivity(),HealthSchemes.class);
                    i.putExtra("cat_id",position);
                    startActivity(i);
                }
                else if (position == 1) {
                    i = new Intent(getActivity(), HealthSchemes.class);
                    i.putExtra("cat_id", position);
                    startActivity(i);
                }
                else if (position == 2) {
                    i = new Intent(getActivity(), HealthSchemes.class);
                    i.putExtra("cat_id", position);
                    startActivity(i);
                }
                else if (position == 3) {
                    i = new Intent(getActivity(), HealthSchemes.class);
                    i.putExtra("cat_id", position);
                    startActivity(i);
                }
                else if (position == 4) {
                    i = new Intent(getActivity(), HealthSchemes.class);
                    i.putExtra("cat_id", position);
                    startActivity(i);
                }
                else if (position == 5) {
                        i = new Intent(getActivity(), HealthSchemes.class);
                        i.putExtra("cat_id", position);
                        startActivity(i);
                }
                else if (position == 6) {
                        i = new Intent(getActivity(), HealthSchemes.class);
                        i.putExtra("cat_id", position);
                        startActivity(i);
                }
                else if (position == 7) {
                        i = new Intent(getActivity(), HealthSchemes.class);
                        i.putExtra("cat_id", position);
                        startActivity(i);
                    }
                else if (position == 8) {
                        i = new Intent(getActivity(), HealthSchemes.class);
                        i.putExtra("cat_id", position);
                        startActivity(i);
                    }
                }

        });


        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {



    }
}