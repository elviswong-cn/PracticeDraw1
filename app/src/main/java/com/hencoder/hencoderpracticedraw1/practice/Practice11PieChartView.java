package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 所有扇形 半径一样
        int radius = 300;
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint();
        // L
        paint.setColor(Color.RED);
        canvas.drawArc(100, 100, 700, 700, -184, 108, true, paint);

        //K
        paint.setColor(Color.BLUE);
        canvas.drawArc(120, 120, 720, 720, -184, -100.8f, true, paint);

        //J
        paint.setColor(Color.GREEN);
        canvas.drawArc(120, 120, 720, 720, -72f, 64.8f, true, paint);

        // I
        paint.setColor(Color.GRAY);
        canvas.drawArc(120, 120, 720, 720, -8f, 13.5f, true, paint);

        // G
        paint.setColor(Color.CYAN);
        canvas.drawArc(120, 120, 720, 720, 6f, 10.3f, true, paint);

        // F
        paint.setColor(Color.MAGENTA);
        canvas.drawArc(120, 120, 720, 720, 17f, 6.5f, true, paint);

        // M
        paint.setColor(Color.YELLOW);
        canvas.drawArc(120, 120, 720, 720, 25f, 50.5f, true, paint);
    }
}
