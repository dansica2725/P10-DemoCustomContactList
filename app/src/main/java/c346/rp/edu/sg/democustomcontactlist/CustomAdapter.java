package c346.rp.edu.sg.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context mContext;
    int layout_id;
    ArrayList<Contact> contactsList;
    LayoutInflater inflater;

    public CustomAdapter(Context context, int layout_id, ArrayList<Contact> contactsList) {
        super(context, layout_id, contactsList);

        this.mContext = context;
        this.contactsList = contactsList;
        this.layout_id = layout_id;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(layout_id, null);

        TextView nameTv, codeTv, numTv;
        ImageView genderIv;

        nameTv = convertView.findViewById(R.id.nameTv);
        codeTv = convertView.findViewById(R.id.countryCodeTv);
        numTv = convertView.findViewById(R.id.phoneNumTv);
        genderIv = convertView.findViewById(R.id.genderIv);

        Contact currentItem = contactsList.get(position);

        nameTv.setText(currentItem.getName());
        codeTv.setText("+" + currentItem.getCountryCode());
        numTv.setText(currentItem.getPhoneNum()+"");

        if (currentItem.getGender() == 'F') {
            genderIv.setImageResource(R.drawable.female);
        }
        else {
            genderIv.setImageResource(R.drawable.male);
        }

        return convertView;
    }
}
