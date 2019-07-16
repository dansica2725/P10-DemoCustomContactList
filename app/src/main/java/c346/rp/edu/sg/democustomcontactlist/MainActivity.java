package c346.rp.edu.sg.democustomcontactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView contactsLv;
    ArrayList<Contact> contactsList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsLv = findViewById(R.id.contactsLv);
        contactsList = new ArrayList<>();

        contactsList.add(new Contact("Mary", 65, 65442334, 'F'));
        contactsList.add(new Contact("Ken", 65, 97442437, 'M'));

        adapter = new CustomAdapter(MainActivity.this, R.layout.row, contactsList);
        contactsLv.setAdapter(adapter);

    }
}
