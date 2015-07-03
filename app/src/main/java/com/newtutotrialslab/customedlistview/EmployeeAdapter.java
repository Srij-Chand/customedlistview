package com.newtutotrialslab.customedlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Srijan on 03-Jul-15.
 */
public class EmployeeAdapter extends ArrayAdapter<Employee> {
    private LayoutInflater inflater;
    public EmployeeAdapter(Context context, List<Employee> objects) {
        super(context,(R.layout.employee_item), objects);
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.employee_item,parent, false);
        TextView nameTv=(TextView)view.findViewById(R.id.nameTv);
        TextView addressTv=(TextView)view.findViewById(R.id.addressTv);
        TextView ageTv=(TextView)view.findViewById(R.id.ageTv);
        Employee e= getItem(position);
        nameTv.setText(e.getName());
        addressTv.setText(e.getAddress());
        ageTv.setText(e.getAge()+"");
        return view;
    }
}
