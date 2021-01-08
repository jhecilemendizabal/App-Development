package com.example.loginregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
android:gravity="center">

<TextView
android:text="Username"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:id="@+id/text1"/>
<EditText
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:id="@+id/edit1"/>

<TextView
android:text="Password"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:id="@+id/text2"/>
<EditText
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:id="@+id/edit2"/>

<Button
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Log In"
android:id="@+id/but1"/>

</LinearLayout>