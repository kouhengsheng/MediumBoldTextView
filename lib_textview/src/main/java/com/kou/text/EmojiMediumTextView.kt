package com.kou.text

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import androidx.annotation.Nullable
import androidx.appcompat.widget.AppCompatTextView


/**
 * 可以展示emoji表情的字体粗细为中粗的textView
 * MediumBoldText无法显示某些emoji表情
 * 想要正常显示emoji表情，又想要中粗字体请使用EmojiMediumTextView，但是EmojiMediumTextView的字体粗细已经非常接近于粗体了，虽然比粗体略微细一点，但是在很多安卓手机上肉眼都看不出两种的粗细差别。
 * Created by kou on 2022/4/27.
 */
class EmojiMediumTextView : AppCompatTextView {
    constructor(context: Context) : this(context, null) {}
    constructor(context: Context, @Nullable attrs: AttributeSet?) : this(context, attrs, 0) {}
    constructor(context: Context, @Nullable attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
    }

    override fun onDraw(canvas: Canvas?) {
        // 获取当前控件的画笔
        val paint = paint
        // 设置为伪粗体，之所以叫伪粗体，因为它并不是使用更高weight的字体让文字变粗，而是通过程序在运行时把文字给描粗了
        paint.isFakeBoldText = true
        super.onDraw(canvas)
    }
}