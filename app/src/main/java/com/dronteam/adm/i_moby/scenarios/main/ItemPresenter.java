package com.dronteam.adm.i_moby.scenarios.main;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.dronteam.adm.i_moby.model.Item;

/**
 * Created by adm on 14.11.2016.
 */
public class ItemPresenter {
    ItemView view;
    Item item;
    private Context context;

    public ItemPresenter(Context context, Item item) {
        this.context = context;
        this.view = new ItemFragment(context);
        this.item = item;
        this.view.setEditListener(edit());
    }

    private View.OnClickListener edit() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
    }

    public ItemView getView() {
        return view;
    }

    public void fill(){
        view.setText(item.getTitle(), item.description, item.price.text);
    }

}
