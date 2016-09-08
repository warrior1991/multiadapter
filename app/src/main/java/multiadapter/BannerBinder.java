package multiadapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.user.multiadaptertest.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import recyclerviewmultipleviewtypesadapter.DataBindAdapter;
import recyclerviewmultipleviewtypesadapter.DataBinder;


/**
 * @author: JiangWeiwei
 * @time: 2016/4/25-17:57
 * @email: jiangweiwei@qccr.com
 * @desc:
 */
public class BannerBinder extends DataBinder<BannerBinder.ViewHolder> {
    private GoodsVo mPurchaseHomeVO;

    public BannerBinder(DataBindAdapter dataBindAdapter, GoodsVo temp) {
        super(dataBindAdapter);
        this.mPurchaseHomeVO = temp;
    }

    @Override
    public ViewHolder newViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment_img2, null);
        return new ViewHolder(view);
    }

    @Override
    public void bindViewHolder(ViewHolder holder, int position) {
        holder.iv.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getSpanSize() {
        return 2;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.iv_comment)
        ImageView iv;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
