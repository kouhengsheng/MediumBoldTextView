package com.yao.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import com.kou.text.EmojiMediumTextView
import com.kou.text.MediumBoldTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 主要的使用方法在布局文件里。
        // 主要的代码在lib_textview这个模块里，
        // 可以把lib_textview导入到你自己的项目里，即可使用，也可以把MediumBoldTextView类，还有attr.xml复制到你的项目里来使用

        val standardTextView = findViewById<TextView>(R.id.standardTextView) // 正常粗细的textView
        val mediumTextView = findViewById<MediumBoldTextView>(R.id.mediumTextView) // 中粗的textView
        val boldTextView = findViewById<TextView>(R.id.boldTextView) // 粗体的textView
        val emojiTextView = findViewById<EmojiMediumTextView>(R.id.emojiTextView) // 可以显示emoji表情的中粗的textView
        val tvCustom = findViewById<MediumBoldTextView>(R.id.tvCustom) // 可以自己改变粗细的textView
        val editText = findViewById<EditText>(R.id.editText)
        tvCustom.setStrokeWidth(0.1F)

        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(editable: Editable?) {
                val str = editable.toString()
                standardTextView.text = str
                mediumTextView.text = str
                boldTextView.text = str
                emojiTextView.text = str
                tvCustom.text = str
            }
        })
    }
}