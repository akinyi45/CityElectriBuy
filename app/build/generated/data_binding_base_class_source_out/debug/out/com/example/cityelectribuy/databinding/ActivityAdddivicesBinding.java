// Generated by view binder compiler. Do not edit!
package com.example.cityelectribuy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cityelectribuy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdddivicesBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnChooseImage;

  @NonNull
  public final Button btnUploadImage;

  @NonNull
  public final ImageView imagePreview;

  @NonNull
  public final EditText mEdtColor;

  @NonNull
  public final EditText mEdtModel;

  @NonNull
  public final EditText mEdtPrice;

  @NonNull
  public final EditText mEdtRegNo;

  private ActivityAdddivicesBinding(@NonNull ScrollView rootView, @NonNull Button btnChooseImage,
      @NonNull Button btnUploadImage, @NonNull ImageView imagePreview, @NonNull EditText mEdtColor,
      @NonNull EditText mEdtModel, @NonNull EditText mEdtPrice, @NonNull EditText mEdtRegNo) {
    this.rootView = rootView;
    this.btnChooseImage = btnChooseImage;
    this.btnUploadImage = btnUploadImage;
    this.imagePreview = imagePreview;
    this.mEdtColor = mEdtColor;
    this.mEdtModel = mEdtModel;
    this.mEdtPrice = mEdtPrice;
    this.mEdtRegNo = mEdtRegNo;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdddivicesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdddivicesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_adddivices, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdddivicesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_choose_image;
      Button btnChooseImage = ViewBindings.findChildViewById(rootView, id);
      if (btnChooseImage == null) {
        break missingId;
      }

      id = R.id.btn_upload_image;
      Button btnUploadImage = ViewBindings.findChildViewById(rootView, id);
      if (btnUploadImage == null) {
        break missingId;
      }

      id = R.id.image_preview;
      ImageView imagePreview = ViewBindings.findChildViewById(rootView, id);
      if (imagePreview == null) {
        break missingId;
      }

      id = R.id.mEdtColor;
      EditText mEdtColor = ViewBindings.findChildViewById(rootView, id);
      if (mEdtColor == null) {
        break missingId;
      }

      id = R.id.mEdtModel;
      EditText mEdtModel = ViewBindings.findChildViewById(rootView, id);
      if (mEdtModel == null) {
        break missingId;
      }

      id = R.id.mEdtPrice;
      EditText mEdtPrice = ViewBindings.findChildViewById(rootView, id);
      if (mEdtPrice == null) {
        break missingId;
      }

      id = R.id.mEdtRegNo;
      EditText mEdtRegNo = ViewBindings.findChildViewById(rootView, id);
      if (mEdtRegNo == null) {
        break missingId;
      }

      return new ActivityAdddivicesBinding((ScrollView) rootView, btnChooseImage, btnUploadImage,
          imagePreview, mEdtColor, mEdtModel, mEdtPrice, mEdtRegNo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
