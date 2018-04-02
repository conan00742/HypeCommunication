package krot.sample.com.meshchatandroid.broadcast.plain_text.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Krot on 4/2/18.
 */

//TODO 6: adapter cho RecyclerView ở đây, layout cho từng cell đã có rồi (device_item.xml)
public class PlainTextMessageAdapter extends RecyclerView.Adapter<PlainTextMessageAdapter.PlainTextViewHolder> {


    @NonNull
    @Override
    public PlainTextViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PlainTextViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    //VIEW HOLDER
    class PlainTextViewHolder extends RecyclerView.ViewHolder {

        //TODO 7: khai báo hết các Views của device_item.xml ở đây (2 cái TextView)

        public PlainTextViewHolder(View itemView) {
            super(itemView);

            //TODO 8: findViewById ở đây
        }
    }
}
