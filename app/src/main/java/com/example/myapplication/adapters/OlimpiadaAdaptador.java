package com.example.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.models.Olimpiada;

import java.util.List;

public class OlimpiadaAdaptador extends ArrayAdapter<Olimpiada> {
    Context context;
    private class ViewHolder {
        TextView phone;
        TextView nickname;

        private ViewHolder() {
        }
    }
    public OlimpiadaAdaptador(Context context, List<Olimpiada> items) {
        super(context, 0, items);
        this.context = context;
    }
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        final Olimpiada rowItem = (Olimpiada) getItem(position);
        LayoutInflater mInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_olimpiada, null);
            holder = new ViewHolder();
            holder.phone = (TextView) convertView.findViewById(R.id.nombre);
            holder.nickname = (TextView) convertView.findViewById(R.id.descripcion);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.phone.setText(rowItem.nombre);
        holder.nickname.setText(rowItem.descripcion);
        return convertView;
    }
}
