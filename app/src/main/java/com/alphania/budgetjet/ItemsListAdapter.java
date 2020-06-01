package com.alphania.budgetjet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ItemsListAdapter extends RecyclerView.Adapter<ItemsListAdapter.ItemViewHolder> {
    public List<Product> mItems;
    private Context mContext;


    public ItemsListAdapter(List<Product> mItems, Context mContext) {
        this.mItems = mItems;
        this.mContext = mContext;
    }
    @Override
    public ItemsListAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ItemViewHolder viewHolder = new ItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ItemsListAdapter.ItemViewHolder holder, int position) {
        holder.bindItem(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.itemImageView) ImageView mItemImageView;
        @BindView(R.id.priceRangeTextView) TextView mPriceRangeTextView;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
        @BindView(R.id.sellersTextView) TextView mSellersTextView;

        private Context mContext;

        public ItemViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            mContext = view.getContext();
            view.setOnClickListener((View.OnClickListener) this);
        }

        public void bindItem(Product product) {
        }
    }
}
