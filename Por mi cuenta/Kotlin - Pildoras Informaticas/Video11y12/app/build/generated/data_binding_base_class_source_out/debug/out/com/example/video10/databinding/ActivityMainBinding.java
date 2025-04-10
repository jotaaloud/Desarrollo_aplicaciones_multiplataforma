// Generated by view binder compiler. Do not edit!
package com.example.video10.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.video10.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final Button btn1;

  @NonNull
  public final Button btnMinus;

  @NonNull
  public final Button btnPlus;

  @NonNull
  public final EditText et1;

  @NonNull
  public final TextView tv1;

  private ActivityMainBinding(@NonNull CoordinatorLayout rootView, @NonNull Button btn1,
      @NonNull Button btnMinus, @NonNull Button btnPlus, @NonNull EditText et1,
      @NonNull TextView tv1) {
    this.rootView = rootView;
    this.btn1 = btn1;
    this.btnMinus = btnMinus;
    this.btnPlus = btnPlus;
    this.et1 = et1;
    this.tv1 = tv1;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn1;
      Button btn1 = ViewBindings.findChildViewById(rootView, id);
      if (btn1 == null) {
        break missingId;
      }

      id = R.id.btnMinus;
      Button btnMinus = ViewBindings.findChildViewById(rootView, id);
      if (btnMinus == null) {
        break missingId;
      }

      id = R.id.btnPlus;
      Button btnPlus = ViewBindings.findChildViewById(rootView, id);
      if (btnPlus == null) {
        break missingId;
      }

      id = R.id.et1;
      EditText et1 = ViewBindings.findChildViewById(rootView, id);
      if (et1 == null) {
        break missingId;
      }

      id = R.id.tv1;
      TextView tv1 = ViewBindings.findChildViewById(rootView, id);
      if (tv1 == null) {
        break missingId;
      }

      return new ActivityMainBinding((CoordinatorLayout) rootView, btn1, btnMinus, btnPlus, et1,
          tv1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
