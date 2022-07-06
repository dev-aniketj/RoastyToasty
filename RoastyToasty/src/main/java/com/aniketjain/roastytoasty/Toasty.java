package com.aniketjain.roastytoasty;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;


public class Toasty extends ToastyColors {
    private static Toast toast;
    private static View view;
    private static CardView toastyCardView;
    private static LinearLayout toastyLinearLayout;
    private static ImageView toastyImageView;
    private static TextView toastyTextView;
    private static ToastyColors colors;

    private static void createToast(Context context) {
        toast = new Toast(context);
    }

    @SuppressLint("InflateParams")
    private static void createView(Context context) {
        view = LayoutInflater.from(context).inflate(R.layout.toasty_layout, null, false);
        findViews(view);
    }

    private static void setUpWidthHeight(int toastyWidth, int toastyHeight) {
        ViewGroup.LayoutParams params = toastyLinearLayout.getLayoutParams();
        params.width = toastyWidth;
        params.height = toastyHeight;
        toastyLinearLayout.setLayoutParams(params);
    }

    private static void setUpTextView(int textSize, String textColor) {
        toastyTextView.setTextSize(textSize);
        toastyTextView.setTextColor(Color.parseColor(textColor));
    }

    private static void findViews(View view) {
        toastyCardView = view.findViewById(R.id.toasty_cardView);
        toastyLinearLayout = view.findViewById(R.id.toasty_LinearLayout);
        toastyImageView = view.findViewById(R.id.toasty_imageView);
        toastyTextView = view.findViewById(R.id.toasty_textView);
    }

    private static void basicSetup(String message, int drawable, String backgroundColor) {
        toastyLinearLayout.setBackgroundColor(Color.parseColor(backgroundColor));
        toastyImageView.setBackgroundResource(drawable);
        toastyTextView.setText(message);
    }

    public static void normal(Context context, String message) {
        custom(context, message, 17);
    }

    public static void success(Context context, String message) {
        custom(context, message, R.drawable.ic_baseline_done_24, colors.SUCCESS_COLOR, 17, colors.TEXT_COLOR);
    }

    public static void error(Context context, String message) {
        custom(context, message, R.drawable.ic_baseline_error_outline_24, colors.ERROR_COLOR, 17, colors.TEXT_COLOR);
    }

    public static void warning(Context context, String message) {
        custom(context, message, R.drawable.ic_baseline_warning_24, colors.WARNING_COLOR, 17, colors.TEXT_COLOR);
    }

    //    DEFAULT (GRAVITY, DURATION, TEXT SIZE AND TEXT COLOR))
    public static void custom(Context context, String message) {
        createToast(context);
        createView(context);

        toastyImageView.setVisibility(View.GONE);
        toastyTextView.setText(message);

        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);  //default
        toast.show();
    }

    public static void custom(Context context, String message, int textSize) {
        createToast(context);
        createView(context);

        toastyImageView.setVisibility(View.GONE);
        toastyTextView.setText(message);
        toastyTextView.setTextSize(textSize);

        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    public static void custom(Context context, String message, int gravity, int duration) {
        createToast(context);
        createView(context);

        toastyImageView.setVisibility(View.GONE);
        toastyTextView.setText(message);

        toast.setView(view);
        toast.setGravity(gravity, 0, 0);
        toast.setDuration(duration);
        toast.show();
    }

    //    NORMAL (GRAVITY, DURATION)
    public static void custom(Context context, String message, int drawable, String backgroundColor) {
        createToast(context);
        createView(context);

        basicSetup(message, drawable, backgroundColor);

        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);   //default
        toast.show();
    }

    public static void custom(Context context, String message, int duration, int drawable, String backgroundColor) {
        createToast(context);
        createView(context);

        basicSetup(message, drawable, backgroundColor);

        toast.setView(view);
        toast.setDuration(duration);    //added
        toast.show();
    }

    public static void custom(Context context, String message, int gravity, int duration, int drawable, String backgroundColor) {
        createToast(context);
        createView(context);

        basicSetup(message, drawable, backgroundColor);

        toast.setView(view);
        toast.setGravity(gravity, 0, 0);    //added
        toast.setDuration(duration);
        toast.show();
    }

    //    TEXT SIZE, TEXT COLOR (GRAVITY, DURATION)
    public static void custom(Context context, String message, int drawable, String backgroundColor, int textSize, String textColor) {
        createToast(context);
        createView(context);

        basicSetup(message, drawable, backgroundColor);

        //added
        setUpTextView(textSize, textColor);

        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    public static void custom(Context context, String message, int duration, int drawable, String backgroundColor, int textSize, String textColor) {
        createToast(context);
        createView(context);

        basicSetup(message, drawable, backgroundColor);

        //added
        setUpTextView(textSize, textColor);

        toast.setView(view);
        toast.setDuration(duration);
        toast.show();
    }

    public static void custom(Context context, String message, int gravity, int duration, int drawable, String backgroundColor, int textSize, String textColor) {
        createToast(context);
        createView(context);

        basicSetup(message, drawable, backgroundColor);

        //added
        setUpTextView(textSize, textColor);

        toast.setView(view);
        toast.setGravity(gravity, 0, 0);
        toast.setDuration(duration);
        toast.show();
    }

    //    WIDTH, HEIGHT (GRAVITY, DURATION, TEXT SIZE AND TEXT COLOR)
    public static void custom(Context context, String message, int drawable, String backgroundColor, int toastyWidth, int toastyHeight) {
        createToast(context);
        createView(context);

        basicSetup(message, drawable, backgroundColor);

        //added
        setUpWidthHeight(toastyWidth, toastyHeight);

        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);  //default
        toast.show();
    }

    public static void custom(Context context, String message, int gravity, int duration, int drawable, String backgroundColor, int toastyWidth, int toastyHeight) {
        createToast(context);
        createView(context);

        basicSetup(message, drawable, backgroundColor);

        //added
        setUpWidthHeight(toastyWidth, toastyHeight);

        toast.setView(view);
        toast.setGravity(gravity, 0, 0);
        toast.setDuration(duration);
        toast.show();
    }

    public static void custom(Context context, String message, int drawable, String backgroundColor, int textSize, String textColor, int toastyWidth, int toastyHeight) {
        createToast(context);
        createView(context);

        basicSetup(message, drawable, backgroundColor);

        setUpTextView(textSize, textColor);

        //added
        setUpWidthHeight(toastyWidth, toastyHeight);

        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);  //default
        toast.show();
    }

    public static void custom(Context context, String message, int gravity, int duration, int drawable, String backgroundColor, int textSize, String textColor, int toastyWidth, int toastyHeight) {
        createToast(context);
        createView(context);

        basicSetup(message, drawable, backgroundColor);

        setUpTextView(textSize, textColor);

        //added
        setUpWidthHeight(toastyWidth, toastyHeight);

        toast.setView(view);
        toast.setGravity(gravity, 0, 0);
        toast.setDuration(duration);
        toast.show();
    }
}