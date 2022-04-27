# 中粗字体MediumBoldTextView
&nbsp;
## 项目背景：公司的UI要求使用中粗字体来显示标题，一般来讲，Android的TextView只有正常粗细、还有加粗两种状态，根本没有什么中粗，但是ios是有中粗字体的。没办法只有自定义了，实现思路是把给textView加描边，让textView的粗细比正常粗细要粗一点，但又比粗体字要细一点，满足UI的要求。
&nbsp;
##  ![显示效果](https://github.com/kouhengsheng/MediumBoldTextView/blob/master/img.png)
## 如果无法下载GitHub上的代码，可以试试码云的代码，链接如下https://gitee.com/ykkssk/MediumBoldTextView
&nbsp;
## 继承自AppCompatTextView，和普通的TextView的使用方法完全一样，只是把字体粗细改为中粗。
&nbsp;
## 如果无法下载代码，可以把MediumBoldTextView这个类，还有attr.xml复制到自己的项目中即可使用。
&nbsp;
## 本项目是用kotlin写的，如果需要转成Java，只需要把MediumBoldTextView这个类改成Java就可以了。
&nbsp;
## 通过设置setFakeBoldText为true来实现中粗效果，在很多安卓手机上效果不明显。虽然是比设置为粗体时细一点点，但是在很多安卓手机上都看不出来。
&nbsp;
Android开发中经常会遇到设置显示文字加粗，关于加粗的集中方式做了如下整理：

方式1；在XML布局中设置加粗

android:textStyle="bold"

方式2；在代码中通过TextPaint设置

TextPaint paint=tv.getPaint();

paint.setFakeBoldText(true);

方式3：在代码中通过Typeface设置

tv.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));

或者

tv.setTypeface(Typeface.DEFAULT_BOLD);

方式4：在代码中通过Paint设置

tv.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);

tv.getPaint().setStrokeWidth(0.7f);

方式4可以自定义粗体的线条粗细来达到这种UI效果，实现要多粗有多粗，但是这种方法有些emoji表情无法显示。想要正常显示emoji表情，又想要中粗字体请使用EmojiMediumTextView，但是EmojiMediumTextView的字体粗细已经非常接近于粗体了，虽然比粗体略微细一点，但是在很多安卓手机上肉眼都看不出两种的粗细差别。
