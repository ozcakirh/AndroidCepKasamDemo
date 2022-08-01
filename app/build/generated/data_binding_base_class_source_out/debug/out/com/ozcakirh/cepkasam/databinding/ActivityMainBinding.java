// Generated by view binder compiler. Do not edit!
package com.ozcakirh.cepkasam.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ozcakirh.cepkasam.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnkaydet;

  @NonNull
  public final EditText edbelgeno;

  @NonNull
  public final EditText edharcamakategori;

  @NonNull
  public final EditText edharcamatutari;

  @NonNull
  public final EditText edislemtarihi;

  @NonNull
  public final TextView tvgoster;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnkaydet,
      @NonNull EditText edbelgeno, @NonNull EditText edharcamakategori,
      @NonNull EditText edharcamatutari, @NonNull EditText edislemtarihi,
      @NonNull TextView tvgoster) {
    this.rootView = rootView;
    this.btnkaydet = btnkaydet;
    this.edbelgeno = edbelgeno;
    this.edharcamakategori = edharcamakategori;
    this.edharcamatutari = edharcamatutari;
    this.edislemtarihi = edislemtarihi;
    this.tvgoster = tvgoster;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
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
      id = R.id.btnkaydet;
      Button btnkaydet = ViewBindings.findChildViewById(rootView, id);
      if (btnkaydet == null) {
        break missingId;
      }

      id = R.id.edbelgeno;
      EditText edbelgeno = ViewBindings.findChildViewById(rootView, id);
      if (edbelgeno == null) {
        break missingId;
      }

      id = R.id.edharcamakategori;
      EditText edharcamakategori = ViewBindings.findChildViewById(rootView, id);
      if (edharcamakategori == null) {
        break missingId;
      }

      id = R.id.edharcamatutari;
      EditText edharcamatutari = ViewBindings.findChildViewById(rootView, id);
      if (edharcamatutari == null) {
        break missingId;
      }

      id = R.id.edislemtarihi;
      EditText edislemtarihi = ViewBindings.findChildViewById(rootView, id);
      if (edislemtarihi == null) {
        break missingId;
      }

      id = R.id.tvgoster;
      TextView tvgoster = ViewBindings.findChildViewById(rootView, id);
      if (tvgoster == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnkaydet, edbelgeno,
          edharcamakategori, edharcamatutari, edislemtarihi, tvgoster);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
