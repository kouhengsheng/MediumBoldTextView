package com.yao.textview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import androidx.annotation.Nullable
import androidx.appcompat.widget.AppCompatTextView


/**
 * 字体粗细为中粗的textView
 * Created by kou on 2020/4/16.
 */
class MediumBoldTextView : AppCompatTextView {
    var strokeWidth: Float = 0.9F

    constructor(context: Context) : this(context, null) {}
    constructor(context: Context, @Nullable attrs: AttributeSet?) : this(context, attrs, 0) {}
    constructor(context: Context, @Nullable attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        val arr = context.obtainStyledAttributes(attrs, R.styleable.MediumBoldTextView, defStyleAttr, 0)
        strokeWidth = arr.getFloat(R.styleable.MediumBoldTextView_strokeWidth, 0.9F)
        arr.recycle()
    }

    override fun onDraw(canvas: Canvas?) {
        //获取当前控件的画笔
        val paint = paint
        //设置画笔的描边宽度值
        paint.strokeWidth = strokeWidth
        paint.style = Paint.Style.FILL_AND_STROKE
        super.onDraw(canvas)
    }

}