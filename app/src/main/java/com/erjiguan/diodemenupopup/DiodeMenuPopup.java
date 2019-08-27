package com.erjiguan.diodemenupopup;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.PopupMenu;

public class DiodeMenuPopup extends PopupMenu {

    public DiodeMenuPopup(@NonNull Context context, @NonNull View anchor) {
        super(context, anchor);
    }

    public void dimBackground(final float fromDimValue, final float toDimValue, final Window window) {
        ValueAnimator valueAnimator = ValueAnimator.ofFloat(fromDimValue, toDimValue);
        valueAnimator.setDuration(200);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                WindowManager.LayoutParams params = window.getAttributes();
                params.alpha = (Float) animation.getAnimatedValue();
                window.setAttributes(params);
            }
        });

        valueAnimator.start();
    }
}
