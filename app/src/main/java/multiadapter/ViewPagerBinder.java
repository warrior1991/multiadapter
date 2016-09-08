package multiadapter;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
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
 * @time: 2016/4/27-14:55
 * @email: jiangweiwei@qccr.com
 * @desc:
 */
public class ViewPagerBinder extends DataBinder<ViewPagerBinder.ViewHolder> {
    public ViewPagerBinder(DataBindAdapter dataBindAdapter) {
        super(dataBindAdapter);
    }

    @Override
    public ViewHolder newViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewpager, null);
        return new ViewHolder(view);
    }

    @Override
    public void bindViewHolder(ViewHolder holder, int position) {
        holder.viewpager.setAdapter(new MyPageAdapter());
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    @Override
    public int getSpanSize() {
        return 2;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.viewpager)
        ViewPager viewpager;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    final class MyPageAdapter extends PagerAdapter {
        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView iv = new ImageView(container.getContext());
            iv.setImageResource(R.drawable.ic_jianpan);
            container.addView(iv);
            return iv;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            if (object instanceof View) {
                container.removeView((View) object);
            }
            object = null;
        }
    }
}
