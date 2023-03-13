package com.example.ruschaikki.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.ruschaikki.ModelViewPager;
import com.example.ruschaikki.ModelViewPagerAdapter;
import com.example.ruschaikki.R;
import com.example.ruschaikki.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    ViewPager viewPager;
    ModelViewPagerAdapter modelViewPagerAdapter;

    List<ModelViewPager> modelViewPagerList;


    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        modelViewPagerList = new ArrayList<>();
        initiali();

        modelViewPagerAdapter = new ModelViewPagerAdapter(modelViewPagerList,getContext());

        viewPager = binding.viewPager1;
        viewPager.setAdapter(modelViewPagerAdapter);
        viewPager.setPadding(130,0,130,0);



        return root;
    }

    private void initiali() {

        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 1. ЭПОХА ПРОСВЕЩЕНИЯ","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 2. АНГЛИЙСКОЕ ПРОСВЕЩЕНИЕ.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 3. ДАНИЕЛЬ ДЕФО.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 4. ДЖОНАТАНА СВИФТ.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 5. ПЕРИОД ЗРЕЛОГО ПРОСВЕЩЕНИЯ В АНГЛИИ.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 6. СЕНТИМЕНТАЛИЗМ. ТВОРЧЕСТВО СТЕРНА.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 7. ФРАНЦУЗСКАЯ ЛИТЕРАТУРА XVIII ВЕКА.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 8. ФРАНЦУЗСКИЙ РОМАН ПЕРВОЙ ПОЛОВИНЫ XVIII В.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 9. ПЬЕР ОГЮСТЕН КАРОН БОМАРШЕ.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 10. ФРАНЦУЗСКАЯ ФИЛОСОФСКАЯ ПРОЗА. ЭНЦИКЛОПЕДИСТЫ.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 11. ТВОРЧЕСТВО ЖАН-ЖАКА РУССО. РУССОИЗМ.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 12. ИТАЛЬЯНСКАЯ ЛИТЕРАТУРА XVIII ВЕКА.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 13. НЕМЕЦКАЯ ЛИТЕРАТУРА ПРОСВЕЩЕНИЯ. ЛЕССИНГ.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 14. ДВИЖЕНИЕ «БУРЯ И НАТИСК». ШИЛЛЕР.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тема 15. НЕМЕЦКАЯ ЛИТЕРАТУРА ПРОСВЕЩЕНИЯ. ИОГАНН ВОЛЬФГАНГ ГЁТЕ","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Тесты","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.a10,"Глоссарий","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XVIII ВЕКА","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/muqqadima.pdf"));




    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}