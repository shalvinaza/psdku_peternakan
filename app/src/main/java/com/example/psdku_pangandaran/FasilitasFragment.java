package com.example.psdku_pangandaran;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import static com.example.psdku_pangandaran.R.id.image_slider2;
import static com.example.psdku_pangandaran.R.id.image_slider3;
import static com.example.psdku_pangandaran.R.id.image_slider4;
import static com.example.psdku_pangandaran.R.id.image_slider5;
import static com.example.psdku_pangandaran.R.id.image_slider6;
import static com.example.psdku_pangandaran.R.id.image_slider7;
import static com.example.psdku_pangandaran.R.layout.fragment_fasilitas;

public class FasilitasFragment extends Fragment {
    SliderView sliderView, sliderView2, sliderView3, sliderView4,sliderView5,sliderView6;
    int[] images = {R.drawable.keamanan1,
            R.drawable.keamanan2,
            R.drawable.keamanan3};
    int[] images2 = {R.drawable.akademik1,
            R.drawable.akademik2,
            R.drawable.akademik3};
    int[] images3 = {R.drawable.kelas1,
            R.drawable.kelas2,
            R.drawable.kelas3};
    int[] images4 = {R.drawable.perpus1,
            R.drawable.perpus2,
            R.drawable.perpus3};
    int[] images5 = {R.drawable.lab1,
            R.drawable.lab2,
            R.drawable.lab3};
    int[] images6 = {R.drawable.lab_pen1,
            R.drawable.lab_pen2,
            R.drawable.lab_pen3};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fasilitas = inflater.inflate(fragment_fasilitas,container,false);
        sliderView = fasilitas.findViewById(image_slider2);
        sliderView2 = fasilitas.findViewById(image_slider3);
        sliderView3 = fasilitas.findViewById(image_slider4);
        sliderView4 = fasilitas.findViewById(image_slider5);
        sliderView5 = fasilitas.findViewById(image_slider6);
        sliderView6 = fasilitas.findViewById(image_slider7);

        SliderAdapter sliderAdapter = new SliderAdapter(images);
        SliderAdapter sliderAdapter2 = new SliderAdapter(images2);
        SliderAdapter sliderAdapter3 = new SliderAdapter(images3);
        SliderAdapter sliderAdapter4 = new SliderAdapter(images4);
        SliderAdapter sliderAdapter5 = new SliderAdapter(images5);
        SliderAdapter sliderAdapter6 = new SliderAdapter(images6);


        sliderView.setSliderAdapter(sliderAdapter);
        sliderView2.setSliderAdapter(sliderAdapter2);
        sliderView3.setSliderAdapter(sliderAdapter3);
        sliderView4.setSliderAdapter(sliderAdapter4);
        sliderView5.setSliderAdapter(sliderAdapter5);
        sliderView6.setSliderAdapter(sliderAdapter6);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView2.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView3.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView4.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView5.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView6.setIndicatorAnimation(IndicatorAnimationType.WORM);

        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView2.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView3.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView4.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView5.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView6.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);

        sliderView.startAutoCycle();
        sliderView2.startAutoCycle();
        sliderView3.startAutoCycle();
        sliderView4.startAutoCycle();
        sliderView5.startAutoCycle();
        sliderView6.startAutoCycle();

        return fasilitas;
    }
}
