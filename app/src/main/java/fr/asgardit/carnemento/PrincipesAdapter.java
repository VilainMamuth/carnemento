package fr.asgardit.carnemento;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class PrincipesAdapter extends RecyclerView.Adapter<PrincipesAdapter.ViewHolder> {

    private String[] datas;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mTextView;
        public ViewHolder(TextView itemView) {
            super(itemView);
            mTextView = itemView;
        }
    }

    public PrincipesAdapter(String[] datas) {
        this.datas = datas;
    }



    @Override
    public PrincipesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(datas[position]);

    }

    @Override
    public int getItemCount() {
        return datas.length;
    }
}
