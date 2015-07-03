package com.newtutotrialslab.customedlistview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    private ListView listView;
    private List<Employee> employeeList;
    private EmployeeAdapter employeeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        employeeList=new ArrayList<Employee>();
        employeeList.add(new Employee("harish",6,"KTM"));
        employeeList.add(new Employee("satya",9,"newroad"));
        employeeList.add(new Employee("srijan",16,"balkumari"));
        employeeAdapter =new EmployeeAdapter(getApplicationContext(),employeeList);
        listView.setAdapter(employeeAdapter);

    }
}