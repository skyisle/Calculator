package com.alanjeon.calculator.app;

import android.content.Context;

import java.text.DecimalFormat;

/**
 * Created by skyisle on 2/20/14.
 */
public class ResultFormatter {
    private Context context;
    private DecimalFormat decimalFormatter;

    public ResultFormatter(Context context) {
        this.context = context;
    }

    public String format(long input) {
        if (decimalFormatter == null) {
            decimalFormatter = new DecimalFormat(context.getString(R.string.number_format));
        }
        return decimalFormatter.format(input);
    }
}
