package com.kou.text

import android.content.Context
import android.graphics.Paint
import android.text.SpannableStringBuilder
import android.util.AttributeSet
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.appcompat.widget.AppCompatTextView


/**
 * 字体粗细为中粗的textView
 * Created by kou on 2020/4/16.
 */
open class MediumBoldTextView : AppCompatTextView {
    private var mStrokeWidth: Float = 0.9F
    private var mMaxLength: Int = 0

    constructor(context: Context) : this(context, null)
    constructor(context: Context, @Nullable attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, @Nullable attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        val arr = context.obtainStyledAttributes(attrs, R.styleable.MediumBoldTextView, defStyleAttr, 0)
//        字体线条的描边粗细
        mStrokeWidth = arr.getFloat(R.styleable.MediumBoldTextView_strokeWidth, 0.9F)
//        最大字符串长度，超过这个长度后显示省略号
        mMaxLength = arr.getInt(R.styleable.MediumBoldTextView_mediumMaxLength, 0)
        paint.apply {
            // 设置画笔的描边宽度值
            strokeWidth = mStrokeWidth
            style = Paint.Style.FILL_AND_STROKE
        }
        arr.recycle()
    }

    override fun setText(text: CharSequence?, type: TextView.BufferType?) {
        if (mMaxLength != 0 && !text.isNullOrEmpty()) {
            if (text.length > mMaxLength) {
                val sBuilder = SpannableStringBuilder(text.subSequence(0, mMaxLength)).append("...")
                super.setText(sBuilder, type)
                return
            }
        }
        super.setText(text, type)
    }

    // 设置字体粗细程度
    fun setStrokeWidth(value: Float) {
        paint.apply {
            strokeWidth = value
            style = Paint.Style.FILL_AND_STROKE
        }

        invalidate()
    }
}