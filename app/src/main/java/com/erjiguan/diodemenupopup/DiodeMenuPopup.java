package com.erjiguan.diodemenupopup;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.PopupMenu;

// TODO 主要是为了封装背景变暗，制定viewgroup变暗的功能
public class DiodeMenuPopup extends PopupMenu {

    public DiodeMenuPopup(@NonNull Context context, @NonNull View anchor) {
        super(context, anchor);
    }
}
