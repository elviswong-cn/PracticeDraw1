package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        float[] lines = {100f, 100f, 100f, 600f, 100f, 600f, 940f, 600f};
        paint.setARGB(255, 255, 255, 255);
        canvas.drawLines(lines, paint);
        paint.setTextSize(60);
        canvas.drawText("直方图", 470f, 800f, paint);

        // 1
        paint.setTextSize(24);
        paint.setColor(Color.WHITE);
        canvas.drawText("Froyo", 120f, 624f, paint);
        canvas.drawText("GB", 260f, 624f, paint);
        canvas.drawText("ICS", 380f, 624f, paint);
        canvas.drawText("JB", 500f, 624f, paint);
        canvas.drawText("KITKAT", 600f, 624f, paint);
        canvas.drawText("L", 770f, 624f, paint);
        canvas.drawText("M", 890f, 624f, paint);


        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(5);
        canvas.drawLine(120f, 599f, 220f, 600f, paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(240f, 540f, 340f, 600f, paint);
        canvas.drawRect(360f, 540f, 460f, 600f, paint);
        canvas.drawRect(480f, 420f, 580f, 600f, paint);
        canvas.drawRect(600f, 300f, 700f, 600f, paint);
        canvas.drawRect(720f, 240f, 820f, 600f, paint);
        canvas.drawRect(840f, 450f, 940f, 600f, paint);
    }
}
