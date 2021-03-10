# SlideButton
A simple, yet awesome sliding button for Android.

[![](https://jitpack.io/v/com.queensherainfotech/SlideButton.svg)](https://jitpack.io/#com.queensherainfotech/SlideButton)

Project level gradle
------
```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```


App level gradle
------
```
dependencies {
    ...
    implementation 'com.queensherainfotech:SlideButton:1.0.0'
}
```

Usage
-----
```xml
<com.queensherainfotech.slidebuttonlibrary.SlideView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/slideView"
        android:layout_marginVertical="8sp"
        android:layout_marginHorizontal="16sp"
        android:layout_centerVertical="true"
        app:buttonBackgroundColor="#ffffff"
        app:buttonImage="@drawable/ic_chevron_double_right"
        app:slideBackgroundColor="#3f51b5"
        app:slideText="Get started"
        app:slideTextSize="16sp"
        app:slideTextColor="#ffffff" />
```
### Attributes information

|Attribute name|Description|Default value|
|:-:|:-:|:-:|
|slideBackgroundColor|The slide background color| `#3F51B5` |
|buttonBackgroundColor|The slide button background color| `#FFFFFF`|
|slideTextColor|The color of the slide label |`#FFFFFF`|
|buttonImage|The drawable on the button | double chevron icon |
|slideText|The slide label| `none` |
|slideTextSize|The label's size| 16sp |
|animateSlideText|If `true`, the label fades out while the slide is in progress| `true` |
|strokeColor|If set, a stroke is drawn around the slide background | `none` |
|reverseSlide|If `true`, the SlideView is reversed | `false` |
|buttonImageDisabled| The drawable to be used as the button image when the SlideView is disabled| the default drawable|

Note: All color attributes can be replaced with a `ColorStateList` so the SlideView can use the appropriate colors for the enabled and disabled states. See the sample module for examples.


```java
SlideView slideView = findViewById(R.id.slideView);

slideView.setOnSlideCompleteListener(new SlideView.OnSlideCompleteListener() {
    @Override
    public void onSlideComplete(SlideView slideView) {
        Toast.makeText(MainActivity.this, "Slide Complete", Toast.LENGTH_SHORT).show();
    }
});
```

### Setting the view attributes via code

For convenience, many of the SlideView attributes can be set via code.

```java
 // set the label
 setText(CharSequence text);

 // set the text size
 setTextSize(int size);

 // set the drawable for the button
 setButtonImage(Drawable image);

 // set the label color
 setTextColor(@ColorInt int color) ;

 // set the label color with a ColorStateList
 setTextColor(ColorStateList colors);

 // set the button drawable for disabled state
 setButtonImageDisabled(Drawable image);

 // set the button background color
 setButtonBackgroundColor(ColorStateList color);

 // set the slide background color
 setSlideBackgroundColor(ColorStateList color);

```
