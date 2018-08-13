package fr.asgardit.carnemento;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PrincipesAdapter extends RecyclerView.Adapter<PrincipesAdapter.ViewHolder> {

    private String[] datas;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cv;
        private TextView mTextView;
        public ViewHolder(View itemView) {
            super(itemView);

            mTextView = (TextView)itemView.findViewById(R.id.item_lib);
        }
    }

    public PrincipesAdapter(String[] datas) {
        this.datas = datas;
    }



    @Override
    public PrincipesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText((position+1) +". " + datas[position]);

    }

    @Override
    public int getItemCount() {
        return datas.length;
    }
}
