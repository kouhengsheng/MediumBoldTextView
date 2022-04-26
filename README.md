#中粗字体MediumBoldTextView
##项目背景：公司的UI要求使用中粗字体来显示标题，一般来讲，Android的TextView只有正常粗细、还有加粗两种状态，根本没有什么中粗，但是ios是有中粗字体的。没办法只有自定义了，实现思路是把给textView加描边，让textView的粗细比正常粗细要粗一点，但又比粗体字要细一点，满足UI的要求。
##如果无法下载GitHub上的代码，可以试试码云的代码，链接如下https://gitee.com/ykkssk/MediumBoldTextView
##继承自AppCompatTextView，和普通的TextView的使用方法完全一样，只是把字体粗细改为中粗。
##如果无法下载代码，可以把MediumBoldTextView这个类，还有attr.xml复制到自己的项目中即可使用。
##本项目是用kotlin写的，如果需要转成Java，只需要把MediumBoldTextView这个类改成Java就可以了。