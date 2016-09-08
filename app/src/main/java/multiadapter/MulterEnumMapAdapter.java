package multiadapter;


import java.util.ArrayList;
import java.util.List;

import recyclerviewmultipleviewtypesadapter.EnumMapBindAdapter;

/**
 * @author: JiangWeiwei
 * @time: 2016/4/25-17:43
 * @email: jiangweiwei@qccr.com
 * @desc:
 */
public class MulterEnumMapAdapter extends EnumMapBindAdapter<MulterEnumMapAdapter.ViewType> {


    enum ViewType {
        BIG_BANNER,
        SAMLL_BANNER,
        HALF_GRID,
        SECONDTH_GRID,
        FORTH_GRID;
    }

    public MulterEnumMapAdapter() {
        List<String> path = new ArrayList<>();
        path.add("http://img0.imgtn.bdimg.com/it/u=2545179197,2573899739&fm=116&gp=0.jpg");
        path.add("http://img0.imgtn.bdimg.com/it/u=2545179197,2573899739&fm=116&gp=0.jpg");
        path.add("http://img0.imgtn.bdimg.com/it/u=2545179197,2573899739&fm=116&gp=0.jpg");
        path.add("http://img0.imgtn.bdimg.com/it/u=2545179197,2573899739&fm=116&gp=0.jpg");
//        path.add("http://img0.imgtn.bdimg.com/it/u=2545179197,2573899739&fm=116&gp=0.jpg");
        putBinder(ViewType.BIG_BANNER, new BannerBinder(this, new GoodsVo()));
        putBinder(ViewType.HALF_GRID, new HalfGridBinder(this, path));
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    @Override
    public ViewType getEnumFromPosition(int position) {
        switch (position) {
            case 0:
                return ViewType.BIG_BANNER;
            case 1:
                return ViewType.HALF_GRID;
            case 6:
                return ViewType.BIG_BANNER;
            default:
                return ViewType.HALF_GRID;
        }
//        return ViewType.HALF_GRID;
    }

    @Override
    public ViewType getEnumFromOrdinal(int ordinal) {
        return ViewType.values()[ordinal];
    }

    public int getSpanSize(int position) {
        switch (position) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 6:
                return 2;
            default:
                return 1;
        }
    }

}
