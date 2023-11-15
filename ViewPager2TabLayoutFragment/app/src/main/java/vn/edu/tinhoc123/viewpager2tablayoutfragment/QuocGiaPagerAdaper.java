package vn.edu.tinhoc123.viewpager2tablayoutfragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class QuocGiaPagerAdaper  extends FragmentStateAdapter {
    List<QuocGia> quocGiaList;

    public QuocGiaPagerAdaper(@NonNull FragmentActivity fragmentActivity, List<QuocGia> _dataSource ) {
        super(fragmentActivity);
        quocGiaList = _dataSource;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        QuocGia quocGiaX = quocGiaList.get(position);
        QuocGiaFragment quocGiaFragment = new QuocGiaFragment(quocGiaX);
        return quocGiaFragment;
    }

    @Override
    public int getItemCount() {
        return quocGiaList.size();
    }
}
