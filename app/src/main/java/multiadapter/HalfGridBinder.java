package multiadapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.user.multiadaptertest.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import recyclerviewmultipleviewtypesadapter.DataBindAdapter;
import recyclerviewmultipleviewtypesadapter.DataBinder;


/**
 * @author: JiangWeiwei
 * @time: 2016/4/25-18:45
 * @email: jiangweiwei@qccr.com
 * @desc:
 */
public class HalfGridBinder extends DataBinder<HalfGridBinder.ViewHolder> {

    private List<String> mPurchaseHomeVO;

    public HalfGridBinder(DataBindAdapter dataBindAdapter, List<String> temp) {
        super(dataBindAdapter);
        mPurchaseHomeVO = temp;
    }

    @Override
    public ViewHolder newViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment_img, null);
        return new ViewHolder(view);
    }

    @Override
    public void bindViewHolder(ViewHolder holder, int position) {
        holder.iv.setImageResource(R.mipmap.ic_launcher);
    }


    @Override
    public int getItemCount() {
        return mPurchaseHomeVO.size();
    }

    @Override
    public int getSpanSize() {
        return 1;
    }

//    static final class ViewHolder extends RecyclerView.ViewHolder {
//        @Bind(R.id.recycler_view)
//        RecyclerView recyclerView;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            ButterKnife.bind(this, itemView);
//        }
//    }

    static final class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.iv_comment)
        ImageView iv;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }



    //    private class GoodsAdapter extends RecyclerView.Adapter<GoodsViewHolder> {
//        @Override
//        public GoodsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment_img, null);
//            return new GoodsViewHolder(view);
//        }
//
//        @Override
//        public void onBindViewHolder(GoodsViewHolder holder, int position) {
//            PicassoUtil.loadImage(holder.itemView.getContext(), mPurchaseHomeVO.getGoods().get(position).getImage(),
//                    holder.iv);
//
//        }
//
//        @Override
//        public int getItemCount() {
//            return mPurchaseHomeVO.getGoods().size();
//        }
//    }
}
