package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200f, 100f, 800f, 500f, 180, 40, false, paint);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200f, 100f, 800f, 500f, -20, -100, true, paint);
        canvas.drawArc(200f, 100f, 800f, 500f, 20, 140, false, paint);
    }
}
