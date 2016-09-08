package multiadapter;


import java.util.ArrayList;
import java.util.List;

import recyclerviewmultipleviewtypesadapter.EnumListBindAdapter;

/**
 * @author: JiangWeiwei
 * @time: 2016/4/26-10:16
 * @email: jiangweiwei@qccr.com
 * @desc:
 */
public class MulterEnumListAdapter extends EnumListBindAdapter<MulterEnumListAdapter.ViewType> {
    enum ViewType {
        BIG_BANNER,
        SAMLL_BANNER,
        HALF_GRID,
        SECONDTH_GRID,
        FORTH_GRID,
        VIEWPAGER;
    }

    public MulterEnumListAdapter() {
        List<String> path = new ArrayList<>();
        path.add("http://img0.imgtn.bdimg.com/it/u=2545179197,2573899739&fm=116&gp=0.jpg");
        path.add("http://img0.imgtn.bdimg.com/it/u=2545179197,2573899739&fm=116&gp=0.jpg");
        path.add("http://img0.imgtn.bdimg.com/it/u=2545179197,2573899739&fm=116&gp=0.jpg");
//        path.add("http://img0.imgtn.bdimg.com/it/u=2545179197,2573899739&fm=116&gp=0.jpg");
        addAllBinder(new HalfGridBinder(this, path),
                new BannerBinder(this, null),
                new HalfGridBinder(this, path),
                new ViewPagerBinder(this),
                new HalfGridBinder(this, path),
                new ViewPagerBinder(this));
    }

    public int getSpanSize(int position) {
        return getDataBinder(getItemViewType(position)).getSpanSize();
    }
}
