package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.net.PasswordAuthentication;

public class Practice3DrawRectView extends View {

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRect() 方法画矩形
        Rect rect = new Rect();
        rect.top = 100;
        rect.left = 100;
        rect.bottom = 300;
        rect.right = 300;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(rect, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setARGB(100, 50, 50, 50);
        canvas.drawRect(320, 100, 520, 300, paint);
    }
}
