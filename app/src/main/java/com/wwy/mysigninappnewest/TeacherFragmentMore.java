package com.wwy.mysigninappnewest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TeacherFragmentMore extends Fragment {
    @Nullable
    @Override
    // 生成对应tab页视图
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.teacher_fragment_more, container, false);
    }
}
